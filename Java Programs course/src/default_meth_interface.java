interface biCycle1{
    //void getNetworks();
    void applyBrake(int decrement);
    void speedUp(int increment);
    private void kasi(){
        System.out.println("this is private method");
    }
    default void asif(){
        kasi();
        System.out.println("this is asif method");
    }
}
interface greetint2{
    int a=44;
    void greet1();
    void greet2();
}interface greetint4{
    void greet3();
    void greet4();
}
class sub1 implements biCycle1,greetint2,greetint4 {
    int b = 55;

    public void applyBrake(int decrement) {
        System.out.println("applying brake");
    }

    public void speedUp(int increment) {
        System.out.println("applying brake");
    }

    public void greet1() {
        System.out.println("good morning");
    }

    public void greet2() {
        System.out.println("good night");
    }

    public void greet3() {
        System.out.println("good afternoon");
    }

    public void greet4() {
        System.out.println("good nih=ght");

    }
}

class subgrp extends sub1{
     String[] getNetworks(){
        System.out.println("getting the list of networks");
        String[] networklist= {"asif","saqib","kashi"};
        return networklist;

    }
}
public class default_meth_interface {
    public static void main(String[] args) {
        subgrp s=new subgrp();
        s.applyBrake(4);
        s.greet4();
        System.out.println(s.a);
//        s.a=45; error
s.asif();
//s.saqi();
String[] arr= s.getNetworks();
        for (String item:arr) {
            System.out.println(item);

        }
                          //        we can create properties ni interface but canno
    }
}
