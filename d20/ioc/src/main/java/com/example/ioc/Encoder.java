<<<<<<< HEAD
package com.example.ioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;

    }

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
=======
package com.example.ioc;

import java.util.Base64;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;

    }

    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
