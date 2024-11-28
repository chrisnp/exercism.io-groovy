import java.util.stream.IntStream

class PascalsTriangle {

    static List<List<Integer>> rows(count) {
        def factorial = { 
            IntStream.range(1, it + 1).reduce(1, (acc, x) -> acc * x)
        }

        def binomial = { i = j, j = 0 ->
            factorial(i).intdiv(factorial(j) * factorial(i - j))
        }

        def row = { r -> 
            IntStream.range(0, r + 1).map(x -> binomial(r, x)).toList()
        }
        
        IntStream.range(0, count).mapToObj(n -> row(n)).toList()
    }
}
