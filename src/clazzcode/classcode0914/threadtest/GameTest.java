package clazzcode.classcode0914.threadtest;

public class GameTest {
    static Hero timo = new Hero();
    static Hero thresh = new Hero();
    public static void main(String[] args) {

        timo.setName("提莫");
        timo.setHealth(1800);
        timo.setDamage(200);
        timo.setStatus("alive");

        thresh.setName("锤石");
        thresh.setHealth(2000);
        thresh.setDamage(320);
        thresh.setStatus("alive");

        TimoAttackThreshThread timoAttack = new TimoAttackThreshThread(timo, thresh);
        timoAttack.start();

        ThreshAttackTimoThread threshAttack = new ThreshAttackTimoThread(thresh, timo);
        threshAttack.start();

    }
}
