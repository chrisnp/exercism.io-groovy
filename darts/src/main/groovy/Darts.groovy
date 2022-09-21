class Darts {

    static int score(x, y) {
        x * x + y * y <= 1 
        ? 10 
        : x * x + y * y <= 25 
        ? 5 
        : x * x + y * y <= 100 
        ? 1 
        : 0
    }
}