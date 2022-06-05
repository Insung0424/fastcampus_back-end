<<<<<<< HEAD
package com.example.p1.proxy;

public class Browser implements IBrowser{
    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from: " + url);
        return new Html(url);
    }
}
=======
package com.example.p1.proxy;

public class Browser implements IBrowser{
    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loading html from: " + url);
        return new Html(url);
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
