class SmallEleGeneric
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
        Integer arr[] = {10,20,5,40,50};
        System.out.println(Min(arr));
    }
}