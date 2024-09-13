package com.dgmf.b.mainmethod;

public class PassingArgumentsMainMethod {
    public static void main(String[] args) {
        System.out.println("First Name : " + args[0]);
        System.out.println("Last Name : " + args[1]);
    }
    // Into Terminal :
    //  - javac PassingArgumentsMainMethod.java
    //  - java PassingArgumentsMainMethod John Wayne :
    //        Outputs :
    //          - First name: John
    //          - Last name: Wayne
    //  - java PassingArgumentsMainMethod John :
    //        Outputs : [index out of bounds exception]
    //  - java PassingArgumentsMainMethod John D. Wayne
    //        Outputs :
    //          - First name: John
    //          - Last name: D.
    //  - java PassingArgumentsMainMethod "John D." Wayne
    //        Outputs :
    //          - First name: John D.
    //          - Last name: Wayne
}
