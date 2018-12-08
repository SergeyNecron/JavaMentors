package FabricMetod;

class Kenguru implements Animal {

    @Override
    public void move() {
        System.out.println("Кенгуру прыгает");
    }

    public static Factory factory = Kenguru::new;
    //   public static Factory factory = () -> new Kenguru();
/*    public static Factory factory = new Factory() {
        @Override
        public Animal getAnimal() {
            return new Kenguru();
        }
    };*/
}
