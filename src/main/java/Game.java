import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Game {

    ArrayList<Integer>[][] board;

    public void start() throws InterruptedException, IOException {
        board = new ArrayList[6][6];
        ModBoard mb = new ModBoard();
        mb.initBoard(board); // create and then initailize the board
        //mb.setNullCandy(board); // Set null to candy for testing purpose
        //mb.testCase(board);// create test case for testing purpose
        printBoard();

        // Game loop
        while(true){

            //mb.fallSet(board); // check if we have 0 on the board or not for testing
            printBoard();
            //Make the swap input function
            mb.swapBoard(board);
            printBoard();
            mb.dupCheck(board); // check for duplication on the board

            printBoard(); // board print out
            //TimeUnit.SECONDS.sleep(3); // for delaying when the program too fast

        }
    }

    public void printBoard(){ // print to check the board candy
        System.out.println("");
        System.out.println("");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(board[i][j].get(0) + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

}
