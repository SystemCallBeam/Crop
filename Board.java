public class Board {
    private Unit board[][];
    private Unit cell;
    private int size;

    public Board(int size) {
        cell = new Unit();
        System.out.println("Set Size");
        this.size = size;
        System.out.println("Set Board");
        board = new Unit[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = cell;
            }
        }
    }

    public Unit getUnit(int x, int y) {
        return board[y][x];
    }

    public void setUnitAt(int x, int y, Unit unit) {
        System.out.println("Set Unit to " + x + " " + y + " with " + unit.toString());
        board[y][x] = unit;
    }

    public void moveUnitAt(int x, int y, Direction dir) {
        int cnt = 0;
        board[y][x].move(dir);

        while (board[y][x].team != Team.TEAM00 && (x + dir.x > -1) && (y + dir.y > -1) && (x + dir.x < 8) && (y + dir.y < 8)) {
            cnt++;
            x += dir.x;
            y += dir.y;

            if (board[y][x].point == 0) {
                for (int i = 0; i < cnt; i++) {
                    board[y][x] = board[y - dir.y][x - dir.x];
                    x -= dir.x;
                    y -= dir.y;
                }
                board[y][x] = cell;

                break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(board[i][j].toString() + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
