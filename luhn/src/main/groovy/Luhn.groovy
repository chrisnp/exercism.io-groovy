class Luhn {

    static boolean valid(String value) {

        if (value ==~ /(\D)*/) return false
        
        List<String> sanitized = value.findAll { it ==~ /\d/}
        
        if (sanitized.size() <= 1) return false

        sanitized.reverse()
                 .collect { it as int}
                 .indexed()
                 .collect {i, x -> 
                            int ad = i % 2 != 0 ? 2 * x : x
                          }
                 .collect { it > 9 ? it - 9 : it}
                 .sum() % 10 == 0
    }
}
