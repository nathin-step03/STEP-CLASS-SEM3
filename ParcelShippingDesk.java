import java.util.*;
abstract class Parcel {double weight,value;Parcel(double w,double v){weight=w;value=v;}abstract double charge();double insurance(){return 0;}double total(){return charge()+insurance();}}
class StandardParcel extends Parcel{StandardParcel(double w,double v){super(w,v);}double charge(){return 40+10*weight;}}
class ExpressParcel extends Parcel{ExpressParcel(double w,double v){super(w,v);}double charge(){return 80+15*weight;}double insurance(){return value*.02;}}
class FragileParcel extends Parcel{FragileParcel(double w,double v){super(w,v);}double charge(){return 40+10*weight+50;}double insurance(){return value*.02;}}
public class ParcelShippingDesk {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double grand=0;for(int i=0;i<n;i++){String t=sc.next();double w=sc.nextDouble(),v=sc.nextDouble();Parcel p=switch(t){case "STANDARD"->new StandardParcel(w,v);case "EXPRESS"->new ExpressParcel(w,v);default->new FragileParcel(w,v);};System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",t,p.charge(),p.insurance(),p.total());grand+=p.total();}System.out.printf("Grand Total: %.2f%n",grand);}}
