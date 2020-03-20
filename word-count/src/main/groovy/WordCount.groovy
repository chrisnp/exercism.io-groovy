class WordCount {

    private final String phrase

    WordCount(sentence) {
        this.phrase = 
            sentence
            .replaceAll(/([^A-Za-z0-9']|\B'|'\B)/, ' ')
            .toLowerCase()
    }

    def countWords() {
        phrase.findAll(/[\w']+/)
              .inject([:], {map, w -> 
                  if (w) map[w] = map[w] ?
                                  map[w] + 1 : 1
                  map
              })
    }
}