abstract class parent{
    parent(){
        System.out.println("HI! broo Assalamu alikum ");
    }
    public void hello() {
        System.out.println("Hello broo");
    }
        abstract public void greet();
        abstract public void greet1();
//        abstract public void greet3();
    }
    abstract class child extends parent{
        abstract public void greet3();

        public void greet(){
            System.out.println("Hi good morning bro");

        }
        public void greet1(){
            System.out.println("HI good afternoon");
        }
    }
    class subchild extends child{
    public void greet3(){
        System.out.println("i am greet3");
    }
    }

public class Abstract_Method_class {
    public static void main(String[] args) {
subchild d=new subchild();
        d.greet();

        d.greet3();
        d.greet1();
    }
}
