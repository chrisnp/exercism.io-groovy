class FlattenArray {

    static Collection flatten( array ) {

        // Collection flat = []

        array.inject([], { flat, element ->
            if (element instanceof Collection)
                FlattenArray.flatten(element)
                            .each { flat << it }
            else if (element != null) 
                flat << element
            flat
        })
    }
}