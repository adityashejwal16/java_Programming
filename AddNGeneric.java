class AddNGeneric
{
    public static <T extends Number> double AddN(T arr[])
    {
        double sum = 0;

        for(T value : arr)
        {
            sum += value.doubleValue();
        }
        return sum;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,40,50};
        Float brr[] = {10.0f,3.7f,9.8f,8.7f};

        System.out.println(AddN(arr));
        System.out.println(AddN(brr));
    }
}