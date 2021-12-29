import java.sql.SQLOutput;

class myMainEmployee {
    private int id;
    private String name;
myMainEmployee()
{
    id=33;
    name="Asif ali";
}
    myMainEmployee(int i, String n)
    {
        id=i;
        name=n;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}

public class constructors {
    public static void main(String[] args) {
        myMainEmployee emp= new myMainEmployee(44,"asif ali");
        myMainEmployee em= new myMainEmployee();
        System.out.println(emp.getId());
        System.out.println(emp.getName());

        System.out.println(em.getId());
        System.out.println(em.getName());

    }
}
