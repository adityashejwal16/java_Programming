class LastOccurenceGeneric
{

    public static <T> int SearchLast(T Arr[], int iSize, T value)
    {
        for(int i = iSize -1; i >= 0; i--)
        {
            if(Arr[i].equals(value))
            {
                return i;   // last Occu
            }
        }
        return -1;  // not found
    }

    public static void main(String A[])
    {
        Integer arr[] = {10, 20, 30, 10, 30, 40, 10, 40, 10};

        int iRet = SearchLast(arr, arr.length, 40);

        System.out.println(iRet);

    }
}