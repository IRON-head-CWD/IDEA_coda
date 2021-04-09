package com.itheima.Demo004;

public class Manager02 {
    private String name;
    private int jobNum, salary,bonus;
//空参
    public Manager02() {
    }
//实参
    public Manager02(String name, int jobNum, int salary, int bonus) {
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
        System.out.print("工号为"+jobNum+"基本工资为"+salary+"奖金为"+bonus+"的");
    }
    public void work() {
        System.out.println("项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码......");
    }
}
