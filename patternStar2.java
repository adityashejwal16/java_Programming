import java.util.Scanner;

class Pattern
{
void Pattern(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    
    if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number column number should be same");
            return;
        }
        for(i=iRow; i>=1; i--)
        {
              
            for(j=1; i >= j; j++)

           {
             System.out.print("*\t");
           }

            System.out.println();
        } 
    }
}

class patternStar2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter Number Of rows");
        iValue1=sobj.nextInt();

        System.out.println("Enter Number Of columns");
        iValue2=sobj.nextInt();

        Pattern pobj=new Pattern();
        pobj.Pattern(iValue1,iValue2);    

    }
}