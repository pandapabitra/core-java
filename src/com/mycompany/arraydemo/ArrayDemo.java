package com.mycompany.arraydemo;

public class ArrayDemo {
    public static void main(String args[]){
        int arrayofAadhar[]=new int[5];
        System.out.println(arrayofAadhar[3]);//Output is 0 because default value of int is 0
        arrayofAadhar[3]=25568;
        //Printing Aadhar Details
        for(int i=0;i< arrayofAadhar.length;i++)
        {
            System.out.println(arrayofAadhar[i]);
        }
        for(int a:arrayofAadhar){//It is an enhance for loop
            System.out.println(a);
        }
        /*
        boolean isEmployeeArray[]=new boolean[5];
        System.out.println(isEmployeeArray[3]);//Output is false because default value of boolean is false
        isEmployeeArray[3]=true;
        isEmployeeArray[8]=true;//This will throw runtime exception ArrayIndexOutOfBoundsException

        //Printing Aadhar Details
        for(int i=0; i < isEmployeeArray.length;i++)
        {
            System.out.println(isEmployeeArray[i]);
        }
         */
    }
}
