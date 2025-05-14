package com.kh.chap02_udp.server.run;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	
	/*
	 * UDP
	 * - 비연결형 프로토콜로 클라이언트가 데이터를 받았는지 아닌지 상관하지 않는 전송방식.
	 * - 데이터 손실이 발생할 수 있다.
	 * - 번거로운 확인절차를 없앰으로써 신속하게 데이터를 전달할 수 있다.
	 * - 빠른 데이터 전송이 중요한 실시간 스트리밍, 게임등에서 사용된다.
	 * 
	 * DatagramSocket
	 * - UDP 통신에서 DatagramPacket을 보내고, 받는데 사용하는 클래스.
	 * - DatagramPacket을 수신하거나 전송할 수 있으며, 클라이언트와 서버에 각각 하나의 DatagramSocket을 만들어두고 이를 통해 송수신함.
	 * 
	 * DatagramPacket
	 * - UDP 통신시 데이터를 포장하는 클래스.
	 * - 전송할 데이터와 함께, 호스트의 IP 주소 및 포트번호를 포함하여 보낸다.
	 * 
	 * Datagram
	 * - UDP 에서 사용하는 데이터 전송 단위.
	 * 
	 */
	public static void main(String[] args) {
		// 서버의 포트번호 설정
		int serverPort = 4096;
		
		try {
			DatagramSocket socket = new DatagramSocket(serverPort);
			
			byte[] data = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			// 클라이언트가 데이터를 전달하기까지 대기
			System.out.println("서버 송신 대기중.");
			socket.receive(packet);
			
			// 클라이언트의 ip 주소와 포트번호 확인
			InetAddress clientAddress = packet.getAddress();
			System.out.println(clientAddress + " " + packet.getPort());
			
			String str = "UDP Server 에서 전송하는 데이터!!";
			
			// 문자열을 바이트배열로 변환
			byte[] serverData = str.getBytes();
			
			DatagramPacket packet2 = new DatagramPacket(serverData, serverData.length, clientAddress, packet.getPort());
			
			socket.send(packet2); // 클라이언트가 receive 중이라면 데이터를 수신 가능.
			
			// 서버 종료
			socket.close();			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



























