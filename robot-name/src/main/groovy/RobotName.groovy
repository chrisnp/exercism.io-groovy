class RobotName {

    String name
    private static Random random
    private static usedNames = []

    RobotName() {
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
