package FabricMetod;

class FactoryHourse implements Factory {
    public Animal getAnimal() {
        return new Hourse();
    }
}
