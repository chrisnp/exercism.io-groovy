class Accumulate {

    static accumulate(Collection collection, Closure func) {
        
        if (!collection) 
            []
        else 
            [func(collection.head()), 
             *accumulate(collection.tail(), func)]
    }
}