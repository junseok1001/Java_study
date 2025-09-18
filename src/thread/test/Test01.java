package thread.test;

public class Test01 {
    public static void main(String[] args) {


        Crying tiger = new Crying("어흥");
        Crying cow = new Crying("음메~");
        Crying horse = new Crying("히잉");

        Thread tigerThread = new Thread(tiger);
        Thread cowThread = new Thread(cow);
        Thread horseThread = new Thread(horse);

        tigerThread.start();
        cowThread.start();

        try {
            tigerThread.join();
            cowThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        horseThread.start();
    }
}
