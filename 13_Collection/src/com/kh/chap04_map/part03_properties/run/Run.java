package com.kh.chap04_map.part03_properties.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Run {
	public static void main(String[] args) {
		/*
		 * Properties: Map 계열 구현 클래스, key, value 세트로 값을 저장.
		 *             단, Properties 는 key, value 값을 모두 String 으로 관리하며, 파일입출력(IO) 메서드를 지원하여,
		 *             Properties 내부의 데이터를 출력하거나, 읽어들이는 기능을 제공한다.
		 *             프로젝트의 설정정보를 기록하는데 자주 사용되는 클래스.
		 */
		Properties prop = new Properties();
		
		// Map 계열을 상속받았기 때문에 put 메서드가 존재.
//		prop.put("다이제", new Snack("초코맛", 1500));
		
		// 1. setProperty(String key, String value): 데이터 저장 메서드
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		// 2. getProperty(String key): 저장된 값을 가져오는 메서드
		System.out.println(prop.getProperty("List"));
		
		try {
			// 3. store(OutputStream os, String Comments): prop 에 담긴 key, value 를 저장
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			// 4. storeToXML(OutputStream os, String Comments)
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties prop2 = new Properties();
		
		System.out.println(prop2);
		
		try {
			// 5. load(InputStream is): .properties 를 읽는데 사용하는 메서드 
			prop2.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is): .xml 을 읽는데 사용하는 메서드.
//			prop2.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop2);
	}
}

























