class SpaceAge {

    static final int earthYear = 31557600

    static final Map<String, Double> orbitalPeriod = [
                                        'Mercury': 0.2408467,
                                        'Venus':   0.61519726,
                                        'Earth':   1.0,
                                        'Mars':    1.8808158,
                                        'Jupiter': 11.862615,
                                        'Saturn':  29.447498,
                                        'Uranus':  84.016846,
                                        'Neptune': 164.79132
                                        ]

    static double age(String planet, int seconds) {
        (seconds / earthYear / orbitalPeriod[planet]).round(2)
    }
}