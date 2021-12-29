interface biCycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface greetint{
    int a=44;
    void greet1();
    void greet2();
}interface greetint1{
    void greet3();
    void greet4();
}
class sub implements biCycle,greetint,greetint1{
    int b=55;
    public void applyBrake(int decrement){
        System.out.println("applying brake");
    }
    public void speedUp(int increment){
        System.out.println("applying brake");
    }
    public void greet1(){
        System.out.println("good morning");
    }
   public void greet2(){
       System.out.println("good night");
   }
public     void greet3(){
        System.out.println("good afternoon");
    }
    public void greet4(){
        System.out.println("good nih=ght");

    }
}
public class abstract_vs_interface {
    public static void main(String[] args) {
        sub s=new sub();
        s.applyBrake(4);
        s.greet4();
        System.out.println(s.a);
//        s.a=45; error

    }//        we can create properties ni interface but cannot update

}
