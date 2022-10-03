package lab2.task5;

import java.util.ArrayList;

public class DogNursery {
    private ArrayList<Dog> dogs = new ArrayList<>();
    public void addDog(Dog newDog){
        dogs.add(newDog);
    }

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        DogNursery dogNursery = new DogNursery();

        dogNursery.addDog(new Dog("Jack", 5));
        dogNursery.addDog(new Dog("Woof", 2));
        dogNursery.addDog(new Dog("Lacy", 9));

        for (int i = 0; i < dogNursery.getDogs().size(); i++){
            System.out.println(dogNursery.getDogs().get(i).toString());
        }


    }
}
