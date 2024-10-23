package org.example.week2;

import java.util.Scanner;
class Task3{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum=0, read;
        while(true){
            read = Integer.parseInt(input.nextLine());
            if(read==0){
                break;
            }
            sum+=read;
            System.out.println("Sum now:"+sum);
        }

        System.out.println("Sum at the end:"+sum);

    }}