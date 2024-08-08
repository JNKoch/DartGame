package EigenesProjektNr1;

import java.util.InputMismatchException;

import static EigenesProjektNr1.Darts.Spiel;
import static EigenesProjektNr1.Darts.scanner;
import static EigenesProjektNr1.DartsMehrere.DartsMehrereSpiel;


public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        int eingabe = 1;
        int gesamtScore1 = 0;
        int gesamtScore2 = 0;
        int exceptionsHandler;
        Ausgabe("Player1 geben sie ihren Namen an");
        String eins = scanner.nextLine();
        Player1 player1 = new Player1(eins);
        Ausgabe("Player2 geben sie ihren Namen an");
        String zwei = scanner.nextLine();
        Player2 player2 = new Player2(zwei);
        String name1 = player1.getName();
        String name2 = player2.getName();
        do {
            do {
                try {
                    Ausgabe("Das Hauptmenü\n" +
                            "1 für das Spiel in Legs\n" +
                            "2 für das Spiel in Sets\n" +
                            "3 für den Gesamtscore dieses Spiels\n" +
                            "4 für das Einzeltraining\n" +
                            "5 für das Spiel mit 3 - 6 Personen\n" +
                            "6 um das Programm zu beenden");

                    eingabe = scanner.nextInt();
                    exceptionsHandler = 1;
                } catch (InputMismatchException ex) {
                    scanner.next();
                    exceptionsHandler = 0;
                    Ausgabe("Bitte nur eine Zahl und keinen Buchstaben");
                }
            } while (exceptionsHandler == 0);

            switch (eingabe) {
                case 1 -> {
                    int legScore1 = 0;
                    int legScore2 = 0;
                    Ausgabe("Wie viele Legs wollen sie spielen");
                    int Legs = EingabeMitScanner();
                    Ausgabe("Mit wie vielen Punkten wollen sie spielen");
                    int Punkte = EingabeMitScanner();
                    for (int i = 0; i < Legs; i++) {
                        if (Spiel(name1, name2, Punkte).charAt(38) == '1') {
                            gesamtScore1++;
                            legScore1++;
                            Ausgabe("Der LegScore ist: " + legScore1 + " zu " + legScore2);
                        } else {
                            gesamtScore2++;
                            legScore2++;
                            Ausgabe("Der LegScore ist: " + legScore1 + " zu " + legScore2);
                        }
                        if (legScore1 == ((Legs / 2) + 1)) {
                            i = Legs;
                        } else if (legScore2 == ((Legs / 2) + 1)) {
                            i = Legs;
                        }
                    }
                }
                case 2 -> {
                    Ausgabe("Wie viele Sets wollen sie spielen");
                    int setScore1 = 0;
                    int setScore2 = 0;
                    int Sets = EingabeMitScanner();
                    Ausgabe("Mit wie vielen Punkten wollen sie spielen");
                    int Punkte = EingabeMitScanner();
                    for (int s = 0; s < Sets; s++) {
                        int legs = 5;
                        int legScore1 = 0;
                        int legScore2 = 0;
                        if (setScore1 == ((Sets / 2) + 1)) {
                            s = Sets;
                        } else if (setScore2 == ((Sets / 2) + 1)) {
                            s = Sets;
                        }
                        Ausgabe("Der SetScore ist: " + setScore1 + " zu " + setScore2);
                        for (int i = 0; i < legs; i++) {
                            if (Spiel(name1, name2, Punkte).charAt(38) == '1') {
                                gesamtScore1++;
                                legScore1++;
                                Ausgabe("Der LegScore ist: " + legScore1 + " zu " + legScore2);
                                if (legScore1 == 3) {
                                    setScore1++;
                                }
                            } else {
                                gesamtScore2++;
                                legScore2++;
                                if (legScore2 == 3) {
                                    setScore2++;
                                }
                                Ausgabe("Der LegScore ist: " + legScore2 + " zu " + legScore2);
                            }
                            if (legScore1 == 3) {
                                i = 5;
                            } else if (legScore2 == 3) {
                                i = 5;
                            }
                        }
                    }
                }
                case 3 -> Ausgabe("Der Gesamtscore ist\n" +
                                name1 + " " + gesamtScore1 + "\n" +
                                name2 + " " + gesamtScore2);

                case 4 -> {
                    int peter;
                    do {
                        Ausgabe("Wie viele legs wollen sie trainieren" + "\n" +
                                "oder wollen sie trainieren bis sie keine Lust mehr haben" + "\n" +
                                "1 für Legs" + "\n" +
                                "2 für Endlos");
                        peter = EingabeMitScanner();
                        switch (peter) {
                            case 1 -> {
                                int legScore1 = 0;
                                Ausgabe("Geben sie die Legs ein die sie trainieren");
                                int legs = EingabeMitScanner();
                                Ausgabe("Mit wie vielen Punkten wollen sie trainieren");
                                int Punkte = EingabeMitScanner();
                                for (int i = 0; i < legs; i++) {
                                    if (Spiel(name1, name2, Punkte).charAt(38) == '1') {
                                        legScore1++;
                                        Ausgabe("Du hast " + legScore1 + " mal gespielt");
                                    }
                                    peter = 3;
                                }
                            }
                            case 2 -> {
                                Ausgabe("Wie viele Punkte");
                                int Punkte = EingabeMitScanner();
                                int legScore1 = 0;
                                int schleife = 0;
                                while (schleife < 50) {
                                    if (Spiel(name1, name2, Punkte).charAt(38) == '1') {
                                        gesamtScore1++;
                                        legScore1++;
                                        Ausgabe("Du hast " + legScore1 + " mal gespielt");
                                        schleife++;
                                    }
                                }
                                Ausgabe("Geh mal raus Fettsack");
                                peter = 3;
                            }
                        }
                    } while (peter != 3);
                }
                case 5 -> DartsMehrereSpiel();
            }
        } while (eingabe != 6);
        Ausgabe("Scanner wird geschlossen");
        scanner.close();
    }

    private static void Ausgabe(String ausgabe) {
        String str = ("-------------------------------" + "\n" +
                                    ausgabe + "\n" +
                     "-------------------------------" + "\n");
        System.out.println(str);

    }

    public static int EingabeMitScanner() {
        int eingabe = 0;
        int exceptionHandler;

        do {
            try {
                eingabe = scanner.nextInt();
                exceptionHandler = 1;
            } catch (InputMismatchException ex) {
                scanner.next();
                exceptionHandler = 0;
                Ausgabe("Bitte nur ganze Zahlen und keinen Buchstaben");
            }
        } while (exceptionHandler == 0);

        return eingabe;
    }
}
