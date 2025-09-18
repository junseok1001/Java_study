package thread.test;

public class Test01 {
    public static void main(String[] args) {


        Crying crying = new Crying();
        Thread tiger = new Thread(crying);

        Barking barking = new Barking();
        Thread cow = new Thread(barking);

        try {
            cow.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        for(int i = 0; i < 5; i++){
            System.out.println("히잉");
        }

    }
}
