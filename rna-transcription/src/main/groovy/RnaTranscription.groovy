class RnaTranscription {

    static final ERR = "invalid sequence"

    static String toRna(String strand) {

        if ( strand ==~ /[^ACGT]+/ )
            throw new IllegalArgumentException(ERR)
            
        strand.tr('ACGT', 'UGCA')
    }
}
