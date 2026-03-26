class SmallNGeneric
{
    public static <T extends Comparable<T>> T Min(T arr[])
    {
        T min = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].compareTo(min) < 0)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,40,50};
        Float brr[] = {10.0f,3.7f,9.8f,8.7f};

        System.out.println(Min(arr));
        System.out.println(Min(brr));
    }
}