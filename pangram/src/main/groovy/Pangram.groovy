class Pangram {

    static boolean isPangram(String sentence) {
        if (sentence != "") {
            for (String letter : ('a'..'z')) {
                if (!sentence.toLowerCase()
                             .contains(letter)) 
                    return false
            }
            return true
        }
        return false
    }
}