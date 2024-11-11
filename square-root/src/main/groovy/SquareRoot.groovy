class SquareRoot {
    static Integer squareRoot(Integer radicand) {
        double epsilon = 2.718281828459045
        double nat_log = 99999999 * (radicand ** (1 / 99999999) - 1)
        return Math.round(epsilon ** (nat_log / 2))
    }
}
