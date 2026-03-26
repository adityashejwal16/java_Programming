class ReplaceOccu
{
    public static <T> void Replace(T arr[], T oldVal, T newVal)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(oldVal))
            {
                arr[i] = newVal;
            }
        }
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,10,30,10};

        Replace(arr,10,99);

        for(Integer no : arr)
        {
            System.out.print(no+" ");
        }
    }
}