class FlattenArray {

    static Collection flatten( array ) {

        Collection flat = []

        array.each { element ->
            if (element instanceof Collection)
                FlattenArray.flatten(element)
                            .each { flat << it }
            else if (element != null) 
                flat << element
            else
                true
        }
        flat
    }
}