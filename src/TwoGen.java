package academy.learnprogramming;

public class TwoGen <T,V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    void showType(){
        System.out.println("Typem T jest " + ob1.getClass().getName());

        System.out.println("Typem V jest " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }
}
