class SecretHandshake {

    private static final signals = [
            1: 'wink',
            2: 'double blink',
            4: 'close your eyes',
            8: 'jump'
    ]

    static List<String> commands(int number) {
        
        List<String> handshake = signals.findAll { (number & it.key) == it.key }
                                        .collect { it.value }

        (number & 16) == 16 ? handshake.reverse() : handshake
    }
}
