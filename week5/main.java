package week5;

public class main {
    public static void main(String[] args) {
        Counter seksboy = new Counter();
        seksboy.increase();
        seksboy.increase();
        seksboy.decrease();
        System.out.println(seksboy.value());
    }
}
