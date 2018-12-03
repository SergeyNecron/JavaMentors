package SerializableSumple;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

import static SerializableSumple.LoadArrayAnimal.deserializeAnimalArray;
import static SerializableSumple.SaveArrayAnimal.serializeAnimalArray;

public class AnimalMain {


    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Animal[] animals = new Animal[5];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = new Animal("Cat" + i);
        }

        serializeAnimalArray(pos, animals);

        animals = deserializeAnimalArray(pis);

        for (Animal animal : animals) {
            System.out.println(animal);
        }


    }
}
