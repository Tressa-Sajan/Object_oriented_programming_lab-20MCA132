
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class q6_Client{
	public static void main(String []args) throws IOException{
		Scanner sc = new Scanner(System.in);
		DatagramSocket dataSocket = new DatagramSocket();
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("Host Name with IP Address :"+ip);
		byte buff[] = null;
		while(true){
			System.out.print("Chat: ");
			String chat = sc.next();
			buff = chat.getBytes(); // Converting inputed char to Bytes
			                              //DatagramPacket(Bytes, Byte Length, Host IP, Port Num); Setting up the Packet to be Send
			DatagramPacket packetSend = new DatagramPacket(buff, buff.length, ip, 1234);
			dataSocket.send(packetSend); // Sending the Packet
			
			if(chat.equals("bye"))
				break;
		}
	}
}
