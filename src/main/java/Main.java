import java.util.Random;

public class Main {

    public static void main(String[] args) {

        for (int random : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + random);
            if (random == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}



