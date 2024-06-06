package UpcastingAndDowncasting.PolymorphicArray;

public class Main {
    public static void main(String args [])
    {
        BaseClassAnimal[] animals = new BaseClassAnimal[3];

        animals[0] = new SubclassDog();
        animals[1] = new SubclassCat();
        animals[2] = new SubclassCow();

        for(BaseClassAnimal animal : animals)
        {
            animal.makeSound();//calls the overriden method in each subclass
        }

    }
}
