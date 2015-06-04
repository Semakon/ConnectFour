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
        board.setField(38, Mark.XX);
        board.setField(31, Mark.XX);
        board.setField(24, Mark.XX);
        board.setField(17, Mark.XX);
        board.setField(10, Mark.XX);
        System.out.println(board.toString());
        System.out.println(board.hasVertical(10, Mark.XX));
    }

}
