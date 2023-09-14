class Accumulate {

    static accumulate(Collection coll, Closure func) {

        if (!coll) 
            []
        else 
            [func(coll.head()), *accumulate(coll.tail(), func)]
    }
}