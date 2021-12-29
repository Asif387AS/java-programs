package com.company;


public class javadoc_methods_tags {

    public static void main(String[] args) {
        System.out.println("i am main method");
    }

    /**
     *
     * @param i This is first param
     * @param j this is second param
     * @return sum of numbers is integer
     * @throws Exception i is equal to zero
     * @deprecated This method is depricated please use +opearator
     */

        int add(int i, int j) throws Exception{
            int c;
            c=i+j;
            if (i==0){
                throw new Exception();
            }
           return c;
        }

}
