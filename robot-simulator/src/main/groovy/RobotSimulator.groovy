class RobotSimulator {

    private static Bearings = [ "north", "east", "south", "west" ]

    int x; int y; String dir

    RobotSimulator(int pos_x, int pos_y, String direction) {
        x = pos_x
        y = pos_y
        dir = direction
    }

    /**
     * Returns the current position of the robot relative to the X axis
     */
    int getX() {
        return x
    }

    /**
     * Returns the current position of the robot relative to the Y axis
     */
    int getY() {
        return y
    }

    /**
     * Returns the direction that the robot is currently facing
     */
    String getDirection() {
        return dir
    }

    def move(String commands) {
        for (c in commands) {
            switch (c) {
                case "L": plusHalfPi(); break
                case "R": minusHalfPi(); break
                case "A": advance(); break
                default : continue
            }
        }
    }

    private void minusHalfPi() {
        int currD = Bearings.indexOf(this.getDirection()) 
        dir = Bearings[Math.floorMod(currD - 3, 4)] 
    }

    private void plusHalfPi() {
        int currD = Bearings.indexOf(this.getDirection()) 
        dir = Bearings[Math.floorMod(currD + 3, 4)] 
    }

    private void advance() {
        switch (Bearings.indexOf(this.getDirection())) {
            case 0 : y++; break
            case 1 : x++; break
            case 2 : y--; break
            case 3 : x--; break
            case _ : x += 0; y += 0
        }
    }
}
