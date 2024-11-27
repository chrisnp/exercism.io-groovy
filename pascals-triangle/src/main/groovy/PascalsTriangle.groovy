import java.util.stream.IntStream

class PascalsTriangle {

    // static rows(count) {
    //     throw new UnsupportedOperationException('Method implementation is missing')
    // }

    static List<List<Integer>> rows(count) {
        IntStream.range(0, count)
                 .mapToObj(this::row)
                 .toArray()
    }

    static List<Integer> row(int n) {
        return IntStream.range(0, n + 1)
                        .map(x -> binomial(n, x))
                        .toArray()
    }

    static int binomial(int i, int j) {
        factorial(i) / factorial(j) / factorial(i - j);
    }
    
    static int factorial(int n) {
        IntStream.range(1, n + 1)
                 .reduce(1, (x, y) -> x * y);
    }
}
