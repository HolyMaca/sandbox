package skyWars;

import java.util.ArrayList;

public class NeighbouringSquares {
	
public static  ArrayList<Square> neighbours(int rowNumber, int squareNumber) {
		
		ArrayList <Square> neighbourSquares = new ArrayList <Square>();
		
		for(Row tempRow : Sky.theSky) {
			if(tempRow.getRowNumber() == rowNumber){
				for(Square tempSquare : tempRow.getTheRows()) {
					if(tempSquare.getSquareNumber()==squareNumber){
						if(rowNumber > 0) {
							neighbourSquares.add(Sky.theSky.get(squareNumber).getTheRows().get(rowNumber-1));
						}
						if(squareNumber > 0 && rowNumber > 0){
							neighbourSquares.add(Sky.theSky.get(squareNumber-1).getTheRows().get(rowNumber-1));
						}
						if(squareNumber < Row.SIZE_OF_ROW - 1 && rowNumber > 0) {
							neighbourSquares.add(Sky.theSky.get(squareNumber+1).getTheRows().get(rowNumber-1));
						}
						if(rowNumber < Sky.NUMBER_OF_ROWS - 1) {
							neighbourSquares.add(Sky.theSky.get(squareNumber).getTheRows().get(rowNumber+1));
						}
						if(squareNumber > 0 && rowNumber < Sky.NUMBER_OF_ROWS - 1){
							neighbourSquares.add(Sky.theSky.get(squareNumber-1).getTheRows().get(rowNumber+1));
						}
						if(squareNumber < Row.SIZE_OF_ROW - 1 && rowNumber < Sky.NUMBER_OF_ROWS - 1){
							neighbourSquares.add(Sky.theSky.get(squareNumber+1).getTheRows().get(rowNumber+1));
						}
						if(squareNumber > 0){
							neighbourSquares.add(Sky.theSky.get(squareNumber-1).getTheRows().get(rowNumber));
						}
						if(squareNumber < Row.SIZE_OF_ROW - 1){
							neighbourSquares.add(Sky.theSky.get(squareNumber+1).getTheRows().get(rowNumber));
						}
					}
				}
			}
		}
		
		return neighbourSquares;
	}

}
