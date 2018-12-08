package FabricMetod;

class Hourse implements Animal {
    @Override
    public void move() {
        System.out.println("Лошадь скачет");
    }

    public static Factory factory = Hourse::new;
    //   public static Factory factory = () -> new Hourse();
/*    public static Factory factory = new Factory() {
        @Override
        public Animal getAnimal() {
            return new Hourse();
        }
    };*/
}
