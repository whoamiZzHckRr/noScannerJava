package com.Bishal.Pratice;

public class Dscanner {

    public String nextChar(String userInput) throws Exception{
        char asciConverter;
        while((asciConverter = (char)System.in.read())!=(char)10 ){
            userInput += asciConverter;
        }
        return userInput;
    }
}

