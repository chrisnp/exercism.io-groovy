class Proverb {

    public static String recite(List<String> strings) {

        def verses = 
            strings.collate(2, 1, false)
                   .collect{ premise, conclusion -> 
                                "For want of a " + 
                                "${premise} the " + 
                                "${conclusion} was lost." }

        def epilogue = 
            "And all for the want of a ${strings[0]}."

        strings.isEmpty() ? '' : [*verses, epilogue].join("\n")
    }
}