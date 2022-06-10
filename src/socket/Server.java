package socket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		BufferedWriter out = null;
		BufferedReader in = null;
		
		ServerSocket ser = null; //ip,port
		Socket so = null; //data 주고 받을때 사용
		//서버쪽에서 필요한 객체들
		
		Scanner scan = new Scanner(System.in);
		try {
			ser = new ServerSocket(8080);
		}catch(Exception e) {}
		System.out.println("연결을 기다림");
		//클라이언트가 연결요청이 올때까지 기다린다
		try {
			so=ser.accept();// 연결 수락
		}catch(Exception e) {}
		//서버쪽에서 클라이언트한테 메시지를 보낸다
		
		try {
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));
		
			while(true) {
				String msg = in.readLine();
				
				if(msg.equals("stop")) {
					System.out.println("stop");
					break;
				}
				
				System.out.println("send");
				
				String outmsg = scan.nextLine();
				out.write(outmsg+"\n");
				out.flush(); // 현재 버퍼에있는 내용을 전송하고 비운다
			}
		}catch(Exception e) {
			e.getStackTrace();
		}finally {
			try {
				scan.close();
				so.close();
				ser.close();
			} catch (IOException e) {
				System.out.println("오류발생");
			}
		}

	}

}
