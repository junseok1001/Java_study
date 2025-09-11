package interfaces.test.test01;

public class Test01 {
    public static void main(String[] args) {

        //회사에서 연기자와 가수를 공고를 냄
        JypEntertainment jyp = new JypEntertainment();



        // 사용자가 지원요건에 맞으며(implement act, idol) 무엇을 할수있는지 보여줌
        EntertainerApplicant jon = new EntertainerApplicant("jon" , 29);

        jyp.actorAudition(jon);
        jyp.idolAudition(jon);



    }
}
