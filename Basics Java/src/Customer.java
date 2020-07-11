/**
 *
 * @author Sid
 */
public class Customer 
{
    int amount=10000;  
  
synchronized void withdraw(int amount){  
System.out.println("going to withdraw...");  
  
if(this.amount<amount){  
System.out.println("Less balance; waiting for deposit..."); 
System.out.println(this.amount+"Current Balance");
try{wait();}catch(Exception e){}  
}  
this.amount-=amount;  
System.out.println("withdraw completed...");  
System.out.println(this.amount+"Current Balance");
}  
  
synchronized void deposit(int amount){  
System.out.println("going to deposit...");  
this.amount+=amount;  
System.out.println("deposit completed... ");  
System.out.println(this.amount+"Current Balance");
notify();  
}  
    
}
