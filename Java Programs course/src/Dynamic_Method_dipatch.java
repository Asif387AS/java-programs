class phone{
//    Dynamic Method dispatich or run time polymorphism
    public void showTime()
    {
        System.out.println("time noe 1:32 pm");
    }
    public void on()
    {
        System.out.println("turning on the phone");
    }
}
class smartPhone extends phone{
    public void music()
    {
        System.out.println("playing the music");
    }
    public void on()
    {
        System.out.println("turning on the smartphone");
    }
}

public class Dynamic_Method_dipatch {
    public static void main(String[] args) {
phone p= new smartPhone();
p.on();
p.showTime();
//p.music();//NOt allowed
//   smartPhone p=new phone();  //NOt allowed
    }
}
