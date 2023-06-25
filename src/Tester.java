// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tester {
    public static void main(String[] args) {
        Employee employee1 = new Employee(" Stefano " , " Di Gregoli " , " via ariosto 22 ");
        Employee employee2 = new Employee(" Giovanni " , " Verdi " , " via enna 3");
        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();
        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();


    }
}