package com.company;

public class Main {

    public static void main(String[] args) {
	University university = new University("Manas",1999,"Kyrgyzstan",5);
        System.out.println(university);
        university.getInfo();

        Scool scool = new Scool("Sapat",1992,"Kg",4,"second");
        System.out.println(scool);
        scool.getInfo();

    }
}
