class IsbnVerifier {

    static boolean isValid(String isbn) {
        
        boolean wellFormed = (isbn ==~ /(\d)-?(\d{3})-?(\d{5})-?([0-9X])/)
        boolean verified = isbn.findAll { (it as char).isLetterOrDigit() }
                               .withIndex()
                               .collect { c, i -> 
                                          c == 'X' ? 10 : (c as int) * (10 - i)}
                               .sum() % 11 == 0
        wellFormed && verified
    }
}