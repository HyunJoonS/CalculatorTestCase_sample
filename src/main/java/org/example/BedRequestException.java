package org.example;

public class BedRequestException extends RuntimeException{
    public BedRequestException(){
        super("잘못된 입력입니다.");
    }
}
