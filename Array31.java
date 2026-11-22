
class Array31
{
    public static void main(String A[])
    {
        int Arr[] = {10, 20, 30, 40, 50};

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i] + Arr[Arr.length -1 -i]);
        }

    }
}