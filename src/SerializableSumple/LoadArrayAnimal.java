package SerializableSumple;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class LoadArrayAnimal {
    static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int lenght = in.readInt();
            Animal[] animals = new Animal[lenght];
            if (lenght > 0)
                for (int i = 0; i < lenght; i++) {
                    animals[i] = (Animal) in.readObject();
                }
            in.close();
            return animals;
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
