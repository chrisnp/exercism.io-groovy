class WordCount {
    private final String phrase
    private final REGEX = /([^A-Za-z0-9']|\B'|'\B)/

    WordCount(sentence) {
        this.phrase = sentence.replaceAll(REGEX, ' ').toLowerCase()
    }

    def countWords() {
        phrase.findAll(/[\w']+/)
        .inject([:], {map, w -> 
                        if (w) 
                            map[w] = map[w] ? map[w] + 1 : 1
                        map
                     })
    }
}