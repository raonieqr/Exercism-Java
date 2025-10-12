class Scrabble {
    String word;
    
    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;

        for (int i = 0; i < this.word.length(); i++)
        {
            char test = this.word.charAt(i);
            if (test == 'A' || test == 'E' || test == 'I' || test == 'O' || test == 'U'
               || test == 'L' || test == 'N' || test == 'R' || test == 'S' || test == 'T')
                score += 1;
            if (test == 'D' || test == 'G')
                score += 2;
            if (test == 'B' || test == 'C' || test == 'M' || test == 'P')
                score += 3;
            if (test == 'F' || test == 'H' || test == 'V' || test == 'W' || test == 'Y')
                score += 4;
            if (test == 'K')
                score += 5;
            if (test == 'J' || test == 'X')
                score += 8;
            if (test == 'Q' || test == 'Z')
                score += 10;
        }    
        return (score);
    }

}
