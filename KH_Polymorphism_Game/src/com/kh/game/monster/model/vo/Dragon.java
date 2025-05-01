package com.kh.game.monster.model.vo;

import com.kh.game.job.model.vo.Characters;

public class Dragon extends Monster {
	private int count;

	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dragon(String name, int atk, int hp, int exp) {
		super(name, atk, hp, exp);
		// TODO Auto-generated constructor stub
//		this.count = count;
	}

	@Override
	public void attack(Characters c) {
//		공격력 만큼의 대미지를 플레이어에
//		게 입히는 메서드. 드래곤은 3번째 공
//		격마다 공격 대신 breath()스킬을 사
//		용
		count++;
		
		if (count > 0 && count % 3 == 0) {
			breath(c);
			return;
		}
		
		int damage = getAtk();
		
		System.out.println(getName() + "이 당신을 공격했습니다.");
		System.out.println(c.getName() + " 체력 -" + damage + ", 남은체력: " + (c.getHp() - damage));
		c.setHp(c.getHp() - damage);
		
	}
	
	public void breath(Characters c) {
//		공격력의 5배만큼의 대미지를 플에이
//		어에게 입히는 메서드
		
		int damage = getAtk() * 5;
		
		System.out.println(getName() + "이 당신에게 브레스를 사용했습니다.");
		System.out.println(c.getName() + " 체력 -" + damage + ", 남은체력: " + (c.getHp() - damage));
		c.setHp(c.getHp() - damage);
		
		count++;
	}
}



























