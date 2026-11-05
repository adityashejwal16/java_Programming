// Minimum Element

class Array21
{
    public static void main(String A[])
    {
        int Arr[] = {45, 12, 78, 5, 34};

        int i = 0;

        int iMin = Arr[0];

        for(i = 1; i < Arr.length; i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }

        System.out.println("Minimum Element is : "+iMin);
    }
}