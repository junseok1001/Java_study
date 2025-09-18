package thread.test;

public class Barking implements Runnable{

    @Override
    public void run(){

        for(int i = 0 ; i < 5; i++){


            System.out.println("음메");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
