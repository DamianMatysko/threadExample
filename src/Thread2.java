import java.util.Random;

public class Thread2 extends Thread {

    public int returnRandomMillis() {
        return new Random().nextInt(200) + 1000;
    }

    public void soutNumberFromOtherThread(int number) {
        System.out.println("THREAD 2: Other thread is sleeping for " + number);
    }
}