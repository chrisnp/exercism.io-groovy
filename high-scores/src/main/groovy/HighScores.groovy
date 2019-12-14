class HighScores {

    final List<Integer> scores

    HighScores(List<Integer> scores) {
        this.scores = scores
    }

    int latest() {
        scores.last()
    }

    int personalBest() {
        scores.max()
    }

    List<Integer> personalTopThree() {
        scores.collect()
              .sort() { a, b -> b.compareTo(a) }
              .take(3)
    }
}
