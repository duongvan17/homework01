package GameScreen;

import java.util.Scanner;

import sudokuboard.SudokuBoard;

public class Screen {
	private SudokuBoard sudokuboard;
	public Screen(){
		this.sudokuboard=new SudokuBoard();
	}
	public void startGame(){
		sudokuboard.generateSudoku();
		sudokuboard.printBoard();
		Scanner scanner=new Scanner(System.in);
		while(!sudokuboard.isSudokuSolved()){
			 System.out.print("Enter row (1-9): ");
	            int row = scanner.nextInt() - 1;

	            System.out.print("Enter column (1-9): ");
	            int col = scanner.nextInt() - 1;

	            System.out.print("Enter value (1-9): ");
	            int num = scanner.nextInt();

	            if (sudokuboard.playMove(row, col, num)) {
	                System.out.println("Move accepted!");
	            } else {
	                System.out.println("Invalid move. Try again.");
	            }
	            sudokuboard.printBoard();
	       //     System.out.println(sudokuboard.tongHang1());
		}
		System.out.println("Congratulations! Sudoku solved!");
		
	}
}
