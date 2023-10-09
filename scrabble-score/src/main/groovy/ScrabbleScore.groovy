class ScrabbleScore {

    static scoreWord(String word) {
        word
        .trim()
        .toUpperCase()
        .collect {
            (it =~ /[QZ]/)         ? 10 :
            (it =~ /[JX]/)         ? 8  : 
            (it == 'K')            ? 5  :
            (it =~ /[FHVWY]/)      ? 4  :
            (it =~ /[BCMP]/)       ? 3  :
            (it =~ /[DG]/)         ? 2  :
            (it =~ /[AEIOULNRST]/) ? 1  : 0 }
        .sum(0)
    }
}