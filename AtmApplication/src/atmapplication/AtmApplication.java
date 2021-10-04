/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmapplication;

import java.util.Scanner;

/**
 *
 * @author Tehreem
 */
public class AtmApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int amount = 50000;
        
        
        String pin;
        int option, optionWithdraw;
        char answer; 
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("****ATM Application*****");
        System.out.println("Please insert your card!!");
        System.out.println("");
        System.out.println("");
        System.out.println("Please enter your Pin");
        pin = scan.next();
        
        if(pin.equals("12345"))
        {
                do
                {
            System.out.println("1. Fast Cash");
            System.out.println("2. Cash Deposit");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Mini Statements");
            System.out.println("5. Mobile Banking");
            System.out.println("6. Change Pin Code");
            
            System.out.println("Enter option number for your transaction");
            option = scan.nextInt();
            
            switch(option)
            {
                case 1:
                    System.out.println("Choose any one option from below");
                    System.out.println("1. 1000/=");
                    System.out.println("2. 2000/=");
                    System.out.println("3. 5000/=");
                    System.out.println("4. 10,000/=");
                    System.out.println("5. Other Amount");
                    
                    optionWithdraw = scan.nextInt();
                    switch(optionWithdraw)
                    {
                        case 1:
                            if(amount >= 1000)
                            {
                                amount -= 1000;
                                System.out.println("You have withdraw 1000/= from your account and your current balance is "+amount+"/=");
                            }
                            else
                            {
                                System.out.println("Sorry! You donot have sufficient amount in your account!!");    
                            }
                        break;
                        case 2:
                            if(amount >= 2000)
                            {
                                amount -= 2000;
                                System.out.println("You have withdraw 2000/= from your account and your current balance is "+amount+"/=");
                            }
                            else
                            {
                                System.out.println("Sorry! You donot have sufficient amount in your account!!");    
                            }
                        break;
                        case 3:
                            if(amount >= 5000)
                            {
                                amount -= 5000;
                                System.out.println("You have withdraw 5000/= from your account and your current balance is "+amount+"/=");
                            }
                            else
                            {
                                System.out.println("Sorry! You donot have sufficient amount in your account!!");    
                            }
                        break;
                        case 4:
                            if(amount >= 10000)
                            {
                                amount -= 10000;
                                System.out.println("You have withdraw 10000/= from your account and your current balance is "+amount+"/=");
                            }
                            else
                            {
                                System.out.println("Sorry! You donot have sufficient amount in your account!!");    
                            }
                        break;
                        case 5:
                            System.out.println("Enter amount to withdraw ....");
                            int amt = scan.nextInt();
                            if(amount >= amt)
                            {
                                amount -= amt;
                                System.out.println("You have withdraw "+amt+"/= from your account and your current balance is "+amount+"/=");
                            }
                            else
                            {
                                System.out.println("Sorry! You donot have sufficient amount in your account!!");    
                            }
                        break;
                        default:
                            System.out.println("Invalid option chosen...");
                    }
                break;
                    
                case 2:
                    System.out.println("Enter amount to deposit...");
                    int deposit = scan.nextInt();
                    amount+=deposit;
                    System.out.println("You deposited "+deposit+"/= amount in your account and your current balance is "+amount+"/=");
                break;
                    
                case 3:
                    System.out.println("Your current balance is "+amount+"/=");
                break;
                    
                case 4:
                    System.out.println("Mini Statement");
                    System.out.println("-1000/=");
                    System.out.println("-3000/=");
                    System.out.println("+5000/=");
                break;
                    
                case 5:
                    System.out.println("Please visit your branch first....");
                break;
                
                case 6:
                    System.out.println("Enter new pin..");
                    pin = scan.next();
                    System.out.println("Your pin has been updated...");
                break;
                    
                default:
                {
                    System.out.println("Invalid option chosen!!!");
                }
                    
            }                    
                    System.out.println("Do you want to perform another transaction? (Y/N): "); 
                    answer = scan.next().charAt(0);
            }while(answer == 'Y' || answer =='y');
        }
        else
        {
            System.out.println("Invalid pin entered..");
        }
        
        
        
        
        
    }
    
}


