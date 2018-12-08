package FabricMetod;

class Kenguru implements Animal {
    static Factory factory = Kenguru::new;
    private String status;

    @Override
    public void move() {
        setStatus("Кенгуру прыгает");
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String s) {
        status = s;
    }
    //   public static Factory factory = () -> new Kenguru();
/*    public static Factory factory = new Factory() {
        @Override
        public Animal getAnimal() {
            return new Kenguru();
        }
    };*/
}
