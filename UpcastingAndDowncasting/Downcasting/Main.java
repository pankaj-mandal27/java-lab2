package UpcastingAndDowncasting.Downcasting;

public class Main {
    public static void main(String args [])
    {
        SubclassDog myDog = new SubclassDog();
        SuperClassAnimal myAnimal = myDog;//upcasted

        //downcasting back to subclass type
        if(myAnimal instanceof SubclassDog){
            SubclassDog myDowncastedDog = (SubclassDog) myAnimal;

            myDowncastedDog.makeSound();
            myDowncastedDog.fetch();
        }

    }
}
