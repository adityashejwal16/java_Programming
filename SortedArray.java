class SortedArray
{
    public static <T extends Comparable<T>> boolean CheckSorted(T arr[])
    {
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i].compareTo(arr[i+1]) > 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,40,50};

        System.out.println(CheckSorted(arr));
    }
}