import java.util.Scanner;

public class MainBoard {
    public static final int MAX_BOARD_SIZE = 8;

    public static void main(String[] args) {
        Board board = new Board(MAX_BOARD_SIZE);
        String action = "";
        Scanner sc = new Scanner(System.in);

        Team teamA = Team.TEAM01;
        Team teamB = Team.TEAM02;

        board.setUnitAt(0, 0, new BasicUnit(teamA, 2, 2));
        board.setUnitAt(1, 0, new BasicUnit(teamA, 2, 2));
        board.setUnitAt(2, 0, new BasicUnit(teamB, 2, 2));

        System.out.println(board.toString());

        System.out.println("Entering game");
        System.out.print(">");
        action = sc.nextLine();

        while (action.charAt(0) != '!') {
            int x = action.charAt(0) - '0';
            int y = action.charAt(1) - '0';

            if (action.charAt(2) == 'm') {
                board.moveUnitAt(x, y, Direction.toDirection(action.charAt(3) - '0'));
            } else if (action.charAt(2) == 'a') {

                board.getUnit(x, y).useAbility();
            }

            System.out.println(board.toString());

            System.out.print(">");
            action = sc.nextLine();
        }
        System.out.println("Exit Game");

        sc.close();
    }
}
