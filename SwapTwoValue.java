class SwapTwoValue
{
    public static <T> void Swap(T arr[], int i, int j)
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20};

        Swap(arr,0,1);

        System.out.println(arr[0]+" "+arr[1]);

        Float brr[] = {3.5f,7.8f};

        Swap(brr,0,1);

        System.out.println(brr[0]+" "+brr[1]);
    }
}