public class over_loading2 {
     static int asif(int a)
    {
        a=55;
        return a;
    }
    static void change2(int [] mar)
    {

        mar[1]=77;
    }
    //   METHOD overloading
    static void a()
    {
        System.out.println("HI! Asif GOOd MOrning");
    }
    static void a(int k,int s)
    {
        int sum;
        sum= k+s;
        System.out.println("SUM="+sum);
    }
    public static void main(String[] args) {

        //case1: changing the integer but not changed bcz copy is passed
        int x=44;
      asif(x);
        //       case2: changing the array but changed bcz of refernce passed
      int [] marks={55,24,66,33};
      change2(marks);
        System.out.println(x);
        System.out.println(marks[1]);

//METHOED OVERLOADING
        a();
        a(5,4);

    }
}
