class WordCount {

    private final String phrase

    WordCount(s) {
        this.phrase = 
            s.replaceAll(/([^A-Za-z0-9']|\B'|'\B)/, ' ')
             .toLowerCase()
    }

    def wordCount() {
        phrase.findAll(/[\w']+/)
              .inject([:], {map, w -> 
                  if (w) map[w] = map[w] ?
                                  map[w] + 1 : 1
                  map
              })
    }
}