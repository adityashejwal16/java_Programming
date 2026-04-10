import java.io.*;
import java.util.*;

class Directory2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String dirF = null;
        int i = 0;

        System.out.println("Enter Directory Name : ");
        dirF = sobj.nextLine();

        File dirD = new File(dirF);

        if((dirD.exists()) && (dirD.isDirectory()))
        {
            System.out.println("Directory is present");

            File fArr[] = dirD.listFiles();

           FileWriter fwobj = new FileWriter("Marvellous.txt");


            for(i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    fwobj.write(fArr[i].getName());
                }
            }
            fwobj.close();
        }
        else
        {
            System.out.println("there is no directory");
        }
        
         sobj.close();
    }
}