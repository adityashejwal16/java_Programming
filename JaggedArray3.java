
class JaggedArray3
{
    public static void main(String A[])
    {
        int Arr[][] = new int[2][];

        Arr[0] = new int[3];
        Arr[1] = new int[2];

        Arr[0][3] = 100;

        System.out.println(Arr[0][3]);   // Error
    }
}