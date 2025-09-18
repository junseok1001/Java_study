package thread.test;

public class Crying implements Runnable{

    private String cry;

    public Crying(String cry){
        this.cry = cry;
    }

    @Override
    public void run(){

        for(int i = 0; i < 5; i++){


            System.out.println(cry);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
