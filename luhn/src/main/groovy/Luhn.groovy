class Luhn {

    static boolean valid(String value) {

        if (!(value.replaceAll(/ /, '') ==~ /\d{2,}/))
            return false      

        value.replaceAll(/ /, '')
             .reverse()
             .collect { it as int }
             .indexed()
             .collect { i, x -> i % 2 ? 2 * x : x } 
             .collect { x -> x > 9 ? x - 9 : x }
             .sum() % 10 == 0
    }
}
