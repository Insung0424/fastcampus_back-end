<<<<<<< HEAD
package com.example.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component("Base64En")
public class Base64Encoder implements IEncoder{
    @Override
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
=======
package com.example.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component("Base64En")
public class Base64Encoder implements IEncoder{
    @Override
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
