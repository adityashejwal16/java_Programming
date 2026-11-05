
// Count Positive and Nagative number

class Array27
{
    public static void main(String A[])
    {
        int Arr[] = {10, -5, 20, -25, 40};

        int i = 0, iPos = 0, iNag = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > 0)
            {
                iPos++;
            }
            else if(Arr[i] < 0)
            {
                iNag++;
            }
        }

        System.out.println("Positive Number are : "+ iPos);
        System.out.println("Negative Number are : "+ iNag);

    }
}