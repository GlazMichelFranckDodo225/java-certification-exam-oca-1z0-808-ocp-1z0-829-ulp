package com.dgmf.a.classstructureoca;

/**
 * @author Glaz Dodo
 */
public class Student {
    private String name;

    public String getName() {
        // This is one-line Comment
        return name; /* This is Multiple
        lines Comment */
    }

    /**
     * Javadoc
     * @param theName
     */
    public void setName(String theName) {
        name = theName;

        System.out.println(name); // Print the Value of the "name" Variable
    }
}
