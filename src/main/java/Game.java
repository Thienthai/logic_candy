import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Game {

    private ArrayList<Integer>[][] board;

    public void start() throws InterruptedException, IOException {
        board = new ArrayList[6][6];
        ModBoard mb = new ModBoard();
        Score score = new Score(); // create new score
        mb.initBoard(board); // create and then initailize the board
        //mb.setNullCandy(board); // Set null to candy for testing purpose
        //mb.testCase(board);// create test case for testing purpose
        printBoard(score);

        // Game loop
        while(true){

            //mb.fallSet(board); // check if we have 0 on the board or not for testing
            //printBoard();
            //Make the swap input function
            if(mb.swapBoard(board))
                //printBoard();
                mb.dupCheck(board,score); // check for duplication on the board

            System.out.println("==============================================");

            printBoard(score); // board print out
            //TimeUnit.SECONDS.sleep(3); // for delaying when the program too fast

        }
    }

    public void printBoard(Score score){ // print to check the board candy
        System.out.println("Result");
        System.out.println("");
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(board[i][j].get(0) + " ");
            }
            System.out.println("");
        }
        System.out.println("Score: "+ score.getScore());
        System.out.println("");
        System.out.println("");
    }

}
