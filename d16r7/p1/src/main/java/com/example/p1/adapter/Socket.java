<<<<<<< HEAD
package com.example.p1.adapter;

public class Socket implements Electronic110v{
//adapter 패턴
    private Electronic220v electronic220v;

    public Socket(Electronic220v electronic220v){
        this.electronic220v = electronic220v;
        //adapter 패턴  형변환같은 느낌?
    }
    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}
=======
package com.example.p1.adapter;

public class Socket implements Electronic110v{
//adapter 패턴
    private Electronic220v electronic220v;

    public Socket(Electronic220v electronic220v){
        this.electronic220v = electronic220v;
        //adapter 패턴  형변환같은 느낌?
    }
    @Override
    public void powerOn() {
        electronic220v.connect();
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
