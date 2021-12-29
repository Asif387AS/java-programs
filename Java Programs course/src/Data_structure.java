class DS{
public void foo( int arr[],int length)
        {
           int sum=0;
           int product=1;
           for(int i=0; i<length;i++) {
               sum = sum + arr[i];

           }
            System.out.println("The sum ="+sum);
            for (int i=0; i<length;i++)
            {
                product=product*arr[i];

            }
            System.out.println("The product is="+product);
        }

     public void func(int n)
     {
         for(int i=0;  i<n; i++)
         {
             for(int j=0 ; j<n; j++)
             {
                 System.out.println(i);
                 System.out.println();
                 System.out.println(j);
             }

         }
     }

     public int isPrime(int n)
     {
         if(n==1)
         {
             return 0;
         }
         for (int i=2; i*i<n; i++)
         {
             if(i%n==0)
             {
                 return 0;
             }
             return 1;
         }
         return 0;
     }
}
public  class Data_structure {

      public  static void main(String[] args) {
        DS sc=new DS();
        //  Problem    o(n)  Bigo of power 1
     int arr[]= {55,4,3};
     sc.foo(arr,3);

//Problem 2    o(n^2)  Bigo of power 2
     sc.func(3);

     sc.isPrime(10);  //0(under root n)

    }
}

