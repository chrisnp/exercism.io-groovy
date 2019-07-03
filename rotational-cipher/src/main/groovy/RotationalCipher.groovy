class RotationalCipher {
    // private int key

    // RotationalCipher(int key) {
    //     this.key = key
    // }

    // String rotate(String cipherText) {
        
    // }

    private int key

    RotationalCipher(int key) {
        this.key = key
    }

    String rotate(String cipherText) {
        cipherText.toCharArray().collect { it.isLetter() ? rotateChar(it, key) : it }.join()
    }

    private char rotateChar(char c, int key) {
        def base = c.isUpperCase() ? 'A' as char : 'a' as char
        (c - base + key) % 26 + base
    }
}
