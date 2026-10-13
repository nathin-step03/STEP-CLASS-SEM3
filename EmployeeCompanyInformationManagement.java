class Company {static String companyName="CodInClub";static int employeeCount=0;Company(){employeeCount++;}}
class CompanyEmployee {String name;int id;CompanyEmployee(String n,int i){name=n;id=i;new Company();}void print(){System.out.println(id+" | "+name+" | "+Company.companyName);}}
public class EmployeeCompanyInformationManagement {public static void main(String[] args){CompanyEmployee[] e={new CompanyEmployee("Divya",101),new CompanyEmployee("Arjun",102),new CompanyEmployee("Maya",103)};for(CompanyEmployee x:e)x.print();System.out.println("Employees: "+Company.employeeCount);}}
