class Raindrops {

    def convert(num) {
        [3: 'Pling', 5: 'Plang', 7: 'Plong']
        .collect { drop -> num % drop.key == 0 ? drop.value : "" }
        .join("") ?: "${num}"
    }   

}
