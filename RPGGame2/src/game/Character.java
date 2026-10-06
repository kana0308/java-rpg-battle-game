package game;

public class Character {

    String name;
    int hp;
    int attackPower;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.attackPower = 10;
    }
    
    public Character(String name,int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void attack(Character monster) {

        monster.hp -= attackPower;

        System.out.println(
            name + "の攻撃！ "
            + attackPower + "ダメージ！");
    }
    

}