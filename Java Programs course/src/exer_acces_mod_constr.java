class cylinder
{
    private int height;
    private int radius;

    public cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceAreA()
    {
        return 2* Math.PI*radius*radius+2* Math.PI*radius*height;
    }
    public double volume()
    {
        return  Math.PI*radius*radius*height;
    }
}
class rectangle2
{
 private int length;
 private int breadth;

    public rectangle2() {
        this.length = 4;
        this.breadth = 5;
    }
    public  rectangle2(int length,int breadth)
    {
        this.breadth=breadth;
        this.length=length;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
    class circle2
    {
       private int radius;

        public circle2(int radius) {
            this.radius = radius;
        }
//
//        public void setRadius(int radius) {
//            this.radius = radius;
//        }
//
        public int getRadius() {
            return radius;
        }
        public double surfaceArea()
        {
            return 4* Math.PI*radius*radius;
        }
        public double volume()
        {
            return (4/3)* Math.PI*radius*radius*radius;
        }

    }

public class exer_acces_mod_constr {
    public static void main(String[] args) {
        //Problem 3
        cylinder cyl= new cylinder(12,9);
        //Problem 1
       // cyl.setHeight(12);
       // cyl.setRadius(9);
        System.out.println(cyl.getHeight());
        System.out.println(cyl.getRadius());
//Problem 2
        System.out.println(cyl.surfaceAreA());
        System.out.println(cyl.volume());

        //Problem 4
        rectangle2 rec=new rectangle2(5,4);
       System.out.println(rec.getBreadth());
        System.out.println(rec.getLength());


        circle2 c=new circle2(3);

        //Problem NO 5

        //c.setRadius(5);
        System.out.println(c.getRadius());
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());


    }
}
