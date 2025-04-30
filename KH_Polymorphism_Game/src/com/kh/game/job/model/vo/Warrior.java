package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public class Warrior extends Characters {
	public Warrior() {
		
	}
	
	public Warrior(String name, int level, int atk, int hp, int maxHp, int exp) {
		super(name, level, atk, hp, maxHp, exp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
//		“직업 : XXX , “작성후 부모의
//		toString() 호출한 문자열을 반환하는
//		메서드
		return "직업: 전사, " + super.toString();
	}

	@Override
	public void attack(Monster m) {
//		1 ~ 공격력 * 3 범위의 랜덤 대미지를
//		몬스터에게 입히는 메서드.
//		출력문 : xxx가 검을 휘둘렀습니다!
//		 xx 체력 -xx , 남은체력 : xx
		
		int damage = (int)(Math.random() * getAtk() * 3 + 1);
		
		System.out.println(getName() + "가 검을 휘둘렀습니다!");
		System.out.println(m.getName() + " 체력 -" + damage + ", 남은체력: " + (m.getHp() - damage));
		m.setHp(m.getHp() - damage);
		
	}

	@Override
	public void useSkill(Monster m) {
//		공격력 * 2 대미지를 몬스터에게 입히
//		는 메서드
//		출력문 : xxx가 스킬 강타를 사용했습
//		니다.
//		 xx 체력 -xx , 남은체력 : xx
		
		int damage = getAtk() * 2;
		
		System.out.println(getName() + "가 스킬 강타를 사용했습니다.");
		System.out.println(m.getName() + " 체력 -" + damage + ", 남은체력: " + (m.getHp() - damage));
		m.setHp(m.getHp() - damage);
	}

	@Override
	public void levelup() {
//		레벨을 1 증가시키고, maxHp, atk을
//		증가시키며 hp를 maxHp만큼 회복시
//		키는 메서드.
		
		setLevel(getLevel() + 1);
		setMaxHp(getMaxHp() + 10);
		setAtk(getAtk() + 2);
		setHp(getMaxHp());
	}
	
	
	
}




















