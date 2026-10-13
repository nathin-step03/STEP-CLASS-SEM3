import java.util.*;
abstract class Vehicle {int hours;Vehicle(int h){hours=h;}abstract double charge();}
class Bike extends Vehicle{Bike(int h){super(h);}double charge(){return hours*10.0;}}
class Car extends Vehicle{Car(int h){super(h);}double charge(){return 30+Math.max(0,hours-1)*20.0;}}
class Truck extends Vehicle{Truck(int h){super(h);}double charge(){return Math.max(100,hours*50.0);}}
public class CampusParkingChargeCalculator {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next();int h=sc.nextInt();Vehicle v=switch(t){case "BIKE"->new Bike(h);case "CAR"->new Car(h);default->new Truck(h);};double x=v.charge();System.out.printf("%s: %.2f%n",t,x);total+=x;}System.out.printf("Total: %.2f%n",total);}}
