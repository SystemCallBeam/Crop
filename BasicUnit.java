public class BasicUnit extends Unit {

    public BasicUnit(Team team, int point, int actionPoint) {
        super(team, point, actionPoint);
        System.out.println("Basic unit created");
    }

    @Override
    public void move(Direction d) {
        System.out.println("Basic Unit");
        super.move(d);
    }

    @Override
    public void useAbility() {
        System.out.println("Basic Unit");
        super.useAbility();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("n[" + team.id/*  + " " + point + " " + actionPoint */ + "]");
        return "" + sb.toString();
    }
}
