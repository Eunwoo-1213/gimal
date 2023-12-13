#Hero 클래스
package zombie;

import java.util.*;

public class Hero {
	String name;
	int pos;
	int life;
	Random r = new Random();
	
	public Hero(String name, int pos, int life) {
		this.name = name;
		this.pos = pos;
		this.life = life;
	}
	
	public void leftmove() {
		pos = pos - 1;
		if(pos < 1) pos = 1;
		System.out.println(name+"이 왼쪽으로 이동하여 현재 위치는" + pos + "입니다.");
	}
	
	public void rightmove() {
		pos = pos + 1;
		if(pos > 20) pos = 20;
		System.out.println(name+"이 오른쪽으로 이동하여 현재 위치는" + pos + "입니다.");
	}
	
	public void jump() {
		int j = r.nextInt(3)+1;
		pos = pos + j;
		if(pos > 20) pos = 20;
		System.out.println(name+"이" + j + "만큼 점프하였습니다." + "현재 위치는" + pos + "입니다.");
	}
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
#Zombie 클래스
  package zombie;

import java.util.*;
public class Zombie {
	String name;
	int pos;
	Random r = new Random();
	
	// 생성자
	public Zombie(String name, int pos) {
		this.name = name;
		this.pos = pos;

	}

	public void move() {
		pos = pos + r.nextInt(3) - 1;
		if(pos < 1) pos = 1;
		System.out.println(name + "의 현재위치는" + pos +"입니다.");
		
	}
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
#zombieGame

  package zombie;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Zombie zom1 = new Zombie("좀비1", 7);
		Zombie zom2 = new Zombie("좀비2", 15);
		Hero hero = new Hero("이은우", 1, 3);

		while (true) {
			System.out.println("왼쪽(1), 오른쪽(2), 점프(3)");
			int input = s.nextInt();
			if (input == 1)
				hero.leftmove();
			else if (input == 2)
				hero.rightmove();
			else if (input == 3)
				hero.jump();

			zom1.move();
			zom2.move();

			if ((hero.pos == zom1.pos) || (hero.pos == zom2.pos)) {
				hero.life = hero.life - 1;
				if (hero.life == 0) {
					System.out.println("생명이 0 입니다. 게임을 종료합니다.");
				} else {
					System.out.println("좀비에게 잡혔습니다. 현재 나의 생명은" + hero.life + "입니다. 처음위치에서 다시 시작합니다.");
					hero.pos = 1;
				}
			}
			if (hero.pos >= 20) {
				System.out.println("미션 클리어!!! 목적지에 도착했습니다.");
				break;
			}
		}
	}

}
