package FightGame;

import java.util.*;

public class Character {
	
	//객체
	String name;
	int hp;
	int Maxdam;
	
	Random r = new Random();
	//메소드
	public Character(String name, int hp,int Maxdam) {
		this.name = name;
		this.hp = hp;
		this.Maxdam = Maxdam;
	}
	
	public int attack() {
		return r.nextInt(Maxdam) + 1;
	}	
}


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


package FightGame;

import java.util.*;

public class Boss extends Character {
	public Boss(String name, int hp, int Maxdam) {
		super(name, hp, Maxdam);
	}
	
	public int SpecialAttack() {
		this.hp = this.hp - 10;
	}
}


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


package FightGame;

import java.util.*;

public class Game {

	public static void main(String[] args) {
		Character me = new Character("이은우", 200, 15);
		Boss boss = new Boss("보스", 300, 20);
		Random r = new Random();

		System.out.println(me.name + "의 남은 체력: " + me.hp);
		System.out.println(boss.name + "의 남은 체력:" + boss.hp);

		

		while (true) {

				int Myattack = me.attack();
				boss.hp = boss.hp - Myattack;
				System.out.println("내가" + Myattack + "만큼 공격했습니다.");
				System.out.println(boss.name +"의 남은 체력은" + boss.hp);

			int IsSpecialAttack = r.nextInt(5);
			int bossAtk;

			if (IsSpecialAttack == 0) {
				bossAtk = boss.SpecialAttack();
				System.out.println("보스가 필살기를 시전했다. 입힌 피해: " + bossAtk);
				me.hp = me.hp - bossAtk;
				System.out.println(me.name + "의 남은 체력은" + me.hp);
			} else {
				bossAtk = boss.attack();
				System.out.println("보스가 공격을 했다. 입힌 피해: " + bossAtk);
				me.hp = me.hp - bossAtk;
				System.out.println(me.name + "의 남은 체력은" + me.hp);
			}
			if(me.hp <= 0) {
				System.out.println("보스가 이겼습니다");
				break;
			}
			else if (boss.hp <= 0) {
				System.out.println("내가 이겼습니다");
				break;
			}
		}
		System.out.println("게임이 끝났습니다.");
	}
}
