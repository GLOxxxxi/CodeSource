package clazzcode.classcode0914.threadtest;

public class ThreshAttackTimoThread extends Thread {

    private  Hero hero;
    private  Hero attackHero;

    public ThreshAttackTimoThread(Hero hero, Hero attackHero) {
        this.hero = hero;
        this.attackHero = attackHero;
    }

    @Override
    public void run() {
        Attack.attack(hero, attackHero);

    }

    public Hero getAttackHero() {
        return attackHero;
    }

    public void setAttackHero(Hero attackHero) {
        this.attackHero = attackHero;
    }


    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
