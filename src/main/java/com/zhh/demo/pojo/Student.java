package com.zhh.demo.pojo;

public class Student {
    private Integer stuid;

    private String stuname;

    private String phonenumber;

    private String classnumber;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(String classnumber) {
        this.classnumber = classnumber == null ? null : classnumber.trim();
    }
}