class Series {

    static List<String> slices(String series, int sliceLength) {

        if (sliceLength <= 0 || sliceLength > series.length()) 
            throw new ArithmeticException("invalid slice")

        List<String> subs = []

        for (i in 0..series.length() - sliceLength)
            subs << series.substring(i, i + sliceLength) 

        subs
    }
}