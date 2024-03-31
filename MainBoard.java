import java.util.Scanner;

public class MainBoard {
    public static final int MAX_BOARD_SIZE = 8;

    public static void main(String[] args) {
        Board board = new Board(MAX_BOARD_SIZE);
        String action[];
        Scanner sc = new Scanner(System.in);

        Team teamA = Team.TEAM01;
        Team teamB = Team.TEAM02;

        board.setUnitAt(0, 0, new BasicUnit(teamA, 2, 2));
        board.setUnitAt(1, 0, new BasicUnit(teamA, 2, 2));
        board.setUnitAt(2, 0, new BasicUnit(teamB, 2, 2));

        System.out.println(board.toString());

        System.out.println("Entering game");
        System.out.print(">");
        action = sc.nextLine().split(" ");

        while (action[0] != "!") {
            int x = action[0].charAt(0) - '0';
            int y = action[0].charAt(1) - '0';

            if (action[1] == "m") {
                board.moveUnitAt(x, y, Direction.toDirection(action[2]));
            } else if (action[1] == "a") {

                board.getUnit(x, y).useAbility();
            } else if (action[1] == "s") {
                board.skipUnitAt(x, y, Direction.toDirection((action[2])));
            }

            System.out.println(board.toString());

            System.out.print(">");
            action = sc.nextLine().split(" ");
        }
        System.out.println("Exit Game");

        sc.close();
    }
}
