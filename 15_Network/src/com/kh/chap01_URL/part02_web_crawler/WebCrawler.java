package com.kh.chap01_URL.part02_web_crawler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
	/*
	 * URL 을 활용한 웹 크롤링
	 * - 웹페이지를 탐색하여 HTML 내부의 원하는 데이터를 추출하는 작업.
	 * - 수집한 데이터를 분석하기 위하여 사용한다.
	 * - 다만, 웹페이지의 소유주, 운영자의 동의 없이 크롤링시 법적 책임이 따를 수도 있다.
	 * 
	 */
	
	public static void main(String[] args) {
		WebCrawler w = new WebCrawler();
		
		w.test1();
	}
	
	public void test1() {
		// https://khedu.co.kr/project/team.kh
		
		String address = "http://khedu.co.kr/project/team.kh";
		List<String> imgList = new ArrayList<>(); // img 파일이 존재하는 경로를 저장할 컬렉션.
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			// 읽어온 자원의 HTML 데이터를 저장할 변수
			StringBuilder htmlContents = new StringBuilder();
			String line;
			
			while((line = reader.readLine()) != null) {
				htmlContents.append(line).append("\n");
			}
			
			// 정규표현식을 통해 문자열에서 내가 원하는 형태의 문자열을 추출
			// <img src="???">
			String regex = "<img\s+src=\"([^\"]+)\"";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(htmlContents);
			
			while (matcher.find()) {
				String image = matcher.group(1);
				System.out.println("image: " + image);
				imgList.add(image);
			}
			
			System.out.println("검색완료.");
			saveFile(imgList);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private void saveFile(List<String> imgList) {
		for (String imgPath : imgList) {
			
			if (!imgPath.startsWith("/upload/project")) {
				System.out.println("찾고자 하는 파일이 아닙니다.");
				continue;
			}
			
			String fileName = imgPath.substring(imgPath.lastIndexOf("/"));
			String savePath = "C:/upload/project" + fileName;
			
			try {
				URL url = new URL("http://khedu.co.kr" + imgPath);
				URLConnection conn = url.openConnection();
				
//				try (
//						BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(savePath)))
//				) {
//					int bytesRead;
//					while ((bytesRead = br.read()) != -1) {
//						bw.write(bytesRead);
//					}
//				} catch (Exception e) {
//					System.out.println("에러발생");
//					e.printStackTrace();
//				}
				
				
				try (
						BufferedInputStream is = new BufferedInputStream(conn.getInputStream());
						BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(savePath))
				) {
					int bytesRead;
					while ((bytesRead = is.read()) != -1) {
						os.write(bytesRead);
					}
				} catch (Exception e) {
					System.out.println("에러발생");
					e.printStackTrace();
				}
				
				System.out.println(fileName + " 저장 완료.");				
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

























