package inheritance;

public final class Boss extends Manager {
    public Boss() {
        super();
    }
    public Boss (String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }
}
