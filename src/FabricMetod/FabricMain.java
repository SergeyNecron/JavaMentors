package FabricMetod;

import static FabricMetod.Movement.move;

public class FabricMain {
    public static void main(String[] args) {
        System.out.println(move(Kenguru.factory));
        System.out.println(move(Hourse.factory));
    }
}
