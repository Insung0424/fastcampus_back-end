<<<<<<< HEAD
package com.example.ioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class UrlEncoder implements IEncoder {
    public String encode(String message) {
        return UrlEncoder.encode(message,"UTF-8");
    }

    private static String encode(String message, String s) {
        return message;
    }
}
=======
package com.example.ioc;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

@Component
public class UrlEncoder implements IEncoder {
    public String encode(String message) {
        return UrlEncoder.encode(message,"UTF-8");
    }

    private static String encode(String message, String s) {
        return message;
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
