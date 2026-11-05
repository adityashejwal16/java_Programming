
// Count even and odd numbers in an array.

class Array24
{
    public static void main(String A[])
    {
        int Arr[] = {8, 10, 7, 12, 15};

        int i = 0, iEven = 0, iOdd = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }  
        }

        System.out.println("Total Even Number : "+iEven);
        System.out.println("Total Odd Number : "+iOdd);
    }
}