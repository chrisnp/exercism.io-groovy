class Darts {

    static int score(x, y) {
        def sumsqs = x * x + y * y
        sumsqs <= 1   ? 10 : 
        sumsqs <= 25  ? 5  : 
        sumsqs <= 100 ? 1  : 
        0
    }
}