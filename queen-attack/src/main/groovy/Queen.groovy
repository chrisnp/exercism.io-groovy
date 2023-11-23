class Queen {
    private final int rank
    private final int file
    private static final BOARD = 0 ..< 8

    // and these two extra properties, in order to pass the first test, which dictates 
    // the names and visibility of class members, that should probably be private.   
    final row
    final column

    Queen(int row, int column) {
        if (!(BOARD.contains(row) && BOARD.contains(column)))
            throw new Exception("Position not on board")
        this.rank = row
        this.file = column
        this.row = this.getRank()
        this.column = this.getFile()
    }

    int getRank() { this.rank }
    int getFile() { this.file }
    
}