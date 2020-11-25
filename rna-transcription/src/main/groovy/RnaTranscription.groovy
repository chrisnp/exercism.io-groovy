class RnaTranscription {

    static final ERR = "invalid sequence"

    def toRNA(String strand) {

        if ( !(strand ==~ /[ACGT]+/) )
            throw new IllegalArgumentException(ERR)
            
        strand.tr("ACGT", "UGCA")
    }
}
