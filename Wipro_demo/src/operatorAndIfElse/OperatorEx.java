package operatorAndIfElse;

import java.util.*;

public class OperatorEx{

    static final int SIZE = 10;
    static final char EMPTY = '.';
    static char[][] grid = new char[SIZE][SIZE];
    static Random rand = new Random();

    // Word → Clue mapping
    
    static final Map<String, String> wordClues = Map.ofEntries(
        Map.entry("JAVA", "A popular programming language"),
        Map.entry("STRING", "Used to store text"),
        Map.entry("ARRAY", "Collection of elements"),
        Map.entry("LOOP", "Used for iteration"),
        Map.entry("CLASS", "Defines object structure"),
        Map.entry("OBJECT", "Instance of a class"),
        Map.entry("METHOD", "Function inside a class"),
        Map.entry("PUBLIC", "Access modifier"),
        Map.entry("STATIC", "Belongs to class"),
        Map.entry("FINAL", "Immutable keyword")
    );

    enum Direction {
        HORIZONTAL_RIGHT(0, 1, "→"),
        HORIZONTAL_LEFT(0, -1, "←"),
        VERTICAL_DOWN(1, 0, "↓"),
        VERTICAL_UP(-1, 0, "↑"),
        DIAGONAL_DOWN_RIGHT(1, 1, "↘"),
        DIAGONAL_UP_LEFT(-1, -1, "↖");

        int dr, dc;
        String symbol;

        Direction(int dr, int dc, String symbol) {
            this.dr = dr;
            this.dc = dc;
            this.symbol = symbol;
        }
    }

    static class WordPlacement {
        String word;
        int row, col;
        Direction direction;

        WordPlacement(String word, int row, int col, Direction direction) {
            this.word = word;
            this.row = row;
            this.col = col;
            this.direction = direction;
        }
    }

    static List<WordPlacement> placedWords = new ArrayList<>();

    public static void main(String[] args) {
        for (char[] row : grid) {
            Arrays.fill(row, EMPTY);
        }

        List<String> words = new ArrayList<>(wordClues.keySet());
        Collections.shuffle(words);

        for (String word : words) {
            if (placeWord(word)) {
                continue;
            }
        }

        fillRandomLetters();
        printGrid();
        printClues();
    }

    static boolean placeWord(String word) {
        Direction[] directions = Direction.values();
        int attempts = 100;

        while (attempts-- > 0) {
            Direction dir = directions[rand.nextInt(directions.length)];
            int row = rand.nextInt(SIZE);
            int col = rand.nextInt(SIZE);

            if (canPlaceWord(word, row, col, dir)) {
                for (int i = 0; i < word.length(); i++) {
                    int r = row + i * dir.dr;
                    int c = col + i * dir.dc;
                    grid[r][c] = word.charAt(i);
                }
                placedWords.add(new WordPlacement(word, row, col, dir));
                return true;
            }
        }
        return false;
    }

    static boolean canPlaceWord(String word, int row, int col, Direction dir) {
        for (int i = 0; i < word.length(); i++) {
            int r = row + i * dir.dr;
            int c = col + i * dir.dc;

            if (r < 0 || r >= SIZE || c < 0 || c >= SIZE)
                return false;

            char existing = grid[r][c];
            if (existing != EMPTY && existing != word.charAt(i))
                return false;
        }
        return true;
    }

    static void fillRandomLetters() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (grid[i][j] == EMPTY)
                    grid[i][j] = (char) ('A' + rand.nextInt(26));
    }

    static void printGrid() {
        System.out.println("Crossword Grid:");
        for (char[] row : grid) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    static void printClues() {
        System.out.println("\nClues:");
        for (WordPlacement wp : placedWords) {
            String clue = wordClues.get(wp.word);
            System.out.printf("- %s (%d,%d) %s: %s\n",
                    wp.word,
                    wp.row + 1, wp.col + 1,
                    wp.direction.symbol,
                    clue
            );
        }
    }
}