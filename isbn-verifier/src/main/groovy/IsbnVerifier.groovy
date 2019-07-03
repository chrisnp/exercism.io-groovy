class IsbnVerifier {

    static boolean isValid(String isbn) {
        
        boolean wellFormed = isbn ==~ /^[0-9]-?[0-9]{3}-?[0-9]{5}-?[0-9X]$/)
        boolean verified = isbn.findAll { (it as char).isLetterOrDigit() }
                               .withIndex()
                               .collect { c, i -> 
                                          c == 'X' ? 10 : (c as int) * (10 - i)}
                               .sum() % 11 == 0
    }
}