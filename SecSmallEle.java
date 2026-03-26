class SecSmallEle
{
    public static <T extends Comparable<T>> T SecondMin(T arr[])
    {
        T min = arr[0];
        T second = arr[0];

        for(T val : arr)
        {
            if(val.compareTo(min) < 0)
            {
                second = min;
                min = val;
            }
            else if(val.compareTo(second) < 0 && !val.equals(min))
            {
                second = val;
            }
        }
        return second;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,50,30,40,20};
        System.out.println(SecondMin(arr));
    }
}