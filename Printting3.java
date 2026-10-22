import java.io.*;


class Printting3
{
    public static void main(String A[]) 
    {
        int iNo = 0;
         int i = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");

        try
        {
            iNo = Integer.parseInt(bobj.readLine());
        }
        catch(IOException iobj)
        {}


        for(i = 1; i <= (iNo / 2); i++)
        {
            if((iNo % i) != 0)
            {
                System.out.println(i);
            }
        }
    }
}