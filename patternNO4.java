
import java.util.Scanner;

class Pattern
{
    void Display(int iRow, int iCol)
    {
        int i=0; 
        int j=0;
        int num = 0;
       

        for(i=1; i<=iCol; i++)
        {
           for(j=1; j<=iCol; j++) 
           {
              if(i % 2 == 0)
              {
                 num = -j;
              }
              else 
              {
                 num = j;
              }
              System.out.print(num + "\t");
           }      
            System.out.println();     
        }   
    }
}


class patternNO4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter The Number Of Rows");
        iValue1 = sobj.nextInt();

        System.out.println("Enetr The Number Of Columns");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);
    }
}

