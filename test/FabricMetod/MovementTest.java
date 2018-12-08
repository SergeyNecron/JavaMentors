package FabricMetod;

import org.junit.Test;

import static FabricMetod.Movement.move;
import static org.junit.Assert.assertEquals;

public class MovementTest {

    @Test
    public void result() {
        assertEquals(move(Kenguru.factory), "Кенгуру прыгает");
        assertEquals(move(Hourse.factory), "Лошадь скачет");
    }
}

