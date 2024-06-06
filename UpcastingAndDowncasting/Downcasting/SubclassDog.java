package UpcastingAndDowncasting.Downcasting;

class SubclassDog extends SuperClassAnimal {
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }

    void fetch()
    {
        System.out.println("Dog fetches a ball");
    }

}
