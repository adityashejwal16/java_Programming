class SumEven
{
    public static <T extends Number> double SumEven(T arr[])
    {
        double sum = 0;

        for(T val : arr)
        {
            if(val.intValue() % 2 == 0)
            {
                sum += val.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,21,30,41,50};
        System.out.println(SumEven(arr));
    }
}