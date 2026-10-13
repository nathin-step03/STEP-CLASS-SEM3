import java.util.*;
abstract class Worker {String name;double salary;Worker(String n,double s){name=n;salary=s;}abstract double bonus();}
class FullTime extends Worker{FullTime(String n,double s){super(n,s);}double bonus(){return salary*.20;}}
class PartTime extends Worker{PartTime(String n,double s){super(n,s);}double bonus(){return salary*.10;}}
class Intern extends Worker{Intern(String n,double s){super(n,s);}double bonus(){return 1000;}}
public class FestivalBonusCalculator {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next(),name=sc.next();double s=sc.nextDouble();Worker w=switch(t){case "FULLTIME"->new FullTime(name,s);case "PARTTIME"->new PartTime(name,s);default->new Intern(name,s);};double b=w.bonus();System.out.printf("%s: %.2f%n",name,b);total+=b;}System.out.printf("Total Bonus: %.2f%n",total);}}
