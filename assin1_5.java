import java.util.*;
abstract class Card
{
    protected String holderName;
    protected String cardNumber;
    protected String expiryDate;
    public Card(String holderName,String cardNumber,String expiryDate)
    {
        this.holderName = holderName;
        this.expiryDate  = expiryDate;
        this.cardNumber = cardNumber;
    }

}
class MembershipCard extends Card
{
    private int ratings;
    public MembershipCard(String holderName,String cardNumber,String expiryDate,int ratings)
    {
        super(holderName,cardNumber,expiryDate);
        this.ratings = ratings;
    }
    public void displayMembershipCard()
    {
        System.out.println(this.holderName+" "+this.cardNumber+" "+this.expiryDate+" "+this.ratings);
    }

}
class PaybackCard extends Card
{
    private int pointsEarned;
    private double totalAmt;
    public PaybackCard(String holderName,String cardNumber,String expiryDate,int pointsEarned,double totalAmt)
    {
        super(holderName,cardNumber,expiryDate);
        this.pointsEarned = pointsEarned;
        this.totalAmt = totalAmt;
    }
    public void displayPaybackCard()
    {
        System.out.println(this.holderName+" "+this.cardNumber+" "+this.expiryDate+" "+this.pointsEarned+" "+this.totalAmt);
    }
}
public class assin1_5
{
    public static void main(String[] args) {

           String cardDet = "Harshini|12345|14/03/20206";
           String[] separateDet = cardDet.split("\\|");

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the card option : \n1. Membership Crad\n2.Payback Card");
           int opt = sc.nextInt();
           if(opt ==1) {
               MembershipCard c1 = new MembershipCard(separateDet[0], separateDet[1], separateDet[2], 5);
               c1.displayMembershipCard();
           }
           else if(opt==2)
           {
               PaybackCard c1 = new PaybackCard(separateDet[0], separateDet[1], separateDet[2], 25,1000);
               c1.displayPaybackCard();
           }
           else
           {
               System.out.println("Invalid option");
           }
    }
}