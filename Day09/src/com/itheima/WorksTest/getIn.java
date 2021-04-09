package com.itheima.WorksTest;
//建立对象（类）
public class getIn {
    //成员变量
    private String userName;
    private int passWorld;

    public getIn() {
    }

    public getIn(String userName, int passWorld) {
        this.userName = userName;
        this.passWorld = passWorld;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(int passWorld) {
        this.passWorld = passWorld;
    }
}
