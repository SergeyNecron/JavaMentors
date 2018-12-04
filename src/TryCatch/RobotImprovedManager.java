package TryCatch;

import java.util.Random;

public class RobotImprovedManager implements RobotConnectionManager {
    @Override
    public RobotConnection getConnection() {
        Random r = new Random();
        boolean b = r.nextBoolean();
        if (b) throw new RobotConnectionException("fs");
        return new RobotImproved();
    }

}
