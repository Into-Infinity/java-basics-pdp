package task17;

import java.util.Set;
import java.util.stream.Collectors;

// Необходимо сформировать список цветов кислых фломастеров и вывести его в формате ["цвет1", ..., "цветN"].
// Пример ["красный", "зелёный", "жёлтый"].
public class Flomaster {
    final String color;
    final String taste;

    public Flomaster(String c, String t) {
        color = c;
        taste = t;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }

    public static String getSourFlomaster(Set<Flomaster> flomasterSet) {
        return flomasterSet.stream()
                .filter(f -> "кислый".equals(f.getTaste()))
                .map(f -> "\"" + f.getColor() + "\"")
                .collect(Collectors.joining(", ", "[", "]"));
    }

    public static void main(String[] args) {
        Set<Flomaster> flomasterSet = Set.of(
                new Flomaster("красный", "кислый"),
                new Flomaster("зелёный", "кислый"),
                new Flomaster("жёлтый", "кислый"),
                new Flomaster("синий", "сладкий")
        );

        String result = getSourFlomaster(flomasterSet);
        System.out.println(result);
    }
}
