package game;

public class Hero extends Character {

    int level;
    int exp;
    int specialCount;
    
    boolean defending = false;


    public Hero(String name, int hp) {
        super(name, hp);

        this.level = 1;
        this.exp = 0;
        this.specialCount = 3;
    }
    

    
    public void specialAttack(Monster monster) {

        if(specialCount <= 0) {

            System.out.println(
                    "必殺技はもう使えない！");
            return;
        }

        int damage = 30;

        monster.hp -= damage;

        specialCount--;

        System.out.println(
                name + "の必殺技！！");

        System.out.println(
                damage + "ダメージ！");
    }

    public void heal() {

        hp += 20;

        System.out.println(
            name + "は20回復した");
    }
    
    public void gainExp(int amount) {

        exp += amount;

        System.out.println(
            amount + "経験値獲得！");
    }
    
    public void levelUp() {

        if(exp >= 10) {

            level++;

            hp += 20;
            attackPower += 5;

            exp = 0;

            System.out.println();
            System.out.println("レベルアップ！");
            System.out.println("現在Lv:" + level);
        }
    }
   
}

