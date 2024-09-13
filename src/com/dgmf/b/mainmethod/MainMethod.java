package com.dgmf.b.mainmethod;

public class MainMethod {
    // DIFFERENT JAVA MAIN METHOD SIGNATURES
    // Most Common Declaration
    /*public static void main(String[] args) {
        System.out.println("Main Method 1");
    }*/

    // NB : THE RETURN TYPE "VOID" MUST BE RIGHT BEFORE THE
    // METHOD NAME IN JAVA !

    // Other Name for the Argument
    /*public static void main(String[] someOtherName) {
        System.out.println("Main Method 2");
    }*/

    // C-style Array Type Declaration for Parameter 'args'
    /*public static void main(String args[]) {
        System.out.println("Main Method 3");
    }*/

    // Using "Varargs"
    // https://www.baeldung.com/java-varargs
    /*public static void main(String... args) {
        System.out.println("Main Method 4");
    }*/

    // Using "final" keyword
    /*public final static void main(final String[] args) {
        System.out.println("Main Method 5");
    }*/

    // "static" Keyword before "public" Keyword
    static public void main(String[] args) {
        System.out.println("Main Method 6");
    }
}
