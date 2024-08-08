package EigenesProjektNr1;
import java.util.Scanner;

import static EigenesProjektNr1.Main.EingabeMitScanner;
import static EigenesProjektNr1.WurfVorschlaege.WurfVorschlaegeDoppelOut40;

public class Darts {
    public static int PunktePlayer1 = 501;
    public static int PunktePlayer2 = 501;
    static Scanner scanner = new Scanner(System.in);

    public static String Spiel (String player1, String player2, int Punkte) {
        int PunktzahlWurf;
        int Start;
        PunktePlayer1 = Punkte;
        PunktePlayer2 = Punkte;
        String name1 = player1;
        String name2 = player2;
        Ausgabe("Gebe ein wer das Spiel anfängt: \n" +
                "1 für " + name1 + "\n" +
                "2 für " + name2+ "\n" +
                "3 für Einzeltraining");
        Start = EingabeMitScanner();
        while (Start != 1 && Start != 2 && Start !=3) {
            Ausgabe("Falsche Eingabe");
            Start = EingabeMitScanner();
        }
        do {
            switch (Start) {
                case 1 -> {
                    Ausgabe(name1 + " ist dran:\n" +
                            "ihre Punktzahl ist "+ PunktePlayer1+
                            "\nGeben sie ihre Punktzahl ein");
                    PunktzahlWurf = EingabeMitScanner();
                    while ((PunktePlayer1 - PunktzahlWurf) < 0|| (PunktePlayer1- PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                        Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                        PunktzahlWurf = EingabeMitScanner();
                        //PunktePlayer1 -= PunktzahlWurf;
                        } //else
                    PunktePlayer1 -= PunktzahlWurf;
                    Ausgabe(name1 + " hat: " + PunktePlayer1 + " Punkte");
                    if (PunktePlayer1 <= 160) {
                        WurfVorschlaegeDoppelOut40(PunktePlayer1);
                    }
                    Start = 2;
                }
                case 2 -> {
                    Ausgabe(name2 + " ist dran:\n" +
                            "ihre Punktzahl ist "+ PunktePlayer2+
                            "\nGeben sie ihre Punktzahl ein");
                    PunktzahlWurf = EingabeMitScanner();
                    while ((PunktePlayer2 - PunktzahlWurf) < 0  || (PunktePlayer2- PunktzahlWurf) == 1|| PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                        Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                        PunktzahlWurf = EingabeMitScanner();
                        //PunktePlayer2 -= PunktzahlWurf;
                    }// else
                    PunktePlayer2 -= PunktzahlWurf;
                    Ausgabe(name2 + " hat: " + PunktePlayer2 + " Punkte");
                    if (PunktePlayer2 <= 160) {
                        WurfVorschlaegeDoppelOut40(PunktePlayer2);
                    }
                    Start = 1;
                }
                case 3 -> {
                    Ausgabe(name1 + " ist dran:\n" +
                            "ihre Punktzahl ist "+ PunktePlayer1+
                            "\nGeben sie ihre Punktzahl ein");
                    PunktzahlWurf = EingabeMitScanner();
                    while ((PunktePlayer1 - PunktzahlWurf) < 0|| (PunktePlayer1- PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                        Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                        PunktzahlWurf = EingabeMitScanner();
                        //PunktePlayer1 -= PunktzahlWurf;
                    } //else
                    PunktePlayer1 -= PunktzahlWurf;
                    Ausgabe(name1 + " hat: " + PunktePlayer1 + " Punkte");
                    if (PunktePlayer1 <= 160) {
                        WurfVorschlaegeDoppelOut40(PunktePlayer1);
                    }
                }
            }
        }while (PunktePlayer1 != 0 && PunktePlayer2 != 0);
            // Falscher Start mit Programm Obwohl da gabs noch Probleme im Code also es hätte auch so klappen können
            // späterer Kommentar hätte es nicht
            /*if (Start == 1) {
                Ausgabe( name1 + " ist dran:\n"+
                        "Geben sie ihre Punktzahl ein");
                PunktzahlWurf = scanner.nextInt();
                if ((PunktePlayer1 - PunktzahlWurf) <= 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                    Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                    PunktzahlWurf = scanner.nextInt();
                    PunktePlayer1 -= PunktzahlWurf;
                } else PunktePlayer1 -= PunktzahlWurf;
                Ausgabe( name1 + " hat: "+ PunktePlayer1+ " Punkte");
                Start = 2;
            } else if (Start == 2) {
                Ausgabe(name2 +  " ist dran:\n"+
                        "Geben sie ihre Punktzahl ein");
                PunktzahlWurf = scanner.nextInt();
                if ((PunktePlayer2 - PunktzahlWurf) <= 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                    Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                    PunktzahlWurf = scanner.nextInt();
                    PunktePlayer2 -= PunktzahlWurf;
                } else PunktePlayer2 -= PunktzahlWurf;
                Ausgabe(name2 + " hat: "+ PunktePlayer2+ " Punkte");
                Start = 1;
            }


        } while (PunktePlayer1 != 0 && PunktePlayer2 != 0);*/
        if (PunktePlayer1 == 0) {
            return Ausgabe("Player1 " + name1 + " hat gewonnen");
        } else if (PunktePlayer2 == 0) {
            return Ausgabe("Player2 " + name2 + " hat gewonnen");
        } else return Ausgabe("bin ich dumm");

        }

    public static String Ausgabe(String ausgabe) {
        String str = ("-------------------------------"+"\n"+
                      ausgabe +"\n"+
                      "-------------------------------"+"\n");
        System.out.println(str);
        return str;
    }
}


