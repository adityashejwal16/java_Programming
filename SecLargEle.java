class SecLarEle
{
    public static <T extends Comparable<T>> T SecondMax(T arr[])
    {
        T max = arr[0];
        T second = arr[0];

        for(T val : arr)
        {
            if(val.compareTo(max) > 0)
            {
                second = max;
                max = val;
            }
            else if(val.compareTo(second) > 0 && !val.equals(max))
            {
                second = val;
            }
        }
        return second;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,50,30,40,20};
        System.out.println(SecondMax(arr));
    }
}