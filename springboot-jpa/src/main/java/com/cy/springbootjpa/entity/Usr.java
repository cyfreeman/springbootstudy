package com.cy.springbootjpa.entity;

import javax.persistence.*;

//告诉jpa这是一个实体类（和数据表映射的类
@Entity
@Table(name = "tbl_user")
public class Usr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name = "last_name", length = 50)//和数据表对应的一个列
    private String lastName;
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
