
class Demo
{
    Demo()
    {
       System.out.println("inside Constructor");
    }
}

class Animal
{
    void Dog()
    {
        System.out.println("Dog are bark");
    }
}

class Cat extends Animal
{
    void Meow()
    {
        System.out.println("cat is meowing");
    }
}

class Monkey extends Cat
{
    void baring()
    {
        System.out.println("hello monkey");
    }

}

class multilevelX
{
    public static void main(String A[])
    {
        Animal aobj = new Animal();
        Cat cobj = new Cat();
        Monkey mobj = new Monkey();
        Demo dobj = new Demo();
        
        aobj.Dog();
        cobj.Meow();
        mobj.baring();
    }
}