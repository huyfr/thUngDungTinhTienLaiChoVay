import java.util.Scanner;

public class Interest
{
    public static void main(String[] args)
    {
        double amount, interestRate, totalInterest=0;
        int month;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        amount=sc.nextDouble();

        System.out.print("Enter number of months: ");
        month=sc.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        interestRate=sc.nextDouble();

        for (int i=0; i<month; i++)
        {
            totalInterest=amount*(interestRate/100)/12*month;
        }

        System.out.printf("Total interest: %.2f",totalInterest);
    }
}
