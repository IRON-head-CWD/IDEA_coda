package com.itheima.Test01;

public abstract class Staff {
    private String name;
    private String sex;
    private String year;
//no parameter
    public Staff() {
    }
//parameter
    public Staff(String name, String sex, String year) {
        this.name = name;
        this.sex = sex;
        this.year = year;
    }
//return value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public  abstract void Action();
}
