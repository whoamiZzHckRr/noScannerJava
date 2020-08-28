package com.Bishal.Pratice;


public class MySweetProgram {
    public static void main(String[] args) throws Exception {

        Dscanner imp = new Dscanner();
        System.out.print("Enter a string to show it in next line: ");
        String userInput = imp.nextChar("");
        System.out.println("You have Entered : "+ userInput);
    }

}
