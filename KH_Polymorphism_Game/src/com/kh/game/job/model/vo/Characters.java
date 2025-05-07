package com.kh.game.job.model.vo;

import com.kh.game.monster.model.vo.Monster;

public abstract class Characters implements Skill {
	private String name;
	private int level;
	private int atk;
	private int hp;
	private int maxHp;
	private int exp;
	
	protected Characters() {
		
	}

	protected Characters(String name, int level, int atk, int hp, int maxHp, int exp) {
		super();
		this.name = name;
		this.level = level;
		this.atk = atk;
		this.hp = hp;
		this.maxHp = maxHp;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
//		매개변수로 전달받은 exp를 현재 객
//		체의 exp에 추가하는 메서드. 경험치
//		추가 완료 후 누적 경험치가
//		level*100을 넘었다면 levelup()메서드
//		를 호출.
		this.exp += exp;
		
		if (this.exp > level * 100) {
			levelup();
		}
	}

	@Override
	public String toString() {
//		“이름: " + name + ", 레벨: " + level +
//		", 공격력: " + atk + ", HP: " + maxHp
//		+ ", 경험치: " + exp.“의 형식으로 문자
//		열 만들어 리턴 처리
		return "이름: " + name + ", 레벨: " + level + ", 공격력: " + atk + ", HP: " + maxHp + ", 경험치: " + exp;
	}
	
	public abstract void attack(Monster m);
	@Override
	public abstract void useSkill(Monster m); // 생략해도 됨.
	public abstract void levelup();
}





















