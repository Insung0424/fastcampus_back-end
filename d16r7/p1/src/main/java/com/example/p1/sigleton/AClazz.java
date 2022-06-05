<<<<<<< HEAD
package com.example.p1.sigleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
=======
package com.example.p1.sigleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
