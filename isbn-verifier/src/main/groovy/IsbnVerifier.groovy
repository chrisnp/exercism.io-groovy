class IsbnVerifier {

    static boolean isValid(String isbn) {
        
        boolean wellFormed = isbn ==~ /(\d)-?(\d{3})-?(\d{5})-?([0-9X])/

        if (!wellFormed) return false

        boolean valid = isbn.findAll { (it as char).isLetterOrDigit() }
                            .withIndex()
                            .collect { c, i -> 
                                          c == 'X' ? 10 : (c as int) * (10 - i)}
                            .sum() % 11 == 0
        valid
    }
}