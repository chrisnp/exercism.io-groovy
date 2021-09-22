class SecretHandshake {

    static List<String> commands(int number) {

        List<String> handshake = []
        
        if ((0x01 & number) != 0) handshake << 'wink'
        if ((0x02 & number) != 0) handshake << 'double blink'
        if ((0x04 & number) != 0) handshake << 'close your eyes'
        if ((0x08 & number) != 0) handshake << 'jump'
        if ((0x10 & number) != 0) Collections.reverse(handshake)
           
        handshake
    }
}
