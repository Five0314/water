package com.repository;


import com.domain.entity.DbAccount;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * class
 *
 * @author Five
 * @date create in 上午10:39 2017/12/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableCaching
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void loginTest(){
        this.accountService.login("1","1");
    }

    @Test
    public void changePasswordTest(){

    }
}
