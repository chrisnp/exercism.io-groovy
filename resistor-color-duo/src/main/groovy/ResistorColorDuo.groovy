class ResistorColorDuo {

    static final colors = ['black',
                           'brown',
                           'red',
                           'orange',
                           'yellow',
                           'green',
                           'blue',
                           'violet',
                           'grey',
                           'white']

    static int value(List<String> colorsInput) {

        colorsInput
        .take(2)
        .collect { color -> colors.indexOf color }
        .join('') as int
    }
}