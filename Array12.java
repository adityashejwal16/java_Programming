// OOP Design

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int no)
    {
        iSize = no;
        Arr = new int[iSize];
    } 
}

class Array12
{
    public static void main(String A[])
    {
        ArrayX aobj1 = new ArrayX(5);
        ArrayX aobj2 = new ArrayX(7);
        ArrayX aobj3 = new ArrayX(3);
    }
}