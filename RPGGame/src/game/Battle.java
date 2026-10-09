//test
package game;

import java.util.Scanner;

public class Battle {

    Scanner sc = new Scanner(System.in);

    public void start() {

        Hero hero = new Hero("勇者", 100);

        Monster[] monsters = {
        	    new Monster("スライム", 50, 5),
        	    new Monster("ゴブリン", 80, 10),
        	    new Monster("ドラゴン", 150, 20)
        	};

        for (Monster monster : monsters) {

            System.out.println();
            System.out.println("==========");
            System.out.println(monster.name + " が現れた！");
            System.out.println("==========");

            while (hero.hp > 0 && monster.hp > 0) {

            	System.out.println();
            	System.out.println(
            	        hero.name +
            	        " Lv:" + hero.level +
            	        " HP:" + hero.hp);

            	System.out.println(
            	        "必殺技残り:" +
            	        hero.specialCount);

            	System.out.println(
            	        monster.name +
            	        " HP:" + monster.hp);

                System.out.println("1.攻撃");
                System.out.println("2.回復");
                System.out.println("3.必殺技");
                System.out.println("4.防御");
                

                int choice = sc.nextInt();

                if(choice == 1) {

                    hero.attack(monster);

                } else if(choice == 2) {

                    hero.heal();

                } else if(choice == 3) {

                    hero.specialAttack(monster);
                    
                } else if (choice == 4) {
                	
                    hero.defending = true;
                    System.out.println("勇者は身を守った！");                

                } else {

                    System.out.println("1～4を入力してください");
                }

                if (monster.hp <= 0) {

                    System.out.println(
                            monster.name + "を倒した！");

                    hero.gainExp(10);
                    hero.levelUp();

                    break;
                }

                int damage = monster.attackPower;

                if (hero.defending) {
                    damage = damage / 2;
                    System.out.println("防御でダメージを半減した！");
                }

                hero.hp -= damage;

                System.out.println(
                        monster.name + "の攻撃！ "
                        + damage + "ダメージ！");

                hero.defending = false;

                if (hero.hp <= 0) {

                    System.out.println("ゲームオーバー");
                    return;
                }
            }
        }

        System.out.println();
        System.out.println("ゲームクリア！");
        
    }
}