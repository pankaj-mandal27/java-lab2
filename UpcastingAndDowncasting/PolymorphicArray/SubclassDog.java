package UpcastingAndDowncasting.PolymorphicArray;

class SubclassDog extends BaseClassAnimal {
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }

    void fetch()
    {
        System.out.println("Dog fetches a ball");
    }

}
