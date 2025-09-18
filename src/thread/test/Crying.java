package thread.test;

public class Crying implements Runnable{

    @Override
    public void run(){

        for(int i = 0; i < 5; i++){


            System.out.println("어흥");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
