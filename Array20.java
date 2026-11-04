// Maximum Number 

class Array20
{
    public static void main(String A[])
    {
        int Arr[] = {10, 20, 50, 40, 30};

        int iMax = Arr[0];

        int i = 0;

        for(i = 1; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);

            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
        }
         System.out.println("Maximum elements is :"+iMax);
    }

}