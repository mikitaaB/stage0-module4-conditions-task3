package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 'q' && symbol == 'w' && symbol == 'e' && symbol == 'r' && symbol == 't'
                && symbol == 'y' && symbol == 'u' && symbol == 'i' && symbol == 'o' && symbol == 'p') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
