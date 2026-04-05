class ReverseGeneric
{

    public static <T> void Reverse(T Arr[], int iSize)
    {
        T temp;
        for(int i = 0; i < iSize / 2; i++)
        {
          temp = Arr[i];
          Arr[i] = Arr[iSize -1 -i];
          Arr[iSize -1 -i ] = temp;
        }
    }

    public static void main(String A[])
    {
        Integer arr[] = {10, 20, 30, 10, 30, 40, 10, 40, 10};

        for(int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        Reverse(arr, arr.length);

        for(int j = 0; j < arr.length; j++)
        {
              System.out.print(arr[j] + " ");
        }

    }
}