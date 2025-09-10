package abstracts.test.test02;

public class Test02 {

    public static void main(String[] args) {

        ChangeUnit[] change = new ChangeUnit[4];
        change[0] = new Temperature(32);
        change[1] = new Temperature(14);
        change[2] = new CmToInch(15.0);
        change[3] = new CmToInch(100.0);

//
        for(int i = 0; i < change.length; i++){
            change[i].printResult();
        }

    }
}
