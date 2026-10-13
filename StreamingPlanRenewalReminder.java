import java.util.*;
public class StreamingPlanRenewalReminder {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();for(int i=0;i<n;i++){String name=sc.next();int days=sc.nextInt();if(days<0)System.out.println(name+": Expired");else if(days<=3)System.out.println(name+": Renewal due soon");else System.out.println(name+": Active");}}}
