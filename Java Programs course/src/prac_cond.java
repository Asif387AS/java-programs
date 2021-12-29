import java.util.Scanner;
public class prac_cond {
    public static void main(String[] args) {
      /*  Scanner sc= new Scanner(System.in);
        System.out.println("enter the year\n");
        int year= sc.nextInt();
        if(year%4==0)
       {
       System.out.println("nember  is a leap year");
        }
        else
            {
        System.out.println(" nember is not a leap year");

            } */
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the website url");
        String website= sc.next();
        if (website.endsWith(".com"))
        {
            System.out.println("webite is comercial");
        }
        else if(website.endsWith(".gov"))
        {
            System.out.println(" website is  a government");
        }
        else if(website.endsWith(".pak"))
        {
            System.out.println("it is a pakistani website");
        }

    }
}
