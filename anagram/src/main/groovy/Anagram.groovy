class Anagram {
    private final String word

    Anagram(String word) {
        this.word = word
    }
 
    def find(List<String> candidates) {
        def normalForm = { it.toLowerCase().collect().sort() }
        def duplicate = { this.word.equalsIgnoreCase(it) }
        def anagram = { normalForm(this.word) == normalForm(it) }
        candidates.findAll { anagram(it) && !duplicate(it) }
    }
}