import java.util.*;

class SelectionX
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int Std = 0;

       System.out.println("Enter Your PRN Number : ");
       Std = sobj.nextInt();

       switch(Std)
       {
        case 1 :
            System.out.println("Your Exam At 9 AM");
            break;

        case 2 :
            System.out.println("Your Exam At 10 AM");
            break;
        
        case 4 :
            System.out.println("Your Exam At 12 PM");
            break;
        
        case 5 :
            System.out.println("Your Exam At 2 PM");
            break;

        case 6 :
            System.out.println("Your Exam on Monday AT 10 AM");
            break;

        case 7 :
            System.out.println("Your Collage fees are pending");
            break;

            default:

                System.out.println("Invalid Standard");
       }
    }
}