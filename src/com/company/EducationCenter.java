package com.company;

public class EducationCenter {
    private String name;
    private int year;
    private String country;
    private int duration;

    public EducationCenter(String name, int year, String country, int duration) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void getInfo(){
        System.out.println(name+" is located in "+country);
    }
    @Override
    public String toString() {
        return "EducationCenter: " +
                "name='" + name + '\'' +
                ", year=" + year +
                ", country='" + country;
    }
}
