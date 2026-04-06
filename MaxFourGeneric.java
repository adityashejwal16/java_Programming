class MaxFourGeneric
{
    public static <T extends Comparable<T>> T Max(T a, T b, T c, T d)
    {
        T max = a;

        if(b.compareTo(max) > 0) max = b;
        if(c.compareTo(max) > 0) max = c;
        if(d.compareTo(max) > 0) max = d;

        return max;
    }

    public static void main(String A[])
    {
        System.out.println(Max(10,40,25,30));
        System.out.println(Max(2.3f,9.8f,5.1f,7.4f));
    }
}