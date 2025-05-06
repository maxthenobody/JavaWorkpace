package com.kh.game.controller;

import com.kh.game.job.model.vo.*;
import com.kh.game.monster.model.vo.*;

public class GameController {
	private Characters character;
//	private Monster monster;
	
	public void createCharacter(int job, String name) {
//		매개변수로 전달받은 job과 name을
//		이용하여 캐릭터를 생성하는 메서드.
//		캐릭터의 기본 능력치는 2. 사용데이
//		터를 참고
		
		switch (job) {
		case 1:
			character = new Warrior(name, 1, 2, 10, 10, 0);
			break;
		case 2:
			character = new Archer(name, 1, 3, 5, 5, 0);
			break;
		case 3:
			character = new Wizard(name, 1, 500, 100, 100, 0);
			break;
		}
	}
	
	public Characters getCharacter() {
		return character;
	}
	
	public Monster createMonster(int num) {
//		매개변수로 전달받은 num을 이용하
//		여 몬스터를 생성하는 메서드. 몬스터
//		의 능력치는 2.사용데이터를 참고
		Monster monster;
		
		switch (num) {
		case 1:
			monster = new Goblin("고블린", 1, 3, 100);
			break;
		case 2:
			monster = new Orc("오크", 10, 100, 200);
			break;
		case 3:
			monster = new Dragon("드래곤", 100, 200000, 300);
			break;
		default:
			monster = null;
		}
		
		return monster;
	}
}






























