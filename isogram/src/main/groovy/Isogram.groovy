class Isogram {

    static boolean isIsogram(String phrase) {

        def normalized = phrase.toLowerCase()
                         .toCharArray()
                         .findAll{ it.isLetterOrDigit() }
        
        return normalized.size() - normalized.unique().size() == 0

    }

}