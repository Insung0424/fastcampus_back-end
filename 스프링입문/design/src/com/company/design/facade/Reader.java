package com.company.design.facade;

public class Reader {
    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s connect",fileName);
        System.out.println(msg);
    }

    public void fileRead(){
        String msg = String.format("Reader %s read" ,fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Reader %s disconnect",fileName);
        System.out.println(msg);
    }
}
