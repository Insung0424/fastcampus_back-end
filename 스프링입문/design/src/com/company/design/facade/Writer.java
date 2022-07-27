package com.company.design.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s connect",fileName);
        System.out.println(msg);
    }

    public void fileWrite(){
        String msg = String.format("Writer %s read" ,fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s disconnect",fileName);
        System.out.println(msg);
    }
}
