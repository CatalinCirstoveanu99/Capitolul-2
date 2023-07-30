import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ex1
        System.out.println("\nExercitiul 1:\n");
        Scanner scanner_1 = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introdu un numar intre 1 si 100: ");
        int variabila = scanner_1.nextInt();
        int randomNumber = random.nextInt(1, 100);

        if (variabila < randomNumber) {
            System.out.println("\nNumarul introdus este mai mic decat " +
                    randomNumber);
        } else {
            System.out.println("\nFeliciari ai batut algoritmul");
        }

        // ex2
        System.out.println("\nExercitiul 2:\n");
        Scanner scanner_2 = new Scanner(System.in);
        System.out.println("\nIntrodu un caracter: ");
        char caracter = scanner_2.next().charAt(0);
        System.out.println("\nIntrodu primul numar: ");
        int nr1 = scanner_2.nextInt();
        System.out.println("\nIntrodu al doilea numar: ");
        int nr2 = scanner_2.nextInt();
        switch (caracter) {
            case 'a':
                System.out.println("\nSuma este: " + (nr1 + nr2));
                break;
            case 's':
                System.out.println("\nScaderea este: " + (nr1 - nr2));
                break;
            case 'i':
                System.out.println("\nProdusul este: " + (nr1 * nr2));
                break;
            case 'p':
                System.out.println("\nImpartirea este: " + nr1 / nr2);
                break;
            case 'm':
                System.out.println("\nModulul este: " + nr1 % nr2);
                break;
            default:
                System.out.println("\nEroare, nu ai introdus un caracter valid");
        }

        // ex3
        System.out.println("\nExercitiul 3:\n");
        int[][] array = { { 1, 2, 3, 4, 5 }, { 45, 65, 12, 87, 78 }, { 0, 89, 76, 48, 13 } };
        for (int i = 0; i <= 2; i++) {
            System.out.println(array[i][0] + " " + array[i][4]);
        }

        // ex4
        System.out.println("\nExercitiul 4:\n");
        char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f' };
        for (int i = 1; i < characters.length; i += 2) {
            System.out.println(characters[i] + ", ");
        }

        // ex5
        System.out.println("\nExercitiul 5:\n");
        double doubles[] = { 2, 3.5, 6.1, 4.5, 7.9, 12, 30 };
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] == 4.5) {
                System.out.println(doubles[i]);
            } else if (doubles[i] > 5) {
                System.out.println("Element peste 5");
            }
        }

        // ex6
        System.out.println("\nExercitiul 6:\n");
        int exemplu_array[] = { 54, 721, 7, 6, 57, 32, 9, 90, 4 };
        for (int i = 0; i < exemplu_array.length; i++) {
            if (i == 2) {
                continue;
            } else if (i == 7) {
                break;
            } else {
                System.out.println("Index valid " + i);
            }
        }

        // ex7
        System.out.println("\nExercitiul 7:\n");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        System.out.println("Suma este: " + sum);

        // ex8
        System.out.println("\nExercitiul 8:\n");
        ArrayList<Integer> arrayListEx8 = new ArrayList<>();
        arrayListEx8.add(10);

        System.out.println(arrayListEx8.isEmpty());

        // ex9
        System.out.println("\nExercitiul 9:\n");
        double array_ex9[] = { 32, 65, 344, 8, 98, 4.6, 27.9 };
        double aux;
        for (int i = 0; i < array_ex9.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array_ex9[i] > array_ex9[j]) {
                    aux = array_ex9[i];
                    array_ex9[i] = array_ex9[j];
                    array_ex9[j] = aux;
                }
            }
        }
        System.out.println("Array ul ordonat descrescator: ");
        for (int i = 0; i < array_ex9.length; i++) {
            System.out.println(array_ex9[i]);
        }
    }
}