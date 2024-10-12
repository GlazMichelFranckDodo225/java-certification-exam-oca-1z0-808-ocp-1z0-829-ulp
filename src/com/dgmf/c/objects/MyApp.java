package com.dgmf.c.objects;

public class MyApp {
    public static void main(String[] args) {
        // New Student Object is Created and Constructor is Called
        Student student = new Student();
        // student.Student();
        student.name = "John Wayne"; // Set Instance Variable
        System.out.println(student.name); // Get Variable

        Dog dog = new Dog();
    }
}
