package com.company;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(String message){
        super(message);
    }
    public MyArraySizeException(String message,Throwable cause){
        super(message, cause);
    }

}
