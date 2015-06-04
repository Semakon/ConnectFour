package Test;

import Model.Board;
import Model.Mark;
import Model.Player;

/**
 * Created by Martijn on 4-6-2015.
 */
public class BoardTest {

    public static void main(String[] args) {
        Board board = new Board(new Player("Player 1", Mark.XX), new Player("Player 2", Mark.OO));
        board.setField(3, 5, Mark.XX);
        board.setField(1, 2, Mark.OO);
        board.setField(5, 3, Mark.OO);
        board.setField(2, 2, Mark.XX);
        board.setField(3, 2, Mark.XX);
        System.out.println(board.toString());
    }

}
