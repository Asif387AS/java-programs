class overloading{
    int x;
     void overloading1(){
        System.out.println("overloading");
    }
    void overloading1(int n){
        x=n;
        System.out.println(x);
    }

}
class  overriding extends overloading{
    @Override
     void overloading1(){
        System.out.println("overriding");

    }
}
public class overloading_overrinding {
    public static void main(String[] args) {
       overloading o=new overloading();
       overriding r=new overriding();
       o.overloading1();
       r.overloading1();

    }
}
