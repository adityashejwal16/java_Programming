class ArryTOArrya
{
    public static <T> void CopyArray(T src[], T dest[])
    {
        for(int i = 0; i < src.length; i++)
        {
            dest[i] = src[i];
        }
    }

    public static void main(String A[])
    {
        Integer arr[] = {10,20,30,40,50};
        Integer brr[] = new Integer[arr.length];

        CopyArray(arr,brr);

        for(Integer no : brr)
        {
            System.out.print(no+" ");
        }
    }
}