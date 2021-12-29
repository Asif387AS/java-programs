interface camera{
    void takesnap1();

}
interface audio extends camera{
    void listenaudio();
}
class myphone{
    void call(){
        System.out.println("calling");
}
}
 class smartphone extends myphone implements camera{
    public void takesnap1()
    {
        System.out.println(" take the photos");
    }
    public void listenaudio(){
        System.out.println("listening the songs of Amrinder");
    }

 }
public class interfaces_polymorphism {
    public static void main(String[] args) {
camera c= new smartphone();
c.takesnap1();
    }
}
