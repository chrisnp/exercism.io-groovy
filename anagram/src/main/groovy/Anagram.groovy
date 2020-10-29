class Anagram {

    private final String word

    Anagram(String word) {
        this.word = word
    }

    private String normalForm(String s) {
        s.toLowerCase().collect()
                       .sort()
    }

    private boolean duplicate(String candidate) {
        word.equalsIgnoreCase(candidate)
    }

    private boolean anagram(String candidate) {
        normalForm(word) == normalForm(candidate)
    }
 
    def find(List<String> candidates) {
        candidates.findAll {
            x -> anagram(x) && !duplicate(x)
        }
    }
}