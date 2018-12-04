package SerializableSumple;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

class LoadArrayAnimal {
    static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int lenght = in.readInt();
            Animal[] animals = new Animal[lenght];
                for (int i = 0; i < lenght; i++) {
                    animals[i] = (Animal) in.readObject();
                }
            in.close();
            return animals;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
