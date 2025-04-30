package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public class Orc extends Monster {
	private int count;

	public Orc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orc(String name, int atk, int hp, int exp, int count) {
		super(name, atk, hp, exp);
		// TODO Auto-generated constructor stub
		this.count = count;
	}

	@Override
	public void attack(Characters c) {
//		공격력만큼의 대미지를 플레이어에게
//		입히는 메서드. 오크는 3번째 공격마
//		다 heal()스킬을 사용 후 공격
		
		int damage = getAtk();
		
		System.out.println(getName() + "이 당신을 공격했습니다.");
		System.out.println(c.getName() + " 체력 -" + damage + ", 남은체력: " + (c.getHp() - damage));
		c.setHp(c.getHp() - damage);
		
		if (count > 0 && count % 3 == 0) {
			heal();
		}
		
		count++;
	}
	
	public void heal() {
//		20만큼의 체력을 회복하는 메서드
		setHp(getHp() + 20);
	}
}
