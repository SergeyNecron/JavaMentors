package FabricMetod;

class Hourse implements Animal {
    static Factory factory = Hourse::new;
    private String status;

    @Override
    public void move() {
        status = "Лошадь скачет";
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String s) {
        status = s;
    }
    //   public static Factory factory = () -> new Hourse();
/*    public static Factory factory = new Factory() {
        @Override
        public Animal getAnimal() {
            return new Hourse();
        }
    };*/
}
