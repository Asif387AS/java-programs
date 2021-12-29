//import java.util.Random;
//import java.util.Scanner;
//class Game{
//    int noOfGuesses;
//    int number;
//     int inputNumber;
//
//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }
//
//    public void setNoOfGuesses(int noOfGuesses) {
//        this.noOfGuesses = noOfGuesses;
//
//        Game{
//            Random rand=new Random();
//            this.number=rand.nextInt(100);
//        }
//
//        int takeUserInput(){
//            System.out.println("Guess the number");
//            Scanner sc=new Scanner();
//            inputNumber=sc.nextInt();
//        }
//
//        boolean isCorrectNO(){
//            noOfGuesses++;
//            if (inputNumber==number){
//                System.out.format("Yes! yor guessed it right ,it used %d \n you guessed it in %d attempts",number);
//                return true;
//            }
//            else if(inputNumber<number){
//                System.out.println("too low");
//            }
//            else if(inputNumber>number){
//                System.out.println("too high");
//            }
//        }
//    }
//}
//public class Exercise3 {
//    public static void main(String[] args) {
//        Game g=new Game();
//        boolean b=true;
//        while (b){
//
//        }
//    }
//}
