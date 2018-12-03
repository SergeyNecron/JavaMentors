package SerializableSumple;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;

public class SaveArrayAnimal {
    public static void serializeAnimalArray(PipedOutputStream pos, Animal[] animals) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(pos);

            out.writeObject(animals.length);
            for (Animal animal : animals) {
                out.writeObject(animal);
            }
            out.flush();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
