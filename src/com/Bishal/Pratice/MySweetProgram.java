package com.Bishal.Pratice;


public class MySweetProgram {
    public static void main(String[] args) throws Exception {

        /*Dscanner imp = new Dscanner();
        System.out.print("Enter a string to show it in next line:");
        String someString = imp.nextChar("");
        System.out.println("output :"+someString);
        */
        Dscanner imp = new Dscanner();
        System.out.print("Enter a string to show it in next line: ");
        String userInput = imp.nextChar("");
        System.out.println("You have Entered : "+ userInput);

           /*String a="";
           char b;
           while((b=(char)System.in.read())!=(char)10 ){
               a += b;
           }
            System.out.println(a);*/
    }

}
