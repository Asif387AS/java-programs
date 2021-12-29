class circle3{
    int radius;

    circle3(){
        System.out.println("i am non para constrcutor of circle3");
    }
    circle3(int r){
        this.radius=r;
        System.out.println("i am paramarized const of circl3");
    }
     double area(){
        return Math.PI*this.radius*this.radius;
     }
}
class cylinder3 extends circle3{
    int height;
    cylinder3(int r, int h){
        super(r);
        this.height=h;

    }

    double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class exer_inher_51 {
    public static void main(String[] args) {
cylinder3 c=new cylinder3(3,3);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
