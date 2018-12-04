package SerializableSumple;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SaveArrayAnimal {
    static void serializeAnimalArray(ByteArrayOutputStream bout, Animal[] animals) {
        try (ObjectOutputStream out = new ObjectOutputStream(bout)) {
            out.writeInt(animals.length);
            for (Animal animal : animals) {
                out.writeObject(animal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
