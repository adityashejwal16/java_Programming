/*
    * * * #
    * * # @
    * # @ @
    # @ @ @

*/
import java.util.Scanner;

class Pattern
{
  void Pattern(int iRow, int iCol)
  {
     int i = 0;
     int j = 0;
    
       for(i=1; i<=iCol; i++)
        {
           for(j=1; j<=iCol; j++)
           {
            if(i + j < iCol + 1)
            {
             {
                System.out.printf("*\t",j);             
              }
              
            }
            else if( i + j == iCol + 1)
              {
                 System.out.printf("#\t");          
              }
              else
              {
                System.out.printf("@\t");   
              }
           }
            
            System.out.println();
        } 
    }
}

class printingcol2
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
  