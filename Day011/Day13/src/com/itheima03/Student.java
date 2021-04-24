package com.itheima03;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID=88L;
    private String name;
    private int age;
    private transient String gender;

}
