package com.Bishal.Pratice;

public class Dscanner {

    public String nextChar(String userInput) throws Exception{
        char asciConverter;
        while((asciConverter = (char)System.in.read())!=(char)10 ){
            userInput += asciConverter;
        }
        return userInput;
    }

   /* public String nextChar(String a) throws Exception{
    char b;
    while((b=(char)System.in.read())!=(char)10){
        a += b;
    }
    return a;
    }*/

    /*public String nextChar(String Input) throws Exception{
        char asci;
        while((asci = (char)System.in.read())!=(char)10){
            Input += asci;
        }
        return Input;
    }*/
}

