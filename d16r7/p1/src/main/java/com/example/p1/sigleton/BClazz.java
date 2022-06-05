<<<<<<< HEAD
package com.example.p1.sigleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
=======
package com.example.p1.sigleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
