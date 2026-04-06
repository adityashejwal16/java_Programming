class ReverseGeneric
{
    public static <T> void Reverse(T arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            T temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,40,50};

        Reverse(arr);

        for(Integer no : arr)
        {
            System.out.print(no+" ");
        }
    }
}