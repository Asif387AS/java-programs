class base1
{
    base1()
    {
        System.out.println("I am constructor without arguments");
    }
    base1(int x)
    {
        System.out.println("I am constructor with arguments"+ x);
    }
}
    class Derived1 extends base1
    {
        Derived1()
        {
           // super(2);
            System.out.println("I am constructor of Derived without arg");
        }
        Derived1(int x , int y)
        {
            super(x);
            System.out.println("I am constructor of Derived with arg with value"+y);
        }
    }

class child1 extends Derived1
{
    child1()
    {
        // super(2);
        System.out.println("I am constructor of child1 without arg");
    }
    child1(int x , int y,int z)
    {
        super(x,y);
        System.out.println("I am constructor of child1 with arg with value"+z);
    }
}

class child2 extends child1
{
    child2()
    {
        // super(2);
        System.out.println("I am constructor of child2 without arg");
    }
    child2(int x , int y,int z, int a)
    {
        super(x,y,z);
        System.out.println("I am constructor of child2 with arg with value"+a);
    }
}

public class inheritance_constructor {
    public static void main(String[] args) {
      //  Derived1 d= new Derived1(2,4);
      //  child1 c=new child1(3,4,5);
        child2 c = new child2(2,2,4,5);


    }
}
