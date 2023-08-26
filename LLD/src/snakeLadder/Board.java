package snakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

	Cell[][] cells;
	
	public Board(int boardsize, int numberofsnakes, int numberofladders) {
		initializeCells(boardsize);
		addSnakesLadders(cells, numberofsnakes, numberofladders);
	}


	private void initializeCells(int boardsize) {
		cells = new Cell[boardsize][boardsize];
		
		for(int i=0;i< boardsize; i++) {
			for(int j=0; j<boardsize; j++) {
				Cell cellobj = new Cell();
				cells[i][j] = cellobj;
			}
		} 
	}
	

	private void addSnakesLadders(Cell[][] cells, int numberofsnakes, int numberofladders) {
		 while(numberofsnakes > 0) {
			int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length * cells.length-1);
			int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length * cells.length-1);
			if(snakeTail >= snakeHead) {
				continue;
			}
			Jump snakeObj = new Jump();
			snakeObj.start = snakeHead;
			snakeObj.end =  snakeTail;
			
			Cell cell = getCell(snakeHead);
			cell.jump = snakeObj;
			numberofsnakes--;
		}
		
		while(numberofladders > 0) {
			int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length * cells.length-1);
			int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length * cells.length-1);
			if(ladderStart >= ladderEnd) {
				continue;
			}
			
			Jump ladderObj = new Jump();
			ladderObj.start = ladderStart;
			ladderObj.end = ladderEnd;
			
			Cell cell = getCell(ladderStart);
			cell.jump = ladderObj;
			
			numberofladders--;
		}
		
	}

	Cell getCell(int playerPosition) {
		int boardRow = playerPosition / cells.length;
		int boardColumn = playerPosition % cells.length;
		return cells[boardRow][boardColumn];
	}

}
