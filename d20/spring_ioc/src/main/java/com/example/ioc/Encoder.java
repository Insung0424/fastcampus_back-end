<<<<<<< HEAD
package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;


public class Encoder {

    private IEncoder iEncoder;
//  public Encoder(@Qualifier("Base64En") IEncoder iEncoder){
    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;

    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
=======
package com.example.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;


public class Encoder {

    private IEncoder iEncoder;
//  public Encoder(@Qualifier("Base64En") IEncoder iEncoder){
    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;

    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
