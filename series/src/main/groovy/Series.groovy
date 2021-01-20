class Series {

    static List<String> slices(String series, int sliceLength) {

        if (sliceLength <= 0) 
            throw new ArithmeticException(
                    "Slice length cannot be zero or less"
            )

        if (sliceLength > series.length())
            throw new ArithmeticException(
                    "Slice length is too large"
            )

        if (series.length() == 0)
            throw new ArithmeticException(
                    "Empty series is invalid"
            )

        List<String> subs = []

        for (i in 0..series.length() - sliceLength)
            subs << series.substring(i, i + sliceLength) 

        subs
    }
}