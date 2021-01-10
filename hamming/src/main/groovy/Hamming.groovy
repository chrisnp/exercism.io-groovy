class Hamming {

    def distance(strand1, strand2)  {

        if (strand1.length() != strand2.length()) 
            throw new ArithmeticException()

        [strand1, strand2]*.toCharArray()
                           .transpose()
                           .count { s1c, s2c -> 
                                    s1c != s2c }          
    }
}