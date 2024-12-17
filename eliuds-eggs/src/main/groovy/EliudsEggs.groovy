class EliudsEggs {
    static eggCount(number) {
        int count = 0
        def turnOffRightmostOne = { it & it - 1 }
        while (number > 0) {
            count += 1
            number = turnOffRightmostOne(number)
        }
        count
    }
}
