package FabricMetod;

import static FabricMetod.Movement.move;

public class FabricMain {
    public static void main(String[] args) {
        move(new FactoryKenguru());
        move(new FactoryHourse());
    }
}
