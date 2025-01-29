class DndCharacter {
    private int strength
    private int dexterity
    private int constitution
    private int intelligence
    private int charisma
    private int wisdom
    private int hitpoints
    private def rollDice() { 
        (int) Math.floor(6 * Math.random()) + 1 
    }
    DndCharacter() {
        strength = ability()
        dexterity = ability()
        constitution = ability()
        intelligence = ability()
        wisdom = ability()
        charisma = ability()
        hitpoints = 10 + modifier(constitution)
    }
    def ability() {
        def discard = 7
        def rollsum = 0
        (1..4).collect {
            def roll = rollDice()
            rollsum += roll;
            discard = discard < roll ? discard : roll
        }
        rollsum - discard
    }
    def modifier(int ability) {
        (int) Math.floorDiv(ability - 10, 2)
    }
}
