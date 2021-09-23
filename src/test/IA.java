package test;

public interface IA {
    void play();
    default void getMessage() {
        play();
        System.out.println(2);
    }
}
