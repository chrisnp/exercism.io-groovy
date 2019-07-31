class RomanNumerals {
    RomanNumerals() {
        Integer.metaClass.getRoman = { ->
            
            Collection<String> roman = []

            for ( int arabic = (Integer) delegate; arabic > 0; ) {
                switch (arabic) {
                    case { arabic >= 1000 } :
                        roman << "M"
                        arabic -= 1000
                        break
                    case { arabic >= 900 } :
                        roman << "CM"
                        arabic -= 900
                        break
                    case { arabic >= 500 } :
                        roman << "D"
                        arabic -= 500
                        break
                    case { arabic >= 400 } :
                        roman << "CD"
                        arabic -= 400
                        break
                    case { arabic >= 100 } :
                        roman << "C"
                        arabic -= 100
                        break
                    case { arabic >= 90 } :
                        roman << "XC"
                        arabic -= 90
                        break
                    case { arabic >= 50 } :
                        roman << "L"
                        arabic -= 50
                        break
                    case { arabic >= 40 } :
                        roman << "XL"
                        arabic -= 40
                        break
                    case { arabic >= 10 } :
                        roman << "X"
                        arabic -= 10
                        break
                    case { arabic >= 9 } :
                        roman << "IX"
                        arabic -= 9
                        break
                    case { arabic >= 5 } :
                        roman << "V"
                        arabic -= 5
                        break
                    case { arabic >= 4 } :
                        roman << "IV"
                        arabic -= 4
                        break
                    case { arabic >= 1 } :
                        roman << "I"
                        arabic -= 1
                        break
                    default :
                        throw new IllegalArgumentException(
                            "$arabic cannot be represented as a roman numeral"
                            )
                }
            }
            roman.join('')
        }
    }
}
