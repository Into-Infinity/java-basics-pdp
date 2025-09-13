package task12;

// Дана строка "Август, Сумма расходов равна, 0 ₽, Сумма доходов равна, 0 ₽"
// Где Август - любой месяц, 0 - это суммы расходов / доходов.
// Сохранить в переменные значения расходов и доходов, вывести в консоль
public class FinanceParser {

    public static void main(String[] args) {
        String text = "Сентябрь, Сумма расходов равна, 1500 ₽, Сумма доходов равна, 3200 ₽";
        String[] textParts = text.split("[ ,]+");

        int expenses = 0;
        int income = 0;

        for (int i = 0; i < textParts.length; i++) {
            if (textParts[i].equalsIgnoreCase("расходов")) {
                expenses = Integer.parseInt(textParts[i + 2].replaceAll("[^0-9]", ""));
            } else if (textParts[i].equalsIgnoreCase("доходов")) {
                income = Integer.parseInt(textParts[i + 2].replaceAll("[^0-9]", ""));
            }
        }

        System.out.println("Расходы: " + expenses + " ₽");
        System.out.println("Доходы: " + income + " ₽");
    }
}
