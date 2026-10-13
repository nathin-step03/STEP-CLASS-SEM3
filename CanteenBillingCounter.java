import java.util.*;
abstract class Customer {double amount;Customer(double a){amount=a;}abstract double finalAmount();}
class StudentCustomer extends Customer{StudentCustomer(double a){super(a);}double finalAmount(){return amount*0.90;}}
class StaffCustomer extends Customer{StaffCustomer(double a){super(a);}double finalAmount(){return amount*0.95;}}
class GuestCustomer extends Customer{GuestCustomer(double a){super(a);}double finalAmount(){return amount+10;}}
public class CanteenBillingCounter {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();double a=sc.nextDouble();Customer c=switch(type){case "STUDENT"->new StudentCustomer(a);case "STAFF"->new StaffCustomer(a);default->new GuestCustomer(a);};double f=c.finalAmount();System.out.printf("%s: %.2f%n",type,f);total+=f;}System.out.printf("Total: %.2f%n",total);}}
