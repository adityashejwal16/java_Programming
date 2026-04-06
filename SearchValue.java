class SearchValue
{
    public static <T> boolean Search(T arr[], T value)
    {
        for(T element : arr)
        {
            if(element.equals(value))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,40,50};

        System.out.println(Search(arr,30));
    }
}