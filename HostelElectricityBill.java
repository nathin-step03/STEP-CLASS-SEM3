import java.util.*;
abstract class Room {int units;Room(int u){units=u;}abstract double bill();}
class SingleRoom extends Room{SingleRoom(int u){super(u);}double bill(){return units*8.0;}}
class SharedRoom extends Room{int occupants;SharedRoom(int u,int o){super(u);occupants=o;}double bill(){return units*6.0/occupants;}}
class AcRoom extends Room{AcRoom(int u){super(u);}double bill(){return units*10.0+200;}}
public class HostelElectricityBill {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next();int u=sc.nextInt();Room r=switch(t){case "SINGLE"->new SingleRoom(u);case "SHARED"->new SharedRoom(u,sc.nextInt());default->new AcRoom(u);};double x=r.bill();System.out.printf("%s: %.2f%n",t,x);total+=x;}System.out.printf("Total: %.2f%n",total);}}
