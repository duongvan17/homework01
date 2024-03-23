package sudokuboard;

import java.util.Random;

public class SudokuBoard {
	private int [][] board;
	public SudokuBoard(){
		this.board=new int[9][9];
	}
	public void generateSudoku(){
		Random random=new Random();
		for(int i=0;i<18;i++){
			int col=random.nextInt(9);
			int row=random.nextInt(9);
			int num=random.nextInt(9)+1;
			if(!isValidMove(row,col,num)||board[row][col]!=0){
				 col=random.nextInt(9);
				 row=random.nextInt(9);
				 num=random.nextInt(9)+1;
			}
			board[row][col]=num;
		}
	}
	public boolean isValidMove(int row,int col,int num){
		if(row>8||row<0||col>8||col<0){
			return false;
		}
		for(int i=0;i<9;i++){
			if(board[i][col]==num || board[row][i]==num){
				return false;
			}
		}
		if(num<0||num>9) return false;
		int startRow=row-row%3;
		int startCol=col-col%3;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(board[startRow+i][startCol+j]==num){
					return false;
				}
			}
		} return true;
	}
	public boolean isSudokuSolved(){
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]==0){
					return false;
				}
			}
		}return true;
	}
	 public boolean playMove(int row, int col, int num) {
	        if (isValidMove(row, col, num)) {
	            board[row][col] = num;
	            return true;
	        } else {
	            return false;
	        }
	    }
	 public void printBoard() {
	        System.out.println("-------------------------");
	        for (int i = 0; i < 9; i++) {
	            System.out.print("| ");
	            for (int j = 0; j < 9; j++) {
	                System.out.print(board[i][j] + " ");
	                if (j == 2 || j == 5) {
	                    System.out.print("| ");
	                }
	            }
	            System.out.println("|");
	            if (i == 2 || i == 5) {
	                System.out.println("|-----------------------|");
	            }
	        }
	        System.out.println("-------------------------");
	    }
//	public int tongHang1(){
//		int sum=0;
//		for(int i=0;i<9;i++){
//			sum+=board[0][i];
//		}
//		return sum;
//	}
	
	
}