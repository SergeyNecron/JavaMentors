package SerializableSumple;

import java.io.ByteArrayOutputStream;

import static SerializableSumple.LoadArrayAnimal.deserializeAnimalArray;
import static SerializableSumple.SaveArrayAnimal.serializeAnimalArray;

public class AnimalMain {


    public static void main(String[] args) {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        Animal[] animals = new Animal[5];
        int size = animals.length;
        for (int i = 0; i < size; i++) {
            animals[i] = new Animal("Cat" + i);
        }

        serializeAnimalArray(bout, animals);

        byte[] array = bout.toByteArray();

        animals = deserializeAnimalArray(array);

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

