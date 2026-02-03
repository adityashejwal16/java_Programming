class Demo
{
    public int i;
    public static int j;

    static
{
    j=21;
}

    public Demo()
    {
        System.out.println("Inside defualt");
        this.i=11;                                //1st use
        

    }
    public Demo(int a)
    {
        this();                                   // 2nd use
        System.out.println("Inside parametrised");
        
    }

    public void Display()
    {
        System.out.println("Inside Display"+this.i);     // 3rd use
    }

}

class ThisDemo
{
    public static void main(String A[])
    {
      Demo dobj=new Demo(51);
      dobj.Display();
    }
}