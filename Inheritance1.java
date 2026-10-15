// Single leve Inheritane method 

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

class Inheritance1
{
    public static void main(String A[])
    {
        Dog dobj = new Dog();

        dobj.eat();
        dobj.bark();
    }
}