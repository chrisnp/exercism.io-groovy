class FlattenArray {

    public static Collection flatten( array ) {

        Collection flat = []

        array.each { element -> 
            if (!(element instanceof Collection)) {
                if (element != null)
                    flat << element
            }
            else {
                FlattenArray.flatten(element)
                            .each {e -> flat << e}
            }
        }
        flat
    }
}