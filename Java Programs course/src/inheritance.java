class base
{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("i am base and setting x now");
    }
    public int cons()
    {
        System.out.println("Hi! i am consturctor");
        return 0;
    }
}
class derived extends base
{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
 class animal
 {
   public boolean anima()
     {
         System.out.println("hi i am buffalo and am crying");
         return false;
     }
 }
 class dog extends animal
 {
     public boolean dol()
     {
         System.out.println("hi i am dog and am barking");
         return true;
     }

 }
public class inheritance {
    public static void main(String[] args) {
       derived dr=new derived();
       dr.setX(4);
       dr.setY(4);
        System.out.println(dr.cons());
        System.out.println(dr.getX());
        System.out.println(dr.getY());

//        we can access only base class elements by creating base class objects
//        base bs=new base();
//        dr.setX();
        dog dg = new dog();
        System.out.println(dg.anima());
        System.out.println(dg.dol());


    }
}
