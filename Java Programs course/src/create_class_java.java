import com.company.string;

class regular
{
int id;
String name;
int totol;
int r;
int p;
float avarage;
int tot;
   public void details()
    {
        System.out.println("My name is  "+name);
        System.out.println("My id is "+id);
    }
    public void s(int n,int i)
    {
      totol=n+i;
        System.out.println("SUm of integers is ="+totol);
    }
public void avg()
{
    tot=r+p;
    avarage=tot/2f;
    System.out.println(avarage);
}

}
public class create_class_java {
    public static void main(String[] args) {
        //creating our own java custom class
        regular kashi= new regular();//instantiatiog a new kashi object
        regular saqi= new regular(); //instantiation a new saqi object
        //intitialize the attributes......setting the attrubutes
kashi.id=55;
kashi.name= "asif";
//setting the attributes
    saqi.id=44;
          saqi.name="saqi";

//printing the attrubutes
      kashi.details();
      saqi.details();
       // System.out.println(kashi.id);
       // System.out.println(kashi.name);

//SUm of two No
        regular sum=new regular();
        sum.s(4,5);

        //Avarage of two NO
        regular av=new regular();
        av.r=5;
        av.p=6;
        av.avg();




        kashi.s(5,5);
    }
}
