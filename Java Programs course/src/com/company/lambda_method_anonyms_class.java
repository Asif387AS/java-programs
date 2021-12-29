package com.company;

import javax.swing.*;
import java.security.PublicKey;
@FunctionalInterface //interface will conatin only one functon
interface DemoAno1{
    public void meth1(int a);
//    public void meth2();
}
//class asif33 implements DemoAno1{
//
//    @Override
//    public void meth1() {
//        System.out.println("i am meth1");
//    }
//}



//class AnonyDemo implements DemoAno1{
//    public void display(){
//        System.out.println("hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}
public class lambda_method_anonyms_class {
    public static void main(String[] args) {
//        AnonyDemo obj=new AnonyDemo();
//    obj.meth1();
//        we can do this with the refence of interface class
//     DemoAno1 obj=new AnonyDemo();
//    obj.meth1();

//        we can do this by using the anonymous class
//        ANONYMOUS CLASS:it is can be used only one time and it is declared and initialize at same time
//        DemoAno1 obj=new DemoAno1() {
//            @Override
//            public void meth1() {
//                System.out.println("i am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

//        lambda method:
//        DemoAno1 obj=new asif33();
//        obj.meth1();

        DemoAno1 obj2=(a)->{
            System.out.println("this is meth1"+ a);
        };
        obj2.meth1(3);
    }
}
