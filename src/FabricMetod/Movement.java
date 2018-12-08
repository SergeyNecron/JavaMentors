package FabricMetod;
class Movement {
    static String move(Factory factory) {
        Animal animal = factory.getAnimal();
        animal.move();
        return animal.getStatus();
    }
}
