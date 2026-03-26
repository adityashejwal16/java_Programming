class LargNoGeneric
{
    public static <T extends Comparable<T>> T Max(T no1, T no2, T no3)
    {
        T max = no1;

        if(no2.compareTo(max) > 0)
            max = no2;

        if(no3.compareTo(max) > 0)
            max = no3;

        return max;
    }

    public static void main(String A[])
    {
        System.out.println(Max(10,20,30));
        System.out.println(Max(5.5f,9.8f,3.2f));
    }
}