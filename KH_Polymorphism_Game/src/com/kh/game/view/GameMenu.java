package com.kh.game.view;

import java.util.Scanner;

import com.kh.game.controller.GameController;
import com.kh.game.job.model.vo.*;
import com.kh.game.monster.model.vo.*;

public class GameMenu {
	private GameController gc = new GameController();
	private Scanner sc = new Scanner(System.in);
//	private Monster myMonster;
	
	public void mainMenu() {
//		======= 메뉴 ======="
//		1. 캐릭터 생성 -> createCharacter()로 이동
//		 2. 게임 시작 -> gameStart()로 이동
//		 3. 캐릭터 정보 확인 -> characterInfo()로 이동
//		 4. 게임 종료 -> “게임을 종료합니다” 출력 후 종료
//		 메뉴번호 :
//		 // 잘못된 번호 입력시 “잘못된 번호입니다” 출력 후 재입력
		
		System.out.println("======= 메뉴 =======");
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 게임 시작");
		System.out.println("3. 캐릭터 정보 확인");
		System.out.println("4. 게임 종료");
		System.out.print("메뉴번호: ");
		int menuNum = sc.nextInt();
		
		switch (menuNum) {
		case 1:
			createCharacter();
			break;
		case 2:
			gameStart();
			break;
		case 3:
			System.out.println("캐릭터 정보:");
			characterInfo();
			break;
		case 4:
			System.out.println("게임을 종료합니다.");
			return;
		default:
			System.out.println("잘못된 번호입니다.");
			mainMenu();
		}
	}
	
	public void createCharacter() {
//		직업과 이름을 선택하여 캐릭터를 생
//		성하는 메서드
		
//		// gameController의 getCharacter의 반환값을 이용하여 캐릭터가 이미 생성되었다면
//		// "이미 캐릭터가 생성되었습니다. 메인메뉴로 돌아갑니다."
//		// 출력 후 메인으로 이동
//		 // 생성되지 않았다면 직업과 이름을 입력.
//		 직업을 선택하세요(1. 전사 , 2. 궁수, 3. 마법사) :
//		 // 존재하지 않는 직업 선택시 직업을 재선택 하도록 반복
//		 캐릭터 이름을 입력하세요 :
//		 // 직업과 이름을 gameController의 createCharacter함수에 매개변수로 전달 후
//		 // 반환값을 이용하여 캐릭터 정보 출력
//		 //(전사/궁수/마법사) 캐릭터 XXX가 생성되었습니다. (LV: XX , 공격력:XX, 체력:XX)
		
		if (gc.getCharacter() != null) {
			System.out.println("이미 캐릭터가 생성되었습니다. 메인메뉴로 돌아갑니다.");
			mainMenu();
		}
		
		System.out.print("직업을 선택하세요(1. 전사 , 2. 궁수, 3. 마법사): ");
		int jobNum = sc.nextInt();
		sc.nextLine();
		
		if (jobNum != 1 && jobNum != 2 && jobNum != 3) {
			System.out.println("존재하지 않는 직업입니다. 1-3번의 직업을 선택해 주세요.");
			createCharacter();
		}
		
		System.out.print("캐릭터 이름을 입력하세요: ");
		String name = sc.nextLine();
		
		// 캐릭터 생성
		gc.createCharacter(jobNum, name);
		
		Characters myCharacter = gc.getCharacter();
		
		String jobName = "";
		
		switch (jobNum) {
		case 1:
			jobName = "전사";
			break;
		case 2:
			jobName = "궁수";
			break;
		case 3:
			jobName = "마법사";
			break;
		}
		
		String result = jobName + " 캐릭터 " + myCharacter.getName() + "가 생성되었습니다. (LV: " + myCharacter.getLevel();
		result += ", 공격력: " + myCharacter.getAtk() + ", 체력: " + myCharacter.getHp() + ")";
		
		System.out.println(result);
		
		mainMenu();
	}
	
	public void gameStart() {
//		출전할 몬스터를 선택하여 몬스터를
//		생성하고, 턴제 방식으로 몬스터와 대
//		결하는 메서드
		
//		출전할 몬스터를 선택하세요 :
//		1. 고블린(lv1) : 초보용
//		2. 오크(lv10) : 중수용
//		3. 드래곤(lv100) : 고수용
//		몬스터 선택
//		// 존재하지 않는 몬스터 번호를 입력시 “존재하지 않는 몬스터입니다.” 출력 후 재입력
//		// 입력한 몬스터 번호를 gameController의 createMonster()함수에 담아서 전달하여
//		// 몬스터 반환
		
		System.out.println("출전할 몬스터를 선택하세요.");
		System.out.println("1. 고블린(Lv.1) : 초보용");
		System.out.println("2. 오크(Lv.10) : 중수용");
		System.out.println("3. 드래곤(Lv.100) : 고수용");
		System.out.print("몬스터 선택: ");
		int monsterNum = sc.nextInt();
		sc.nextLine();
		
//		if (monsterNum != 1 && monsterNum != 2 && monsterNum != 3) {
//			System.out.println("존재하지 않는 몬스터입니다.");
//			gameStart();
//		}
		
		Monster myMonster = null;
		switch (monsterNum) {
		case 1:
			myMonster = gc.createMonster(1);
			break;
		case 2:
			myMonster = gc.createMonster(2);
			break;
		case 3:
			myMonster = gc.createMonster(3);
			break;
		default:
			System.out.println("존재하지 않는 몬스터입니다.");
			gameStart();
		}
		
//		// gameController의 getCharacter()메서드를 호출하여 캐릭터 정보를 반환
//		// 선택한 몬스터와 플레이어간의 전투 진행
//		전투를 시작합니다!
//		XXX의 턴!!
//		1. 공격 => attack()
//		2. 스킬(5레벨부터 사용가능) => useSkill()
//		3. 도망치기 => “전투에서 도망갑니다.” 출력 후 메인메뉴로
//		>>>
//		// 잘못된 번호를 입력시 “잘못된 명령입니다.” 출력 후 재입력
//		// 2번 스킬 사용시 사용자의 레벨을 체크하여 5보다 작다면
//		// “레벨 부족으로 스킬을 사용할 수 없습니다” 출력 후 재입력
		
		Characters myCharacter = gc.getCharacter();
		
		System.out.println("전투를 시작합니다!");
		System.out.println(myCharacter.getName() + "의 턴!!");
		
//		loop1:
		while (true) {
			if (myMonster.getHp() <= 0) {
				System.out.println(myMonster.getName() + " 처치! 전투에서 승리했습니다!!");
				System.out.println(myMonster.getExp() + " 경험치를 획득했습니다!");
				myCharacter.setExp(myCharacter.getExp() + myMonster.getExp());
				if (myCharacter.getExp() >= 100 * myCharacter.getLevel()) {
					myCharacter.levelup();
					System.out.println("레벨업!!");
				}
				break;
			}
			else if (myCharacter.getHp() <= 0) {
				System.out.println("전투에서 패배했습니다.");
				System.out.println("===== Game Over =====");
				return;
			}
			
			System.out.println("1. 공격");
			System.out.println("2. 스킬(5레벨부터 사용가능)");
			System.out.println("3. 도망치기");
			System.out.print(">>>");
			int combatNum = sc.nextInt();
			sc.nextLine();
			
			switch (combatNum) {
			case 1:
				myCharacter.attack(myMonster);
				break;
			case 2:
				if (myCharacter.getLevel() < 5) {
					System.out.println("레벨 부족으로 스킬을 사용할 수 없습니다.");
					break;
				}
				myCharacter.useSkill(myMonster);
				break;
			case 3:
				System.out.println("전투에서 도망갑니다.");
				mainMenu();
				break;
			default:
				System.out.println("잘못된 명령입니다.");
			}
			
//			// 몬스터 공격 후 몬스터의 체력이 0 이하라면 전투 종료
//			고블린/오크/드래곤 처치! 전투에서 승리했습니다!!
//			Xxx경험치를 획득했습니다!
//			// 몬스터가 가진 경험치만큼 플레이어의 경험치를 증가.
//			// 몬스터의 체력이 0보다 크다면 몬스터가 플레이어를 공격
//			// 공격후 플레이어의 체력이 0이하라면 전투종료.
//			// 전투 종료 후에는 플레이어의 hp를 maxHp만큼 회복복
			
			
			myMonster.attack(myCharacter);
		}
		
		myCharacter.setHp(myCharacter.getMaxHp());
		
		System.out.println("전투 종료.");
		System.out.println("현재 정보: ");
		System.out.println(myCharacter);
		
		mainMenu();
	}
	
	public void characterInfo() {
//		캐릭터 정보를 반환하는 메서드
		
//		캐릭터 정보 :
//		gameController의 getCharacter()함수를 호출하여 캐릭터 정보 출력
		
		System.out.println(gc.getCharacter());
		mainMenu();
	}
}






















