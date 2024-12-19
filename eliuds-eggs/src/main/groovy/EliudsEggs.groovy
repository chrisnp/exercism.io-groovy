class EliudsEggs {
    static eggCount(number) {
        int count = 32
        def turnOnRightmostZero = { it | it + 1 }
        while (number > -1) {
            count -= 1
            number = turnOnRightmostZero(number)
        }
        count
    }
}
