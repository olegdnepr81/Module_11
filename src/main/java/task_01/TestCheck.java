package task_01;

public class TestCheck {
    public static void main(String[] args) {
        String [] names = {"Sasha", "Lera", "Kostya", "Oleh", "Ruslan", "Bogdan"};
        FilterOddIndexName check = new FilterOddIndexName();
        System.out.println(check.nameLine(names));

    }
}
