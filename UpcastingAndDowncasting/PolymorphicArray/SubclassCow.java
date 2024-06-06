package UpcastingAndDowncasting.PolymorphicArray;

class SubclassCow extends BaseClassAnimal{
    @Override
    void makeSound()
    {
        System.out.println("Cow moos");
    }
    void graze()
    {
        System.out.println("Cow Grazes");
    }
}
