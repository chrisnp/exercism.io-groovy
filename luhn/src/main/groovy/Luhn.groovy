class Luhn {

    static boolean valid(String value) {

        if (value ==~ /[^0-9]|[^\s]*/) return false
        
        List<String> sanitized = 
                    value.toList()
                         .findAll { it ==~ /\d/}
                         .reverse()
        
        if (sanitized.size() <= 1) return false

        sanitized.collect { it as int}
                 .indexed()
                 .collect {i, x -> i % 2 != 0 ? 
                                   2 * x      : 
                                   x > 9      ? 
                                   x - 9      :
                                   x 
                          }
                 .sum() % 10 == 0
    }
}
