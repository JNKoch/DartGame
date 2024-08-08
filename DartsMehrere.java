package EigenesProjektNr1;
import java.util.Scanner;

import static EigenesProjektNr1.Main.EingabeMitScanner;
import static EigenesProjektNr1.WurfVorschlaege.WurfVorschlaegeDoppelOut40;

public class DartsMehrere {

    public static String DartsMehrereSpiel() {
        int PunktzahlWurf;
        int Start;
        String player1 = null;
        String player2 = null;
        String player3 = null;
        String player4 = null;
        String player5 = null;
        String player6 = null;
        Scanner scanner = new Scanner(System.in);
        Ausgabe("Wie viele Spieler möchten mit spielen 3-6");
        int Mitspieler = EingabeMitScanner();
        while (Mitspieler < 3  || Mitspieler > 6) {
            Ausgabe("Falsche Eingabe nur 3 - 6 Mitspieler");
            Mitspieler = EingabeMitScanner();
        }
        Ausgabe("Mit wie vielen Punkten wollen sie spielen");
        int Punkte = EingabeMitScanner();
        int PunktePlayer1 = Punkte;
        int PunktePlayer2 = Punkte;
        int PunktePlayer3 = Punkte;
        int PunktePlayer4 = Punkte;
        int PunktePlayer5 = Punkte;
        int PunktePlayer6 = Punkte;
        //Namen Eingeben
        switch (Mitspieler) {
            case 3 -> {
                Ausgabe("Player1 geben sie ihren Namen an");
                // Muss zweimal geschrieben werden player = scanner.nextLine(); weil der sonst den ersten scanner nicht erkennt
                // neu man muss eine den Scanner nur auch nextLine setzen
                scanner.nextLine();
                player1 = scanner.nextLine();
                Ausgabe("Player2 geben sie ihren Namen an");
                player2 = scanner.nextLine();
                Ausgabe("Player3 geben sie ihren Namen an");
                player3 = scanner.nextLine();
            }case 4 -> {
                Ausgabe("Player1 geben sie ihren Namen an");
                // Muss zweimal geschrieben werden player = scanner.nextLine(); weil der sonst den ersten scanner nicht erkennt
                // neu man muss eine den Scanner nur auch nextLine setzen
                scanner.nextLine();
                player1 = scanner.nextLine();
                Ausgabe("Player2 geben sie ihren Namen an");
                player2 = scanner.nextLine();
                Ausgabe("Player3 geben sie ihren Namen an");
                player3 = scanner.nextLine();
                Ausgabe("Player4 geben sie ihren Namen an");
                player4 = scanner.nextLine();
            }case 5 -> {
                Ausgabe("Player1 geben sie ihren Namen an");
                // Muss zweimal geschrieben werden player = scanner.nextLine(); weil der sonst den ersten scanner nicht erkennt
                // neu man muss eine den Scanner nur auch nextLine setzen
                scanner.nextLine();
                player1 = scanner.nextLine();
                Ausgabe("Player2 geben sie ihren Namen an");
                player2 = scanner.nextLine();
                Ausgabe("Player3 geben sie ihren Namen an");
                player3 = scanner.nextLine();
                Ausgabe("Player4 geben sie ihren Namen an");
                player4 = scanner.nextLine();
                Ausgabe("Player5 geben sie ihren Namen an");
                player5 = scanner.nextLine();
            }case 6 -> {
                Ausgabe("Player1 geben sie ihren Namen an");
                // Muss zweimal geschrieben werden player = scanner.nextLine(); weil der sonst den ersten scanner nicht erkennt
                // neu man muss eine den Scanner nur auch nextLine setzen
                scanner.nextLine();
                player1 = scanner.nextLine();
                Ausgabe("Player2 geben sie ihren Namen an");
                player2 = scanner.nextLine();
                Ausgabe("Player3 geben sie ihren Namen an");
                player3 = scanner.nextLine();
                Ausgabe("Player4 geben sie ihren Namen an");
                player4 = scanner.nextLine();
                Ausgabe("Player5 geben sie ihren Namen an");
                player5 = scanner.nextLine();
                Ausgabe("Player6 geben sie ihren Namen an");
                player6 = scanner.nextLine();
            }
        }

        Start = 1;

        do {
            switch (Mitspieler) {
                case 3->{
                    switch (Start) {
                        case 1 -> {
                            Ausgabe(player1 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer1 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer1 - PunktzahlWurf) < 0 || (PunktePlayer1 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer1 -= PunktzahlWurf;
                            } //else
                            PunktePlayer1 -= PunktzahlWurf;
                            Ausgabe(player1 + " hat: " + PunktePlayer1 + " Punkte");
                            if (PunktePlayer1 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer1);
                            }
                            Start = 2;
                        }
                        case 2 -> {
                            Ausgabe(player2 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer2 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer2 - PunktzahlWurf) < 0 || (PunktePlayer2 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer2 -= PunktzahlWurf;
                            Ausgabe(player2 + " hat: " + PunktePlayer2 + " Punkte");
                            if (PunktePlayer2 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer2);
                            }
                            Start = 3;
                        }case 3 -> {
                            Ausgabe(player3 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer3 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer3 - PunktzahlWurf) < 0 || (PunktePlayer3 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer3 -= PunktzahlWurf;
                            Ausgabe(player3 + " hat: " + PunktePlayer3 + " Punkte");
                            if (PunktePlayer3 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer3);
                            }
                            Start = 1;
                        }
                    }
                }
                case 4 -> {
                    switch (Start) {
                        case 1 -> {
                            Ausgabe(player1 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer1 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer1 - PunktzahlWurf) < 0 || (PunktePlayer1 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer1 -= PunktzahlWurf;
                            } //else
                            PunktePlayer1 -= PunktzahlWurf;
                            Ausgabe(player1 + " hat: " + PunktePlayer1 + " Punkte");
                            if (PunktePlayer1 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer1);
                            }
                            Start = 2;
                        }
                        case 2 -> {
                            Ausgabe(player2 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer2 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer2 - PunktzahlWurf) < 0 || (PunktePlayer2 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer2 -= PunktzahlWurf;
                            Ausgabe(player2 + " hat: " + PunktePlayer2 + " Punkte");
                            if (PunktePlayer2 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer2);
                            }
                            Start = 3;
                        }case 3 -> {
                            Ausgabe(player3 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer3 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer3 - PunktzahlWurf) < 0 || (PunktePlayer3 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer3 -= PunktzahlWurf;
                            Ausgabe(player3 + " hat: " + PunktePlayer3 + " Punkte");
                            if (PunktePlayer3 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer3);
                            }
                            Start = 4;
                        }case 4 -> {
                            Ausgabe(player4 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer4 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer4 - PunktzahlWurf) < 0 || (PunktePlayer4 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer4 -= PunktzahlWurf;
                            Ausgabe(player4 + " hat: " + PunktePlayer4 + " Punkte");
                            if (PunktePlayer4 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer4);
                            }
                            Start = 1;
                        }
                    }
                }case 5 -> {
                    switch (Start) {
                        case 1 -> {
                            Ausgabe(player1 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer1 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer1 - PunktzahlWurf) < 0 || (PunktePlayer1 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer1 -= PunktzahlWurf;
                            } //else
                            PunktePlayer1 -= PunktzahlWurf;
                            Ausgabe(player1 + " hat: " + PunktePlayer1 + " Punkte");
                            if (PunktePlayer1 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer1);
                            }
                            Start = 2;
                        }
                        case 2 -> {
                            Ausgabe(player2 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer2 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer2 - PunktzahlWurf) < 0 || (PunktePlayer2 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer2 -= PunktzahlWurf;
                            Ausgabe(player2 + " hat: " + PunktePlayer2 + " Punkte");
                            if (PunktePlayer2 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer2);
                            }
                            Start = 3;
                        }case 3 -> {
                            Ausgabe(player3 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer3 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer3 - PunktzahlWurf) < 0 || (PunktePlayer3 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer3 -= PunktzahlWurf;
                            Ausgabe(player3 + " hat: " + PunktePlayer3 + " Punkte");
                            if (PunktePlayer3 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer3);
                            }
                            Start = 4;
                        }case 4 -> {
                            Ausgabe(player4 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer4 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer4 - PunktzahlWurf) < 0 || (PunktePlayer4 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer4 -= PunktzahlWurf;
                            Ausgabe(player4 + " hat: " + PunktePlayer4 + " Punkte");
                            if (PunktePlayer4 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer4);
                            }
                            Start = 5;
                        }case 5 -> {
                            Ausgabe(player5 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer5 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer5 - PunktzahlWurf) < 0 || (PunktePlayer5 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer5 -= PunktzahlWurf;
                            Ausgabe(player5 + " hat: " + PunktePlayer5 + " Punkte");
                            if (PunktePlayer5 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer5);
                            }
                            Start = 1;
                        }
                    }
                }case 6 -> {
                    switch (Start) {
                        case 1 -> {
                            Ausgabe(player1 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer1 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer1 - PunktzahlWurf) < 0 || (PunktePlayer1 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer1 -= PunktzahlWurf;
                            } //else
                            PunktePlayer1 -= PunktzahlWurf;
                            Ausgabe(player1 + " hat: " + PunktePlayer1 + " Punkte");
                            if (PunktePlayer1 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer1);
                            }
                            Start = 2;
                        }
                        case 2 -> {
                            Ausgabe(player2 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer2 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer2 - PunktzahlWurf) < 0 || (PunktePlayer2 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer2 -= PunktzahlWurf;
                            Ausgabe(player2 + " hat: " + PunktePlayer2 + " Punkte");
                            if (PunktePlayer2 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer2);
                            }
                            Start = 3;
                        }case 3 -> {
                            Ausgabe(player3 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer3 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer3 - PunktzahlWurf) < 0 || (PunktePlayer3 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer3 -= PunktzahlWurf;
                            Ausgabe(player3 + " hat: " + PunktePlayer3 + " Punkte");
                            if (PunktePlayer3 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer3);
                            }
                            Start = 4;
                        }case 4 -> {
                            Ausgabe(player4 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer4 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer4 - PunktzahlWurf) < 0 || (PunktePlayer4 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer4 -= PunktzahlWurf;
                            Ausgabe(player4 + " hat: " + PunktePlayer4 + " Punkte");
                            if (PunktePlayer4 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer4);
                            }
                            Start = 5;
                        }case 5 -> {
                            Ausgabe(player5 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer5 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer5 - PunktzahlWurf) < 0 || (PunktePlayer5 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer5 -= PunktzahlWurf;
                            Ausgabe(player5 + " hat: " + PunktePlayer5 + " Punkte");
                            if (PunktePlayer5 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer5);
                            }
                            Start = 6;
                        }case 6 -> {
                            Ausgabe(player6 + " ist dran:\n" +
                                    "ihre Punktzahl ist " + PunktePlayer6 +
                                    "\nGeben sie ihre Punktzahl ein");
                            PunktzahlWurf = EingabeMitScanner();
                            while ((PunktePlayer6 - PunktzahlWurf) < 0 || (PunktePlayer6 - PunktzahlWurf) == 1 || PunktzahlWurf < 0 || PunktzahlWurf > 180) {
                                Ausgabe("Falsche Eingabe geben sie Erneut die Punkte an");
                                PunktzahlWurf = EingabeMitScanner();
                                //PunktePlayer2 -= PunktzahlWurf;
                            }// else
                            PunktePlayer6 -= PunktzahlWurf;
                            Ausgabe(player6 + " hat: " + PunktePlayer6 + " Punkte");
                            if (PunktePlayer6 <= 160) {
                                WurfVorschlaegeDoppelOut40(PunktePlayer6);
                            }
                            Start = 1;
                        }
                    }
                }
            }
        }while (PunktePlayer1 != 0 && PunktePlayer2 != 0 && PunktePlayer3 != 0 && PunktePlayer4 != 0 && PunktePlayer5 != 0 && PunktePlayer6 != 0);

        if (PunktePlayer1 == 0) {
            return Ausgabe("Player1 " + player1 + " hat gewonnen");
        } else if (PunktePlayer2 == 0) {
            return Ausgabe("Player2 " + player2 + " hat gewonnen");
        } else if (PunktePlayer3 == 0) {
            return Ausgabe("Player2 " + player3 + " hat gewonnen");
        } else if (PunktePlayer4 == 0) {
            return Ausgabe("Player2 " + player4 + " hat gewonnen");
        } else if (PunktePlayer5 == 0) {
            return Ausgabe("Player2 " + player5 + " hat gewonnen");
        } else if (PunktePlayer6 == 0) {
            return Ausgabe("Player2 " + player6 + " hat gewonnen");
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
