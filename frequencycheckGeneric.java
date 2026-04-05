class FrequencyCheckGeneric
{
    // Generic Method to count frequency
    public static <T> int Frequency(T Arr[], T value)
    {
        int count = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,10,30,40,10,40,10};

        int iRet = Frequency(arr, 10);

        System.out.println("Frequency is : " + iRet);
    }
}