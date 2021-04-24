package com.itheima.domain;

public class Manager {
    private String ID;
    private String name;
    private String sex;
    private String phoneNumber;

    public Manager() {
    }

    public Manager(String ID, String name, String sex, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Manager manager = (Manager) o;

        if (ID != null ? !ID.equals(manager.ID) : manager.ID != null) return false;
        if (name != null ? !name.equals(manager.name) : manager.name != null) return false;
        if (sex != null ? !sex.equals(manager.sex) : manager.sex != null) return false;
        return phoneNumber != null ? phoneNumber.equals(manager.phoneNumber) : manager.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = ID != null ? ID.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
