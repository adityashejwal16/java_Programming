import java.io.*;
import java.util.*;

class Directory4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory Name : ");
        String dirF = sobj.nextLine();

        File dirD = new File(dirF);

        if((dirD.exists()) && (dirD.isDirectory()))
        {
            System.out.println("Directory is present");

            File fArr[] = dirD.listFiles();

            FileWriter fwobj = new FileWriter("Marvellous.txt");

            for(int i = 0; i < fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    // Write file name
                    fwobj.write("\n File Name : " + fArr[i].getName() +" \n");

                    FileReader frobj = new FileReader(fArr[i]);
                    char buffer[] = new char[1024];
                    int ret = 0;

                    // Write file data
                    while((ret = frobj.read(buffer)) != -1)
                    {
                        fwobj.write(buffer, 0, ret);
                    }

                    frobj.close();
                }
            }

            fwobj.close();
            System.out.println("All file data written into Marvellous.txt");
        }
        else
        {
            System.out.println("There is no directory");
        }

        sobj.close();
    }
}
