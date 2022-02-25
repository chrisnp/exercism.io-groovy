class Luhn {

    static boolean valid(String value) {
        if (!(value.replaceAll(/ /, '') ==~ /\d{2,}/))
            return false      
        value.replaceAll(/ /, '').reverse()
             .collect { x -> x as int }.indexed()
             .collect { i, x -> 
                        i % 2 ? x > 4 ? 
                        2 * x - 9 : 2 * x : 
                        x 
             }.sum() % 10 == 0
    }
}
