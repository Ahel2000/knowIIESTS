package com.example.clg_pro;

public class OurCanteen {
    private String name;
    private String location;
    private String priority;
    private String des;
    private String contact;
    private String rname;
    public float review;
    private String icon;

    public OurCanteen(String name, String location, String priority, String des,String contact, String rname, float review, String icon) {
        this.name = name;
        this.location = location;
        this.priority = priority;
        this.des = des;
        this.contact = contact;
        this.rname = rname;
        this.review = review;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPriority() {
        return priority;
    }

    public String getDes() {return des;}

    public String getContact() {
        return contact;
    }

    public String getRname() {
        return rname;
    }

    public float getReview() {
        return review;
    }

    public String getIcon() {
        return icon;
    }
}