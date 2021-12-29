public class Recursion_fun {

    static int fact(int x)


    {
        if (x==0||x==1)
        {
          return 1;
        }
        else {
            int facto=1;
            facto=x*fact(x-1);//Recursion functon implementation
            return facto;

        }
    }

    static int fact_iter(int x)
    {
        if (x==0||x==1)
        {
            return 1;
        }
        else {
            int facto=1;

            for(int i=1;i<=x;i++);
            {
                int i=1;
                facto*=i;
            }
            return facto;
        }
    }
    public static void main(String[] args) {
      // fact(3);
        System.out.println("factorial is equal to "+fact(1));
        System.out.println("factorial is equal to "+fact_iter(3));
    }
}
