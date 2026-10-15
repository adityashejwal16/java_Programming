
// Hierarchical Inheritance

class truck                 // Parents Class
{
    void driver()
    {
        System.out.println("Parents Class ");  
    }
}

class bike extends  truck 
{
    void rider()
    {
        System.out.println("hey");
    }
}

class car extends truck
{
    void thar()
    {
        System.out.println("hi");
    }
}


class Hierarchical_Inheritance
{
    public static void main(String A[])
    {
        bike bobj = new bike();
        car cobj = new car();

        bobj.driver();
        cobj.driver();

        bobj.rider();
        cobj.thar();

    }
}