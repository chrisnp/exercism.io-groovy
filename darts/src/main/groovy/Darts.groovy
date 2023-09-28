class Darts {
    static int score(x, y) {
        def sumSquares = x * x + y * y
        sumSquares <= 1   
        ? 10 : 
        sumSquares <= 25  
        ? 5 : 
        sumSquares <= 100 
        ? 1 : 0
    }
}