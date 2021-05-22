package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Typy sparametryzowane");

	    tgObj.showType();

	    int v = tgObj.getOb1();
        System.out.println("wartosc " + v);

        String str = tgObj.getOb2();

        System.out.println("wartosc " + str);
    }
}
