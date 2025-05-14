package com.kh.chap01_URL.part03_request;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class AirPolution {
	/*
	 * URLConnection 활용 예시
	 * 1) 웹크롤링
	 * 2) API 요청
	 * 
	 * API
	 * - API 서버: 애플리케이션간의 통신에서 데이터를 제공해주는 서버
	 * - API: 애플리케이션간의 통신에서 데이터를 주고 받기 위한 설명서(인터페이스)
	 * 
	 * API 서버 주소
	 * - https://www.data.go.kr/tcs/dss/selectApiDataDetailView.do?publicDataPk=15073861
	 * - 한국환경공단_에어코리아_대기오염정보
	 * 
	 */
	
	public static void main(String[] args) {
		String requestURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
		String serviceKey = "EYfxSHTXkgG125OxL9MKfyzSb7vt0K1NJ6B176dawwRLzRlSPU9xphZaKmaD2tR1xHts6o0l5Du2TRkHPpQHmQ%3D%3D";
		String serviceURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc";
		
		// 요청주소에 쿼리스트링으로 요청변수를 묶어주기.
		requestURL += "?serviceKey=" + serviceKey;
		requestURL += "&pageNo=1";
		
		try {
			URL url = new URL(requestURL);
			URLConnection conn = url.openConnection();
			
			// 입출력 스트림 생성
			try (
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("haha.txt")))
			) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
