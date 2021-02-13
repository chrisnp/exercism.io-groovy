class Strain {

    static Collection keep(Collection collection, 
                           Closure predicate) {
        if ( !collection ) return []
        collection.retainAll { predicate(it) }
        collection
    }

    static Collection discard(Collection collection, 
                              Closure predicate) {
        if ( !collection ) return []
        collection.removeAll { predicate(it) }
        collection
    }
}