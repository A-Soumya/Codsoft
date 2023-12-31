import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) 
    {    

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the number of subjects: ");
        int noSubjects=sc.nextInt();
        int totalMarks=0;
        for(int i=1;i<=noSubjects;i++)
        {
            System.out.println("\nEnter the marks obtained in subjects "+i+": ");
            int marks=sc.nextInt();
            totalMarks+=marks;
        }
        double averagePer=(double)totalMarks/(noSubjects*100)*100;
        char Grade;
        if(averagePer>=90)
        {
            Grade='A';
        }
        else if(averagePer>=80)
        {
            Grade='B';
        }
        else if(averagePer>=70)
        {
            Grade='C';
        }
        else if(averagePer>=60)
        {
            Grade='D';
        }
        else
        {
            Grade='F';
        }
        System.out.println("----------------------");
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePer+"%");
        System.out.println("Grade:"+Grade);
        
    }
}