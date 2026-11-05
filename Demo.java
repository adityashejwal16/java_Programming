
class Demo
{
    int a = 10;    // Instance variable
    static int b = 20;

    public static void main(String A[])
    {
        Demo obj1 = new Demo();  // obj creat
        Demo obj2 = new Demo();

        obj1.a++;
        obj2.a++;

        obj2.b++;
        obj2.b++;

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(Demo.b);
    }
    boolean a;
    boolean a;
}