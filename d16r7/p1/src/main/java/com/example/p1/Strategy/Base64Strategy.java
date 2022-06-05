<<<<<<< HEAD
package com.example.p1.Strategy;

import java.util.Base64;

public class Base64Strategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
=======
package com.example.p1.Strategy;

import java.util.Base64;

public class Base64Strategy implements EncodingStrategy{

    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
