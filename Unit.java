public class Unit implements Moveable, Useabilityable {
    protected Team team;
    protected int point;
    protected int actionPoint;
    // protected Position pos;

    public Unit(Team team, int point, int actionPoint) {
        this.team = team;
        this.point = point;
        this.actionPoint = actionPoint;
    }

    public Unit() {
        this(Team.TEAM00, 0, 0);
    }

    @Override
    public void move(Direction d) {
        switch (d) {
            case DIRECTION0:
                System.out.println(d.toString());
                System.out.println("0");
                break;

            case DIRECTION1:
                System.out.println(d.toString());
                System.out.println("1");
                break;

            case DIRECTION2:
                System.out.println(d.toString());
                System.out.println("2");
                break;

            case DIRECTION3:
                System.out.println(d.toString());
                System.out.println("3");
                break;

            case DIRECTION4:
                System.out.println(d.toString());
                System.out.println("4");
                break;

            case DIRECTION5:
                System.out.println(d.toString());
                System.out.println("5");
                break;

            case DIRECTION6:
                System.out.println(d.toString());
                System.out.println("6");
                break;

            case DIRECTION7:
                System.out.println(d.toString());
                System.out.println("7");
                break;

            default:
                System.out.println(d.toString());
                break;
        }
    }

    @Override
    public void useAbility() {
        System.out.println("Use Ability!");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + team.id/*  + " " + point + " " + actionPoint */ + "]");
        return "" + sb.toString();
    }
}