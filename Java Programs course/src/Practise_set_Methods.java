public class Practise_set_Methods {
    //PROBLEM SET 1
    static int table(int x)
    {
        for(int i=1; i<=10;i++)
        {
            System.out.format("%d X %d=%d\n", i, x, i * x);
        }
        return 0;
    }
  //  PROBLEM SET 2
    static void asterisk(int n)
    {
        for(int i=0; i<n; i++)
        {                               //i=0,j=0
            for(int j=0;j<i+1;j++)      //also j<i+1;
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
// PROBLEM SET 3          to find the asterisk order in the ascending order
    static void asterisk1(int n)
    {
        for(int i=n; i>n; i--)
        {                               //i=0,j=0
            for(int j=0;j>i-1;j--)      //also j<i+1;
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //PROBLEM SET 4        to find the sum of first n natural no
    static int recursion(int x)
    {
        if(x==1)
        {
            return 1;
        }
        return x + recursion(x-1);
    }
    //PROBLEM SeT 5
    static int fab(int n)
    {                           //fabanacci series: 0,1,,1,2,3,5,8,13......
        if(n==1||n==2)             //6+5,5+4,4+3
        return n-1;
        else
        {
            return fab(n-1)+fab(n-2);
        }
    }
//Practise Problem 6
    static int avg(int ...asif)
    {
        int sum=0;
        int avag=0;
        for ( int x:asif) {
           sum=sum+x ;
           avag =sum/2;
        }
        return avag;
    }
    //problem #7    Repeat 3 using recursion
    static void ast_rec(int x)
    {
        if(x>0)
        {
            ast_rec(x-1);
            for(int i=0;i<x;i++)
            {                           //ast_rec(3):
                System.out.print("*");  //ast_rec(2): 3 times stars+ newline
            }
            System.out.println();       //ast_rec(1): 2 times stars+ newline+3 times stars+ newline
        }                                //ast_rec(0): 1 times stars+ newline+2 times stars+ newline+3 times stars+ newline
    }
    public static void main(String[] args) {
table(5);
asterisk(4);
        asterisk1(4);
        System.out.println("The sum of first n natural no ="+ recursion(4));
        System.out.format("THE Fibanacci series is "+fab(7));
        System.out.println("the sum of aggguments is ="+avg(5,4));
        ast_rec(4);
    }
}
