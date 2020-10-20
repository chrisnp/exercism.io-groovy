class IsbnVerifier {

    static boolean isValid(String isbn) {

        boolean wellFormed = 
            isbn ==~ /[0-9]-*[0-9]{3}-*[0-9]{5}-*([0-9]|[X])/

        if (!wellFormed) return false
        
        String normal = 
            isbn.findAll { (it as char).isLetterOrDigit() }
                .join()

        String checkDig = 
            normal.substring(normal.length() - 1)

        List<Integer> digits = 
            normal
            .take(9)
            .collect { d -> d as int }

        [10..1, [*digits, checkDig == 'X' ? 
                          10 : checkDig as int]]
        .transpose()
        .inject(0) {sum, x -> 
                        sum + (x[0] * x[1])} % 11 == 0  
    }
}