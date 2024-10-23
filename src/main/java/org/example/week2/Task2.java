package org.example.week2;

import java.util.Scanner;
class Task2{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum=0;

        System.out.print("Type in the first number:");
        sum+=Integer.parseInt(input.nextLine());
        System.out.print("Type in the second number:");
        sum+=Integer.parseInt(input.nextLine());
        System.out.print("Type in the third number:");
        sum+=Integer.parseInt(input.nextLine());
        System.out.println("Sum: "+ sum);

    }}