class NucleotideCount {

    static count(String strand) {

        if (!(strand ==~ /[ACGT]*/))
            throw new ArithmeticException('invalid nucleotide in strand')

        def nucleotideCounts = [:]    
        
        "ACGT".each { nucleotideCounts.put(it, strand.count(it)) }

        nucleotideCounts
    }
}