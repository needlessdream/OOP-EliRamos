
import javax.swing.*; 
import java.io.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Driver Class 
public class Swing { 
	// main function 
	public static void main(String[] args) { 
		bank bank = new bank();
		while(true){ 
			
			try{ 
				String initial, inibal, accnum1, withdrawam, depo, accnum2, accnum3, accnum4; 
				int choice, initbal,withdrawamt, deposit; 

				// Welcome Screen 
				JOptionPane.showMessageDialog(null, "Welcome to Eli's bank Management program"); 
                                
                                JOptionPane.showMessageDialog(null, "Welcome User"); 
				initial = JOptionPane.showInputDialog(null, "1. Create Account \n2. Check Balance \n3. Withdraw \n4. Deposit \n5. Exit"); 
                                choice = Integer.parseInt(initial); 
                                
                                switch (choice) { 
					case 1 -> {
                                            
                                            accnum1 = JOptionPane.showInputDialog(null, "Enter account number: ");
                                            
                                            inibal = JOptionPane.showInputDialog(null, "Enter Initial Deposit: ");
                                            initbal = Integer.parseInt(inibal); 
                                           if (initbal >= 0 ){
                                                bank.createAccount(accnum1, initbal);
                                           }else{
                                               JOptionPane.showMessageDialog(null,"account number cannot be negative");
                                           }
                                              break;
                                }
                                        case 2 -> {
                                            accnum2 = JOptionPane.showInputDialog(null, "Enter account number: ");
                                       JOptionPane.showMessageDialog(null, "Current balance: " + bank.getBalance(accnum2));
                                       break;
                                        }
                                        case 3 ->{
                                            accnum3 = JOptionPane.showInputDialog(null, "Enter account number: ");
                                            withdrawam = JOptionPane.showInputDialog(null, "Enter amount to withdraw:  ");
                                           withdrawamt = Integer.parseInt(withdrawam); 
                                            bank.withdraw(accnum3, withdrawamt);
                                            break;
                                        } 
                                        case 4 ->{
                                            accnum4 = JOptionPane.showInputDialog(null, "Enter account number: ");
                                            depo = JOptionPane.showInputDialog(null, "Enter account number: ");
                                            deposit = Integer.parseInt(depo); 
                                             bank.deposit(accnum4, deposit);
                                             break;
                                        }
                                           case 5 ->{
                                                JOptionPane.showMessageDialog(null,"Exiting...");
                                                System.exit(0);
                                           }
                                           default ->{
                                               JOptionPane.showMessageDialog(null,"Invalid Choice.");
                                           }
                                }
                                /*
                                            String accname = JOptionPane.showInputDialog(null,"Enter name");
                                            String accnum = JOptionPane.showInputDialog(null,"Enter account number");
                                            int ACCnum = Integer.parseInt(accnum);
                                            if(ACCnum >= 0){
                                                JOptionPane.showMessageDialog(null,"The account name is "+accname+" and the account number is "+accnum);
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null,"account number cannot be negative");
                                            }
				// Screen with Options Showing
                                JOptionPane.showMessageDialog(null, "Welcome "+ accname); 
				initial = JOptionPane.showInputDialog(null, "1. Check Balance \n2. Send Money \n3. Deposit Money \n4. Exit"); 

				// Taking the Input and Storing the 
				// Choice Taken 
				choice = Integer.parseInt(initial); 

				switch (choice) { 
					case 1 -> {
                                            bal = 1000;
                                            checkbal = JOptionPane.showInputDialog(null, "your current balance is:" + bal);
                                }
					case 2 -> {
                                            String sendmoney = JOptionPane.showInputDialog(null,"Input the amount you would like to send");
                                            int checksend = Integer.parseInt(sendmoney);
                                            
                                            // Number is Even
                                            if(checksend >= bal){
                                                JOptionPane.showMessageDialog(null,"");
                                            }
                                            // Number is Odd
                                            else{
                                                JOptionPane.showMessageDialog(null,"");
                                            }
                                }
					case 3 -> {
                                            String shopping = JOptionPane.showInputDialog(null,"Enter your total shopping amount");
                                            int discount = Integer.parseInt(shopping);
                                            
                                            // Discount Given according to the Discount
                                            if((discount >= 500000) && (discount <= 1000000)){
                                                int finalAmount = discount * 5 / 100;
                                                int price = discount - finalAmount;
                                                JOptionPane.showMessageDialog(null,"You get a 5% discount");
                                                JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                                            }
                                            else if((discount > 1000000) && (discount <= 1500000)){
                                                int finalAmount = discount * 10 / 100;
                                                int price = discount - finalAmount;
                                                JOptionPane.showMessageDialog(null,"You get a 10% discount");
                                                JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                                            }
                                            else if((discount > 1500000) && (discount < 2000000)){
                                                int finalAmount = discount * 15 / 100;
                                                int price = discount - finalAmount;
                                                JOptionPane.showMessageDialog(null,"You get a 15% discount");
                                                JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                                            }
                                            else if(discount >= 2000000){
                                                int finalAmount = discount * 25 / 100;
                                                int price = discount - finalAmount;
                                                JOptionPane.showMessageDialog(null,"You get a 25% discount");
                                                JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                                            }
                                            else if(discount >= 0){
                                                JOptionPane.showMessageDialog(null,"Your total shopping amount is "+discount);
                                            }
                                            else{
                                                JOptionPane.showMessageDialog(null,"Value cannot be negative");
                                            }
                                }

                                
					case 4 -> {
                                            JOptionPane.showMessageDialog(null, "Program will exit");
                                            System.exit(0);
                                }
				}**/
                           
                            			} 
			// Exception 
			catch(NumberFormatException ex) { 
				JOptionPane.showMessageDialog(null, "Input error occurred", "Error", JOptionPane.ERROR_MESSAGE);
                                System.exit(0);
			} 
		} 
	} 
}


