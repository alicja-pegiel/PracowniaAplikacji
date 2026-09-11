//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.print("Hello World"); // sout
    System.out.println("Cokolwiek");

    // To jest komentarz jednoliniowy

    /*
    To jest
    komentarz
    wieloliniowy
    WOW
     */

    int calkowita = 5;
    double rzeczywista = 1.5;

    System.out.println("Wartość zmiennej \"calkowita\" wynosi " + calkowita);
    System.out.println("Wartość zmiennej \"calkowita\" po podzieleniu na dwa: " + calkowita/2);

    char znak = 'a';
    System.out.println("Literka a ma wartość: " + (znak + 0));

    String napis = "napis";

    System.out.println("Wielkie litery: " + napis.toUpperCase());

    Scanner sc = new Scanner(System.in);

    System.out.println("Podaj wiek: ");
    int wiek = sc.nextInt();

}
