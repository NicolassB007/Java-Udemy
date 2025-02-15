public class DesafioDate {
    int day;
    int month;
    int year;

    String getDateFormated() {
        return String.format("DATA FORMADA -> %d/%d/%d", day, month, year);
    }
}
