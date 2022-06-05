<<<<<<< HEAD
package com.example.p1.sigleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){}

    public static SocketClient getInstance(){
        if (socketClient == null){
            socketClient = new SocketClient();
        }return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
=======
package com.example.p1.sigleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){}

    public static SocketClient getInstance(){
        if (socketClient == null){
            socketClient = new SocketClient();
        }return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
