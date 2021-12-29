package com.company;
class invalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 and 9";
    }
    @Override
    public String getMessage(){
        return "I am not asif";
    }
}
class cannotDivideByZero extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }
    @Override
    public String getMessage(){
        return "I am not asif";
    }
}class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "input is greater than 100000";
    }
    @Override
    public String getMessage(){
        return "I am not asif";
    }
}
class MaxMultiplyInputExceptin extends Exception{
    @Override
    public String toString(){
        return "input cannot be greater than 7000";
    }
    @Override
    public String getMessage(){
        return "I am not asif";
    }
}
class customCalculator{
    double add(double a, double b) throws invalidInputException,MaxInputException{
        if (a>100000 || b>10000){
            throw new MaxInputException();
        }
        if (a==8||b==9) {
            throw new invalidInputException();
        }
        return a+b;
    }double sub(double a, double b) throws MaxInputException{
        if (a>100000 || b>10000){
            throw new MaxInputException();
        }
        return a-b;
    }double mult(double a, double b)throws MaxInputException,MaxMultiplyInputExceptin{
        if (a>100000 || b>10000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyInputExceptin();
        }
        return a*b;
    }double div(double a, double b) throws  cannotDivideByZero{
        if (b==0){
            throw new cannotDivideByZero();
        }
        return a / b;
    }
}
public class Practise_Custom_calcultor_ex6 {
    public static void main(String[] args) throws invalidInputException,cannotDivideByZero,MaxInputException,MaxMultiplyInputExceptin {
        customCalculator c=new customCalculator();
//        double sum=c.add(8,9);
//        System.out.println(sum);
//        c.div(4,0);
//        c.add(4,444444);

        c.mult(7777,5);


    }
}
