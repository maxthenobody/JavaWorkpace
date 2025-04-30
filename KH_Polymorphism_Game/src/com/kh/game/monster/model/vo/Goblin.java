package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public class Goblin extends Monster {

	public Goblin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goblin(String name, int atk, int hp, int exp) {
		super(name, atk, hp, exp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Characters c) {
//		공격력만큼의 대미지를 플레이어에게
//		입히는 메서드.
		
		int damage = getAtk();
		
		System.out.println(getName() + "이 당신을 공격했습니다.");
		System.out.println(c.getName() + " 체력 -" + damage + ", 남은체력: " + (c.getHp() - damage));
		c.setHp(c.getHp() - damage);
	}
	
	
}
