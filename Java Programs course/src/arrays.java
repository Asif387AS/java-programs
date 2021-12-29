public class arrays {
    public static void main(String[] args) {

        // first method to create arrays
//                int[] asif=new int[2];
//                asif[0]=55;
//                asif[1]=77;
//        System.out.println(asif[1]);
        // second method to create arrays
//        int[] asif;
//        asif= new int[2];
//        asif[0]=55;
//        asif[1]=77;
//        System.out.println(asif[1]);
        //third method to create arrays
        //  int asif[]={4,5,4,3};
        // System.out.println(asif[1]);
//        System.out.println(asif.length);
//
//         for(int i=asif.length-1;i>=0;i--)
//         {
//             System.out.println(asif[i]);
//         }
//        for ( int lement:asif) {
//            System.out.println(lement);
//        int[] asif = {44, 65, 64, 34};
//        int num = 44;
//        boolean IsInArray=false;
//        for (int element : asif) {
//            if (num == element) {
//                IsInArray = true;
//                break;
//            }
//        }
//        if (IsInArray) {
//            System.out.println("this element is present in array");
//        } else {
//            System.out.println("this element is not present in array");
//        }
//        int[] asif={44,65,34,64,6};
//        int sum=0;
//        for (int element:asif) {
//            System.out.println(element);
//             sum=sum+element;
//
//        }
//        System.out.println("sum of marks is="+sum);
//        System.out.println("avarage of marks is="+ sum/asif.length);
       /* int[][] asif={
                {1,2,3},
                {4,5,6}
                    };
        int [][] kashi={
                {3,2,3},
                {4,5,6}};
        int[][] result={
                {0,0,0},
                {0,0,0}};
        for(int i=0; i<asif.length;i++) {
            for (int j = 0; j < kashi[i].length; j++) {
                System.out.format("setting values for i=%d and j=%d\n", i, j);
                result[i][j] = asif[i][j] + kashi[i][j];
            }
        }
        for(int i=0; i<asif.length;i++) {
            for (int j = 0; j < kashi[i].length; j++) {
                System.out.print(result[i][j]+ " ");
                result[i][j] = asif[i][j] + kashi[i][j];
            }
            System.out.println(" ");
        }
        int[] asif={4,53,2,4,7};
        int n=Math.floorDiv(asif.length,2);
        int l=asif.length;
        int temp;
        for (int i=0;i<n;i++)
        {
            temp=asif[i];
            asif[i]=asif[l-1-i];
            asif[l-1-i]=temp;
        }
        for (int element:asif) {
            System.out.println(element);

        int[] asif1={44,45,22,77,73,77};
        int max=Integer.MAX_VALUE;
        for (int e:asif1) {
            if( e>max)
            max=e;

        }
        System.out.println("this max value in the array is ="+max);
*/
        boolean a=true;
        int[] asif1={44,45,22,77,73};
        for (int i=0;i< asif1.length-1;i++)
        {
            if(asif1[i]>asif1[i+1]) {
                a = false;
                break;
            }
        }
        if(a)
        {
            System.out.println("array is sorted ");
        }
        else
        {
            System.out.println("array is not sorted");
        }


    }
}


