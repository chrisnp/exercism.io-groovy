class Darts {
    static int score(x, y) {
        def points = 0
        def sumSquares = x * x + y * y
        if (sumSquares <= 100) points += 1 
        if (sumSquares <= 25)  points += 4  
        if (sumSquares <= 1)   points += 5
        points
    }
}