<<<<<<< HEAD
package com.example.p1.Strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMessage(String message){
        return this.encodingStrategy.encode(message);

    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }


}
=======
package com.example.p1.Strategy;

public class Encoder {
    private EncodingStrategy encodingStrategy;

    public String getMessage(String message){
        return this.encodingStrategy.encode(message);

    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }


}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6
