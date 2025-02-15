public class DesafioDate {
    int day;
    int month;
    int year;

    String getDateFormated() {
        return String.format("DATA FORMADA -> %d/%d/%d\n", day, month, year);
    }

    DesafioDate() {
        day = 1;
        month = 1;
        year = 1970;
    }

    DesafioDate(int dayInitial, int monthInitial, int yearInitial) {
        day = dayInitial;
        month = monthInitial;
        year = yearInitial;
    }
}
