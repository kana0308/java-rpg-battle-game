package game;

public class Monster extends Character {

    int attackPower;

    public Monster(String name, int hp, int attackPower) {

        super(name, hp);

        this.attackPower = attackPower;
    }

    public void attack(Hero hero) {

        hero.hp -= attackPower;

        System.out.println(
                name + "の攻撃！ "
                + attackPower + "ダメージ！");
    }
}