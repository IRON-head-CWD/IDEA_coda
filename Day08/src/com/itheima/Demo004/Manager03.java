package com.itheima.Demo004;

public class Manager03 {
    private String name;
    private int jobNum, salary, bonus;

    public Manager03() {
    }

    public Manager03(String name, int jobNum, int salary) {
        this.name = name;
        this.jobNum = jobNum;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobNum() {
        return jobNum;
    }

    public void setJobNum(int jobNum) {
        this.jobNum = jobNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void show() {
        System.out.print("工号为"+jobNum+"基本工资为"+salary);
    }

    public void work() {
        System.out.println("程序员正在努力的写着代码......");
    }
}



