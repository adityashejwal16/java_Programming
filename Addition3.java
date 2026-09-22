import java.util.*;

class Addition3
{
    public static void main(String A[]) 
    {
        int No1 = 0,  No2 = 0;

        System.out.println("Enter The First Number");

        Scanner sobj = new Scanner(System.in);
        No1 = sobj.nextInt();

        System.out.println("Enter The Secound Number");

        Scanner dobj = new Scanner(System.in);
        No2 = dobj.nextInt();

        int iRet = No1 + No2;  // Imp Line After input Otherwise output not showing 

        System.out.println("Addition is " + iRet);
    }

}