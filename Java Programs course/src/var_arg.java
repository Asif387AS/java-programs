public class var_arg {
   // static int asif(int ...arr)  useful when need not any argument
   static void asif(int x, int ...arr)  //when neee at least one argumemt
    {
        int sum=x;
        for (int d:arr) {
            sum+=d;
        }
        //return sum;  //with retrun value
        System.out.println("sum="+sum); //without return value



    }
    public static void main(String[] args) {
       asif(4);
        //System.out.println("NO argrument for sum ="+asif());
//        System.out.println("sum of 5 is equal to ="+asif(5));
//        System.out.println("sum of 5,3 is equal to ="+asif(5,3));
//        System.out.println("sum of 5,2,5 is equal to ="+asif(5,2,5));
    }
}
