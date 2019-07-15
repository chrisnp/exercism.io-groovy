class RnaTranscription {

    def ofDNA(strand) {
        strand.collect {
            switch (it) {
                case 'C': return 'G'
                case 'G': return 'C'
                case 'T': return 'A'
                case 'A': return 'U'
                default: throw new IllegalArgumentException("invalid input")
            }
        }.join()
    }

}
