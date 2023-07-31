import BalancedBrackets.BalancedBrackets;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        System.out.println("Enter the brackets string");
        String input = sc.next();
        boolean isBalanced = balancedBrackets.checkBalance(input);
        if(isBalanced){
            System.out.println("The entered String has Balanced Brackets");
        }else{
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
        sc.close();
    }
}
