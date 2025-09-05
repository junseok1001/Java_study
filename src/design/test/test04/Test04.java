package design.test.test04;

public class Test04 {
    public static void main(String[] args) {

        Lotto lotto = new Lotto();

        lotto.passiveLotto(1, 5, 42, 15, 30, 2);
        lotto.printInfo();

        lotto.autoLotto();
        lotto.printInfo();


    }
}
