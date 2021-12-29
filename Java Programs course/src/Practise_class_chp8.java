class Employee
{
    int salery;
    String name;

    public int getSalery()
    {
        return salery;
    }

    public String getName()
    {
        return name;
    }
    public int setName(String n)
    {
      name=n;
      return 0;
    }

}
class cellPhone  //we can make separate mathods for each action
{
    public void callFriend()
    {
        System.out.println("calling.....");
        //System.out.println("ringing.....");
       // System.out.println("vibrating");

    }
    public void ring()
    {
        System.out.println("ringing.....");
    }
    public void vobrate()
    {
        System.out.println("vibrating");
    }
}
class square
{
    int side;
    public int area()
    {
       return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}

class rectangle
{
    int width;
    int length;
    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }
}
class tommy
{
    public void hit()
    {
        System.out.println("Hitting the enemy");

    }
    public void fire()
    {
        System.out.println("firing the enemy");
    }
    public void shooting()
    {
        System.out.println("i shooting the enemy");
    }
}
class circle
{
    int radius;
    public double area()
    {
        return  (3.14*radius*radius);
    }
    public double circumference()
    {
        return 2*3.14*radius;
    }
}

public class Practise_class_chp8 {
    public static void main(String[] args) {
        //PROBLEM NO 1
Employee asif= new Employee();
asif.salery=6000;
        System.out.println(asif.getSalery());
       asif.setName("asif ali kodhan");
        System.out.println(asif.getName());
        //PROBLEM 2
        cellPhone tecno=new cellPhone();
        tecno.callFriend();
        tecno.ring();
        tecno.vobrate();

        //PROBLEM NO 3
        square sq= new square();
                sq.side=3;
        System.out.println("The area of square"+sq.area());
        System.out.println("The perimeter of square"+sq.perimeter());
        //Problem NO 4
        rectangle rec=new rectangle();
        rec.length=8;
        rec.width=3;
        System.out.println("The area of rectangle"+rec.area());
        System.out.println("The perimeter of rectangle"+rec.perimeter());
        //Problem 5
        tommy pubg=new tommy();
        pubg.fire();
        pubg.hit();
        pubg.shooting();

        //Problem NO 6
        circle cir=new circle();
        cir.radius=5;
        System.out.println("The area of circle ="+ cir.area());
        System.out.println(" The circumferecne of circle ="+ cir.circumference());
    }
}
