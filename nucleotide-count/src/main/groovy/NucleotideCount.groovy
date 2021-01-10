class NucleotideCount {

    static String ERR = 
            'invalid nucleotide in strand'  

    static count(String strand) {

        if (!(strand ==~ /[ACGT]*/))
            throw new ArithmeticException(ERR)

        def nucleotideCounts = [:]    
        
        "ACGT".each { 
            nucleotideCounts.put(it, 
                                 strand.count(it)) 
        }

        nucleotideCounts
    }
}