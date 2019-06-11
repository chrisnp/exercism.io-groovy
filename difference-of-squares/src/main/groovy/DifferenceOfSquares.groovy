class DifferenceOfSquares {

    private final int number

    DifferenceOfSquares(num) {
        this.number = num    
    }

    def squareOfSum() {
        (1..number).sum { it } ** 2
    }

    def sumOfSquares() {
        (1..number).sum { it ** 2 }
    }

    def difference() {
        squareOfSum() - sumOfSquares()
    }

}
