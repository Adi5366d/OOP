package org.example.week2;

import java.util.Scanner;
class Task5{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum;
        System.out.print("Type in a number: ");
        int n=Integer.parseInt(input.nextLine());
        int i=0;
        sum=0;
        while(i!=n+1){
            sum+=(int)Math.pow(2,i);
            i++;
        }
        System.out.println("The result is: "+sum);


    }}