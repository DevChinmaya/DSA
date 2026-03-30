//Write a program to calculate the final payment amount after applying a discount based on total purchase amount.
// Amount < 1000 -> 5%off
// 1000 - 5000 -> 10% off
// Amount > 5000 -> 15% off
// Negative/<0 -> Error
//I/P: Rs1200
//O/P: Rs1080

import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double n=sc.nextDouble();
        if(n < 0){
            System.out.println("Error");
            return;
        }else if(n<1000){
            n = n - n*5/100;
        }else if(n>=1000 && n<=5000){
            n = n - n*10/100;
        }else if(n > 5000){
            n = n - n*15/100;
        }
        System.out.println("Price after discount: "+n);
    }
}