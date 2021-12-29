interface parent5{
    void meth1();
    void meth2();
}
interface child5 extends parent5{
    void meth3();
    void meth4();
}
class mychild implements child5{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}
class child3 extends mychild{
    child3(){
        System.out.println("this is child3 class constructors");
    }

}
public class inheritance_in_interfaces {
    public static void main(String[] args) {
    child3 m= new child3();
    m.meth1();
    m.meth2();
    m.meth3();
    m.meth4();

    }
}
