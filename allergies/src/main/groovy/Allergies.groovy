class Allergies {

    private static final CAUSES = ['eggs', 'peanuts', 
                                   'shellfish', 'strawberries',
                                   'tomatoes', 'chocolate', 
                                   'pollen', 'cats']

    private final List<String> allergies

    Allergies(int score) {
        allergies = CAUSES.findAll { 
            (score & (1 << CAUSES.indexOf(it))) != 0
        }.collect { it }
    }

    boolean allergicTo(String allergen) {
        allergies.indexOf(allergen) != -1
    }

    List<String> list() {
        allergies
    }
}