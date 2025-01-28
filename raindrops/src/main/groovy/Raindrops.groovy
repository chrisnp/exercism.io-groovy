class Raindrops {

    def convert(num) {
        [3: 'Pling', 5: 'Plang', 7: 'Plong']
        .collect { num % it.key == 0 ? it.value : "" }
        .join("") ?: "${num}"
    }   

}
