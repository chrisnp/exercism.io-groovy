class QueenAttack {

    static canAttack(Queen q1, Queen q2) {
        def dRank = (q1.getRank() - q2.getRank()).abs()
        def dFile = (q1.getFile() - q2.getFile()).abs()
        dRank * dFile == 0 || 
        dRank / dFile == 1
    }
}
