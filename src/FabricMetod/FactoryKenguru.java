package FabricMetod;

class FactoryKenguru implements Factory {
    public Animal getAnimal() {
        return new Kenguru();
    }
}
