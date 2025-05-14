package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {
		//0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
		 // serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
		 //1) URL 객체 생성
		 // 2)URLConnection 객체 생성
		 // 3)입력 스트림 생성
		 // 4)전달받은 데이터를 화면에 출력
		
		String requestURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
		String serviceKey = "EYfxSHTXkgG125OxL9MKfyzSb7vt0K1NJ6B176dawwRLzRlSPU9xphZaKmaD2tR1xHts6o0l5Du2TRkHPpQHmQ%3D%3D";
		
		try {
			requestURL += "?serviceKey=" + serviceKey;
			requestURL += "&stationName=" + URLEncoder.encode("종로구", "UTF-8");
			requestURL += "&dataTerm=DAILY";
//			requestURL += "?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + URLEncoder.encode(serviceKey, "UTF-8");
//			requestURL += "&" + URLEncoder.encode("stationName", "UTF-8") + "=" + URLEncoder.encode("종로구", "UTF-8");
//			requestURL += "&" + URLEncoder.encode("dataTerm", "UTF-8") + "=" + URLEncoder.encode("DAILY", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		try {
			URL url = new URL(requestURL);
			URLConnection conn = url.openConnection();
			
			try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
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
