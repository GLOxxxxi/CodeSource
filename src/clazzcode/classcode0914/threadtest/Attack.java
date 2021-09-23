package clazzcode.classcode0914.threadtest;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Attack {

    public static void attack (Hero hero, Hero attackHero) {

        if (hero.getStatus().equals("alive")) {
            while (hero.getHealth() > 0) {
                System.out.println(hero.getHealth() + "hp" + hero.getName() + "<----" + attackHero.getName() + attackHero.getHealth() + "hp");
                hero.setHealth(Math.max(hero.getHealth() - attackHero.getDamage(), 0));
                System.out.println(hero.getName() + "被" + attackHero.getName() + "打了，" + attackHero.getName() + "剩余血量：" + hero.getHealth() + " hp");
                if (attackHero.getHealth() <= 0) {

                    try {
                        Thread.sleep(180000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.err.println(hero.getName() + "攻击间隔");
                }
            }

        }
    }
}
