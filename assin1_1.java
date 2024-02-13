import java.util.*;
import java.util.Random;
class Employee
{
    private String firstName;
    private String lastName;
    private String dept;
    private String company;
    public Employee(String firstName,String lastName,String company)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.company = company;

    }
    public void chooseDept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dept(number) from the following \n 1.Technical\n 2.Admin \n 3.Human Resource \n 4.Legal\n ");
        int deptNo = sc.nextInt();
        if(deptNo == 1)
            this.dept = "technical";
        else if(deptNo==2)
            this.dept = "admin";
        else if(deptNo==3)
            this.dept = "humanresource";
        else if(deptNo==4)
            this.dept = "legal";
        else
            System.out.println("Invalid dept");
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDept() {
        return dept;
    }

    public String getCompany() {
        return company;
    }
    public void dispalyEmployee()
    {
        System.out.println(this.firstName+" "+this.lastName+" "+this.dept+" "+this.company);
    }
}
class CredentialService
{
    String email="";
    String pass="";

    public void generateEmail(Employee emp)
    {
        email = emp.getFirstName()+emp.getLastName()+"@"+emp.getDept()+"."+emp.getCompany()+".com";
    }
    public void generatePassword(Employee emp)
    {

       char[] lower_alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       char[] upper_alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       char[] number = {'0','1','2','3','4','5','6','7','8','9'};
       char[] special = {'@', '#', '$', '%', '^', '&', '*', '(', ')', '¢', '£', '¥'};
       Random random = new Random();
      for(int i=0;i<3;i++) {
           char lower = lower_alph[random.nextInt(lower_alph.length)];
           pass = pass+lower;

           char upper= upper_alph[random.nextInt(upper_alph.length)];
           pass+=upper;

           char num = number[random.nextInt(number.length)];
           pass+=num;
           char spec = special[random.nextInt(special.length)];
           pass+=spec;

      }







    }
    public void displayCredentials()
    {
        System.out.println(this.email);
        System.out.println(this.pass);
    }
}
public class assin1_1
{
    public static void main(String[] args) {

        Employee emp1 = new Employee("Hari","Prasath","Ford");
        emp1.chooseDept();
        emp1.dispalyEmployee();

        CredentialService cs1 = new CredentialService();
        cs1.generateEmail(emp1);
        cs1.generatePassword(emp1);
        cs1.displayCredentials();
    }
}