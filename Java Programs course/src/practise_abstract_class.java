abstract class pen{
    abstract void write();
    abstract void refil();
}
class fountpen extends pen {
    void write(){
        System.out.println("write");
    }
    void refil(){
        System.out.println("refil");
    }
    void changenip(){
        System.out.println("Changenip");
    }
}

class monkey{
    void jump(){
        System.out.println("jumping....");
    }
    void bite(){
        System.out.println("biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

    void speak(){
        System.out.println("speaking");
    }
}
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartPhone1 extends telephone{

    void ring(){
        System.out.println("ringing....");
    }
    void lift(){
        System.out.println("lifting");
    }
    void disconnect(){
        System.out.println("disconnected..");
    }
}


interface TVRemote{
    void pressBtn();
}
interface smartTVRemote extends TVRemote{
    void pressBtn();
}
class TV implements TVRemote{
    @Override
    public void pressBtn() {
        System.out.println("presssing the button on remote");
    }
}
public class practise_abstract_class {
    public static void main(String[] args) {
fountpen f=new fountpen();
f.changenip();
f.refil();
f.write();

human h=new human();
h.eat();
h.sleep();
h.bite();
h.jump();

//Q5
        monkey m=new human();
        m.bite();
        m.jump();
//        m.speak(); -->error
        BasicAnimal b=new human();
        b.eat();
        b.sleep();
//        b.speak(); -->error

//        Q4
        telephone t=new smartPhone1();
        t.disconnect();
        t.lift();
        t.ring();


//    Q6+Q7
    TV tv =new TV();
}
}