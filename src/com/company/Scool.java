package com.company;

public class Scool extends EducationCenter{

    private String grade;

    public Scool(String name, int year, String country, int duration, String grade) {
        super(name, year, country, duration);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+"Scool{" +
                "grade='" + grade + '\'';
    }

    @Override
    public void getInfo() {
        System.out.println("I love my scool");
        System.out.println("I love "+getName());
        super.getInfo();
    }
}

