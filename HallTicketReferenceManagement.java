class HallTicket {String studentName;int seatNumber;HallTicket(String n,int s){studentName=n;seatNumber=s;}}
public class HallTicketReferenceManagement {public static void main(String[] args){HallTicket first=new HallTicket("Priya",101);HallTicket second=first;second.seatNumber=205;System.out.println(first.seatNumber);System.out.println(first==second);}}
