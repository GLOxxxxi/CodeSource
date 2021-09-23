package test;

public class ABImpl implements IA{
    @Override
    public void play() {
        System.out.println("wan");
    }

    @Override
    public void getMessage() {
        IA.super.getMessage();
    }
}
