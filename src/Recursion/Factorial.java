package Recursion;

import java.util.Scanner;

public class Factorial {

     static int reccalls=0;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Enter factorial number: ");
        num = s.nextInt();
        int fact = factorial(num);
        System.out.println(num + "! = " + fact);
        int fact2 = refactorial(num);
        System.out.println(num + "! = " + fact2);
        System.out.println("recfib was called " + reccalls + " times.");
    }
    
    public static int refactorial(int anum){
        reccalls++;
        if(anum==1)
            return 1;
        else
            return anum* refactorial(anum-1);
    }
    
    public static int factorial(int anum){
        int answer = anum;
            for (int i = anum-1; i > 0; i--) {
            answer *= i;
        }
            return answer;
    }
}
