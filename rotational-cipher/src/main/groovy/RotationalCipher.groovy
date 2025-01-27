class RotationalCipher {

    private int key

    RotationalCipher(int key) {
        this.key = key
    }

    private char rot(char ch, int key, int rotation) {
        char base = ch.isLowerCase() ? 
                    'a' as char : 
                    'A' as char
        (ch - base + key) % rotation + base
    }

    String rotate(String cipherText) {
        cipherText.toList()
                  .collect { it as char }
                  .collect { it.isLetter() ? rot(it, key, 26) : it }
                  .join()
    }
}
