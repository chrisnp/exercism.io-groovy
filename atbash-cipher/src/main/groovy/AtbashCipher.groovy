class AtbashCipher {

    static final ciphermap = 
        [('a'..'z'),('z'..'a')].transpose().collectEntries()

    static String encode(phrase) {
        phrase.toLowerCase().chars
              .findAll { Character.isLetterOrDigit(it) }
              .collect { k -> ciphermap.find { it.key == k }?.value ?: k }
              .collate(5, true)
              .collect { it.join() }.join(" ")            
    }

    static String decode(phrase) {
         phrase.chars
               .findAll { Character.isLetterOrDigit(it) }
               .collect { v -> ciphermap.find { it.value == v } ?.key ?: v }
               .join()   
    }
}