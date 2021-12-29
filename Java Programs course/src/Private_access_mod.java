class newEmployee
{
   private int id;
   private String name;
   public void setId(int n)
   {
       id=n;
   }
   public int getId()
   {
       return id;
   }
   public void setName(String r)
   {
       name=r;
   }
   public String getName()
   {
       return name;
   }
}
class asif
{
    int a;
    public int as(int n)
    {
        a=n;
        return a;
    }
}
class rectangle1
{
  private int length;
  private int width;
  public void setSide(int n)
  {
      length=n;

  }
  public void setWidth(int r)
  {
      width=r;
  }
  public int getArea()
  {
      return length*width;
  }

    public int getPerimeter() {
        return 2*(width+width);
    }
}
public class Private_access_mod {
    public static void main(String[] args) {

        //emp.id=55;  --> There is error due to private access modifier
        //emp.name="asif ali kodhan";
     newEmployee emp=new newEmployee();
     emp.setId(55);
     emp.setName("Asif ali kodhan");
        System.out.println(emp.getId());
        System.out.println(emp.getName());


asif ar=new asif();

        System.out.println(ar.as(5));

        rectangle1 rec=new rectangle1();
        rec.setSide(4);
        rec.setWidth(5);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
    }
}
