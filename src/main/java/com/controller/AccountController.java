package com.controller;

import com.domain.DbAccount;
import com.service.AccountService;
import com.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // = @Controller + @ResponseBody
//@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/login")
    public ResponseResult login(@RequestParam(value = "account") String a,
                           @RequestParam(value = "password") String p){
        DbAccount account = accountService.accountInfo(a);

        if (account == null){
            return ResponseResult.error(1);
        }

        if (!account.getPassword().equals(p)){
            return ResponseResult.error(2);
        }

        return ResponseResult.success(account);
    }

    @PostMapping(value = "/register")
    public ResponseResult register(@RequestParam(value = "account") String a,
                                   @RequestParam(value = "password") String p,
                                   @RequestParam(value = "uid") String uid){

        DbAccount iv = accountService.register(a, p, uid);

        return ResponseResult.success(iv);
    }

    @PostMapping(value = "/changepassword")
    public ResponseResult changePassword(@RequestParam(value = "uid") String uid,
                                         @RequestParam(value = "oldpassword") String op,
                                         @RequestParam(value = "newpassword") String np){

        DbAccount iv = accountService.accountInfoByUid(uid);

        if (iv.getPassword().equals(op)){
            Integer rv = accountService.changePassword(np, iv.getId(), iv);
            if (rv == 0){
                return ResponseResult.error(4, "密码修改失败");
            }

            return ResponseResult.success();
        }
        else{
            return ResponseResult.error(3, "密码错误");
        }
    }

}
