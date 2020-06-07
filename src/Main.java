
public class Main {
    public static void main(String[] args) {
        Executor m=new Executor();
        try {
            m.StartCommunication();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
