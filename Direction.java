public enum Direction {
    /* DIRECTION0(0),
    DIRECTION1(1),
    DIRECTION2(2),
    DIRECTION3(3),
    DIRECTION4(4),
    DIRECTION5(5),
    DIRECTION6(6),
    DIRECTION7(7); */

    DIRECTION0(0, -1, 0),
    DIRECTION1(1, -1, 1),
    DIRECTION2(1, 0, 2),
    DIRECTION3(1, 1, 3),
    DIRECTION4(0, 1, 4),
    DIRECTION5(-1, 1, 5),
    DIRECTION6(-1, 0, 6),
    DIRECTION7(-1, -1, 7);

    protected final int x;
    protected final int y;
    private final int id;

    Direction(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public static Direction toDirection(String d) {
        for (Direction direction : Direction.values()) {
            if (direction.id == Integer.parseInt(d)) {
                return direction;
            }
        }

        return null;
    }
}
