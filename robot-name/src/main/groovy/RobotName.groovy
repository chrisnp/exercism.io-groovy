class RobotName {

    String name
    private static Random random
    private static usedNames = []
    private static final int AllNames = 26^2 * 10^3

    RobotName() {
        if (usedNames.size() >= AllNames)
            throw new Exception("All possible names are being used")
        random = new Random()
        reset()
        usedNames << name
    }

    def reset() {
        String provisional = generateName()
        while (usedNames.any { it == provisional })
            provisional = generateName()
        this.name = provisional
    }

    private String generateName() {
        String letters = (1..2).collect { ("A".."Z")[random.nextInt(26)] }
                               .join('') 
        String numbers = (1..3).collect { random.nextInt(10) }
                               .join('')
        letters + numbers
    }
}
