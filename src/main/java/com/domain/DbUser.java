package com.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 用户类
 *
 * @author Five
 * @date create in 下午2:30 2017/11/30
 */

@Entity
@Table(name = "user")
public class DbUser {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 32)
    private String uid;

    @Column(length = 64, nullable = true)
    private String realname;

    @Column(length = 64, nullable = true)
    private String nickname;

    private Integer gender;

    @Column(nullable = true)
    private Timestamp birthday;

    @Column(length = 11, nullable = true)
    private String phone;

    @Column(length = 64, nullable = true)
    private String email;

    private Integer status;

    @Column(updatable = false)
    private Timestamp createtime;

    /**
     * 构造函数
     */
    public DbUser() {
    }
}
