package com.school;

public class Main {
    public static void main(String [] args) throws Exception {

        Lokaal lokaal1 = new Lokaal("HU", 101, "AI");
        Lokaal lokaal2 = new Lokaal("HU", 102, "CSC");
        Lokaal lokaal3 = new Lokaal("TU", 102, "TI");

        Student student1 = new Student("Colin", 111, "AI");
        Student student2 = new Student("Jan", 112, "CSC");
        Student student3 = new Student("Freek", 113, "TI");

        //Komt overheen
        Les les1 = new Les(lokaal1,student1, "09:30/10:30");
        System.out.println(les1.toString());

        Les les2 = new Les(lokaal2,student2, "10:30/11:30");
        System.out.println(les2.toString());

        Les les3 = new Les(lokaal3,student3, "09:30/10:30");
        System.out.println(les3.toString());

        //Komt niet overheen
        Les les4 = new Les(lokaal2,student1, "09:30/10:30");
        System.out.println(les4.toString());

        //TEST output
//        System.out.println(les1.toString());
//        System.out.println(les2.toString());
//        System.out.println(les3.toString());
//
//        System.out.println("\n");
//
//        System.out.println(student1.toString());
//        System.out.println(student2.toString());
//        System.out.println(student3.toString());
//
//        System.out.println("\n");
//
//        System.out.println(lokaal1.toString());
//        System.out.println(lokaal2.toString());
//        System.out.println(lokaal3.toString());
    }
}
