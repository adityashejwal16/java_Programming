class OccurenceGeneric
{

    public static <T> int SearchFirst(T Arr[], T value)
    {
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].equals(value))
            {
                return i;   // first occurrence index
            }
        }
        return -1;  // not found
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,10,30,40,10,40,10};

        int iRet = SearchFirst(arr, 40);

        if(iRet == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("First Occurrence at index : " + iRet);
        }
    }
}