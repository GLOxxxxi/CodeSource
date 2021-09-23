package clazzcode.classcode0914.threadtest;

import java.util.TreeMap;

public class TimoAttackThreshThread extends Thread {

    private  Hero hero;
    private  Hero attackHero;

    public TimoAttackThreshThread(Hero hero, Hero attackHero) {
        this.hero = hero;
        this.attackHero = attackHero;
    }

    @Override
    public void run() {
        Attack.attack(hero, attackHero);


    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Hero getAttackHero() {
        return attackHero;
    }

    public void setAttackHero(Hero attackHero) {
        this.attackHero = attackHero;
    }
}
