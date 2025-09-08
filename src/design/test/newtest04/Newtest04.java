package design.test.newtest04;

public class Newtest04 {

    public static void main(String[] args) {

        LottoChecker checker = new LottoChecker();
//        checker.setWinningNumber(3, 4, 12, 20, 35, 40);
        checker.drawLots();
        checker.printInfo();
//        int count = checker.checkCount(lotto);
//        System.out.println(count);

        for(int i = 0; i < 8145080; i++){
            Lotto lotto = new Lotto();
            lotto.auto();
            if(checker.checkCount(lotto) == 6){
                System.out.println("1등");
            }
        }


//        Lotto lotto = new Lotto();
//
//        lotto.manual(4, 5, 12, 19, 20 , 35);
//        lotto.printInfo();
//
//        checker.printResult(lotto);
//
//        Lotto lotto2 = new Lotto();
//        lotto2.auto();
//        lotto.printInfo();
//        checker.printResult(lotto2);


    }
}
