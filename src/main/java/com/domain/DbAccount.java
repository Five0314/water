package com.domain;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 账号类
 *
 * @author Five
 * @date create in 下午2:29 2017/11/30
 */

@Entity
@Table(name = "account")
public class DbAccount {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(updatable = false)
    private String uid;

    @Column(length = 64, nullable = true, updatable = false)
    private String account;

    @Column(length = 64, nullable = true)
    private String password;

    private Integer status;

    @Column(updatable = false)
    private Date createtime;

    public DbAccount() {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
