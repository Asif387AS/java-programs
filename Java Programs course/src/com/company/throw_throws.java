package com.company;

class NagativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "NagativeRadiusException";
    }

    @Override
    public String getMessage() {
        return "NagativeRadiusException";
    }
}

public class throw_throws {

    public static double area(int r) throws NagativeRadiusException{
        if(r<0){
            throw new NagativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;

    }
    public static int avg(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
//            int c= avg(30,0);
//            System.out.println(c);
            double arr=area(4);
            System.out.println(arr);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}
