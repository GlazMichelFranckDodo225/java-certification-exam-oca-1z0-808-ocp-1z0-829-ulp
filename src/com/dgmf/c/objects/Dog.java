package com.dgmf.c.objects;

public class Dog {
    private String name = "Chip";

    public Dog() {
        System.out.println("Inside Dog's Constructor ...");

        name = "Teddy";
    }

    {
        System.out.println("Inside the Initializer Block ...");
    }
}
