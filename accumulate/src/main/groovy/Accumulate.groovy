class Accumulate {

    static accumulate(Collection coll, Closure func) {
        if (!coll) return [] 
        [func(coll.head()), *accumulate(coll.tail(), func)]
    }
}