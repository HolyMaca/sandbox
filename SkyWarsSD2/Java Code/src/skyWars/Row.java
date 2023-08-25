package skyWars;

import java.util.ArrayList;

public class Row {
	
	private int rowNumber;
	static final int SIZE_OF_ROW = 4;
	ArrayList <Square> theRows = new ArrayList <Square> ();
	
	public Row(int rowNumber) {
		for(int loop = 0; loop < SIZE_OF_ROW; loop++) {
			this.theRows.add(new Square(loop));
		}
		setRowNumber(rowNumber);
	}
	
//Getters & Setters
	public int getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	public ArrayList<Square> getTheRows() {
		return theRows;
	}

	public void setTheRows(ArrayList<Square> theRows) {
		this.theRows = theRows;
	}

	public int getSIZE_OF_ROW() {
		return SIZE_OF_ROW;
	}
	

}
