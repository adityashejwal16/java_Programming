import java.io.*;


class Printting4
{
    public static void main(String A[]) throws IOException
    {
        int iNo = 0;
         int i = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the Number : ");
        iNo = Integer.parseInt(bobj.readLine());

        for(i = 1; i <= (iNo / 2); i++)
        {
            if((iNo % i) != 0)
            {
                System.out.println(i);
            }
        }
    }
}