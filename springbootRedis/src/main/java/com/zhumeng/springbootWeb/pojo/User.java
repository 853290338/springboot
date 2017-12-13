package com.zhumeng.springbootWeb.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 * 用户
 */
@Entity
@Table(name = "s_user")
public class User implements Serializable {

    private static final long serialVersionUID = -1809440023346629783L;

    @Id
    private String id;

    /**
     * 最后更新时间
     */
    @Column(name = "lastupdate_time")
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdateTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 账号
     */
    @Column(name = "login_num")
    private String loginNum;

    /**
     * 姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 电话
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 性别(M男，W女)
     */
    @Column(name = "gender")
    private String gender;

    /**
     * 部门
     */
    @Column(name = "department")
    private String department;

    /**
     * 职位
     */
    @Column(name = "position")
    private String position;

    /**
     * 邮箱
     */
    @Column(name = "email")
    private String email;

    /**
     * 座机
     */
    @Column(name = "plane")
    private String plane;

    /**
     * 传真
     */
    @Column(name = "faxes")
    private String faxes;

    /**
     * 邮编
     */
    @Column(name = "postcode")
    private String postcode;

    /**
     * 详细地址
     */
    @Column(name = "address")
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLastupdateTime() {
        return lastupdateTime;
    }

    public void setLastupdateTime(Date lastupdateTime) {
        this.lastupdateTime = lastupdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(String loginNum) {
        this.loginNum = loginNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public String getFaxes() {
        return faxes;
    }

    public void setFaxes(String faxes) {
        this.faxes = faxes;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}