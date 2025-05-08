package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

import com.kh.practice.score.model.dao.ScoreDAO;

public class ScoreController {
	private ScoreDAO dao = new ScoreDAO();
	
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
//		매개변수를 DAO에 전달
		dao.saveScore(name, kor, eng, math, sum, avg);
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
//		DAO에 반환 값을 그대로 반환
		return dao.readScore();
	}
}

















