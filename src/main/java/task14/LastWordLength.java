package task14;

// Дана строка s, состоящая из слов и пробелов. Верните длину последнего слова в строке.
// Слово — это максимальная подстрока, состоящая только из символов, не являющихся пробелами.
public class LastWordLength {

    public static void main(String[] args) {
        String s = "  Сегодня отличная погода и мы идем гулять в парк   ";

        s = s.trim();

        int lastSpaceIndex = s.lastIndexOf(" ");
        String lastWord = s.substring(lastSpaceIndex + 1);

        System.out.println("Последнее слово: \"" + lastWord + "\"");
        System.out.println("Длина: " + lastWord.length());
    }

}
