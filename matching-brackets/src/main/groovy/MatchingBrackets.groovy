class MatchingBrackets {

    static String matchAway (String brackets) {
        brackets.replace("[]", "")
                .replace("()", "")
                .replace("{}", "")
    }

    // @TailRecursive
    static boolean pairOff (String remaining) {
        if (remaining.isEmpty())
           return true
        String updated = matchAway(remaining)
        if (updated.length() == remaining.length()) 
            false 
        else 
            pairOff(updated)
    }

    static boolean isPaired (String value) {
        pairOff(value.replaceAll(/[^\[\]\(\)\{\}]/, ""))
    }
}
