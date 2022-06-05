<<<<<<< HEAD
package com.example.ioc;

public class main {

    public static void main(String[] args){

        String url="www.naver.com/books/it?page=10&size=20&name=spring-boot";
        //base64 encoding
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
=======
package com.example.ioc;

public class main {

    public static void main(String[] args){

        String url="www.naver.com/books/it?page=10&size=20&name=spring-boot";
        //base64 encoding
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
