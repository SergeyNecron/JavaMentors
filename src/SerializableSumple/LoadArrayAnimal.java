package SerializableSumple;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;

class LoadArrayAnimal {
    static Animal[] deserializeAnimalArray(PipedInputStream pis) {
        try {
            ObjectInputStream in = new ObjectInputStream(pis);
            Integer lenght = Integer.parseInt(in.readObject().toString());
            System.out.println(lenght);
            Animal[] animals = new Animal[lenght];

            for (int i = 0; i < lenght; i++) {
                animals[i] = (Animal) in.readObject();
            }
            in.close();
            return animals;
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return new Animal[0];
    }
}
