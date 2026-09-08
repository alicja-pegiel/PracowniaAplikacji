//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Hello World"); // sout
    System.out.println("Cokolwiek");

    // To jest komentarz jednoliniowy (ctrl + /)

    /*
    To jest komentarz
    Na wiele linijek
    Coś tu opisuję bardziej
     */

    int calkowita = 5;
    double rzeczywista = 1.5;

    System.out.println("\tWartość zmiennej \"calkowita\" to " + calkowita/2);
    System.out.println("\nWartość zmiennej rzeczywista to " + rzeczywista);

    char litera = 97;
    String napis = "napis";

    System.out.println(litera);
    System.out.println(napis);

    boolean czyPrawda = true; // false

    System.out.println(czyPrawda);

    System.out.println("Wartość 1 + 2 + 3 = " + (1 + 2 + 3));
    System.out.println(1 + 2 + 3 + " to wartość 1 + 2 + 3");

    System.out.println("Podaj wiek: ");

    Scanner sc = new Scanner(System.in);

    int wiek = sc.nextInt();
}
