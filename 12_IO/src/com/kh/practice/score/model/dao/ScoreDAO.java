package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
//		매개변수들을
//		DataOutputStream을 통해 파
//		일에 저장
		
		try (DataOutputStream ds = new DataOutputStream(new FileOutputStream("score_prac.txt", true))) {
			
			ds.writeUTF(name);
			ds.writeInt(kor);
			ds.writeInt(eng);
			ds.writeInt(math);
			ds.writeInt(sum);
			ds.writeDouble(avg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
//		파일을 DataInputStream을 통
//		해 읽어옴
		
		return new DataInputStream(new FileInputStream("score_prac.txt"));	
	}
	
}

























