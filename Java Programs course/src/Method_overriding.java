class A{
    public int a;
    public int asif(int s){
        a=s;
        return a;
    }
    public void A(){
        System.out.println("i am method of class A");
    }
}
class B extends A{
    @Override
    public void A(){
        System.out.println("i am  override method of class B");
    }
}
  class C extends B{
    int r=3;
    int l=4;
    int sum;

      @Override
      public int asif(int s) {
          return super.asif(s);
      }

      public void A()
    {
            sum=r+l;
        System.out.println(sum);
    }
  }
public class Method_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.A();
        B b = new B();
        b.A();
        System.out.println(b.asif(5));
        C c=new C();
        c.A();
    }
}
