package com.company;

public class finally_block {
    public static int greet(){
        try {
            int a=2;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of progrma");

        }
        return 0;
    }
    public static void main(String[] args) {
        greet();
        int a=3;
        int b=5;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }finally {
                System.out.println("i am finally");
            }
            b--;
        }


//        we can also use finaly with try only
        try {
            System.out.println(22/4);
        }finally {
            System.out.println("I am finally only with try");
        }
    }
}
