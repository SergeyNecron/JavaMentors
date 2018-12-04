package FabricMetod;

class Movement {
    static void move(Factory factory) {
        Animal animal = factory.getAnimal();
        animal.move();
    }
}
