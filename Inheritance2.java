// Multi-Level Inheritane method 

class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog are barking");
    }
}
class Puppy extends Dog
{
    void weep()
    {
        System.out.println("Puppy is weeping");
    }
}

class Inheritance2
{
    public static void main(String A[])
    {
        Puppy pobj = new Puppy();

        pobj.eat();
        pobj.bark();
        pobj.weep();
    }
}