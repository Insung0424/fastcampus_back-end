<<<<<<< HEAD
package com.example.ioc;

public class UrlEncoder implements IEncoder {
    public String encode(String message) {
        try {
            return UrlEncoder.encode(message, "UTF-8");
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static String encode(String message, String s) {
        return message;
    }
}
=======
package com.example.ioc;

public class UrlEncoder implements IEncoder {
    public String encode(String message) {
        try {
            return UrlEncoder.encode(message, "UTF-8");
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static String encode(String message, String s) {
        return message;
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
