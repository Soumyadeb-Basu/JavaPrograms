package Exceptions.OddNumberException;

import Exceptions.OddNumberException.OddNumberException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OddNumberException {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0)
            throw new OddNumberException("Odd Number is entered by User!");
        else
            System.out.println("Number entered: "+n);
    }
}
