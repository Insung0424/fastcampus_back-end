package com.company.design;

import com.company.design.Observer.Button;
import com.company.design.Observer.IButtonListener;
import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.Sftp;
import com.company.design.facade.Writer;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;


public class Main {
    public static void main(String[] args) {

        //싱글톤 패턴
//        Aclazz aclazz = new Aclazz();
//        Bclazz bclazz = new Bclazz();
//
//        SocketClient aClient = aclazz.getSocketClient();
//        SocketClient bClient = bclazz.getSocketClient();
//
//        System.out.println(aClient.equals(bClient));
        
        //어댑터 패턴
//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//        Cleaner cleaner = new Cleaner();
////        connect(cleaner); 호환되지 않기때문에 사용불가
//        Electronic110V adapter = new SocketAdapter(cleaner);
//        connect(adapter);
//
//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110V airAdapter = new SocketAdapter(airConditioner);
//        connect(airAdapter);

        //프록시 패턴 - 한번 로딩 후 캐시기능을 사용
//        Browser browser = new Browser("www.naver.com");
//        browser.show(); //매번 새롭게 로딩
//        browser.show();
//        browser.show();
//        IBrowser iBrowser = new BrowserProxy("www.naver.com");
//        iBrowser.show(); //첫번째 로딩 이후 다시 로딩시 캐시기능 사용
//        iBrowser.show();
//        iBrowser.show();
//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//        IBrowser aopBrowser = new AopBrowser("www.naver.com",
//                () -> {
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                () -> {
//            long now = System.currentTimeMillis();
//            end.set(now - start.get());
//                });
//        aopBrowser.show(); // 처음에는 스레드로 1.5초이상이 걸린다
//        System.out.println("loading time : "+end.get());
//
//        aopBrowser.show(); // 이후에는 캐시기능으로 시간이 소모되지않는다
//        System.out.println("loading time : "+end.get());

//        //데코레이터패턴 - 기본 뼈대는 건드리지 않고 추가 하는 패턴
//        Icar audi = new Audi(1000);
//        audi.showPrice();
//        //a3
//        Icar audi3 = new A3(audi,"A3");
//        audi3.showPrice();
//        //a4
//        Icar audi4 = new A4(audi,"A4");
//        audi4.showPrice();
//        //a5
//        Icar audi5 = new A5(audi,"A5");
//        audi5.showPrice();

        //옵저버패턴 - 변화가 일어났을 때 미리 등록된 클래스에 통보해주는 패턴 ex)스윙의 이벤트리스너
//        Button button = new Button("button");
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//        button.click("click1");
//        button.click("click2");
//        button.click("click3");
//        button.click("click4");

//        //파사드패턴 - 여러객체사이의 복잡한 의존관계가 있을때 중간에 facade라는 객체를 두고
//        // 여기서 제공하는 interface만을 활용하여 기능을 사용하는 방식
//        Ftp ftp = new Ftp("www.foo.co.kr",22,"/home/etc");
//        ftp.connect();
//        ftp.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.fileWrite();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftp.disConnect();
//        // 파사드를 통한 단순화
//        Sftp sftp = new Sftp("www.foo.co.kr",22,"/home/etc","text.tmp");
//        sftp.Connect();
//        sftp.write();
//        sftp.read();
//        sftp.disConnect();

        //전략 패턴 - 유사한 행위들을 캡슐화하여 전략만 변경하여 유연하게 확장하는 패턴
        Encoder encoder = new Encoder();
        //base64
        Encodingstrategy base64 = new Base64Strategy();
        //normal
        Encodingstrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingstrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingstrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingstrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
