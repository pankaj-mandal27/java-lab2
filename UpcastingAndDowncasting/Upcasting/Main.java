package UpcastingAndDowncasting.Upcasting;

public class Main {
    public static void main(String args [])
    {
        SubclassDog myDog = new SubclassDog();
        SuperClassAnimal myAnimal = myDog;

        myAnimal.makeSound();

    }
}
