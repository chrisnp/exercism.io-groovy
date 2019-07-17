class RnaTranscription {

    def ofDNA(strand) {

        if ( !(strand ==~ /[ACGT]+/) )
            throw new IllegalArgumentException("invalid sequence")
            
        strand.tr("ACGT", "UGCA")
    }
}
