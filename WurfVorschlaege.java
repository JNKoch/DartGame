package EigenesProjektNr1;

public class WurfVorschlaege {
    public static void main(String[] args) {
        new WurfVorschlaege(110);
        WurfVorschlaegeDoppelOut40(9);
        wurfvorschlaegeSingleOut(9);
    }

    /**
     * Doppel out spiel mit 50 Finish
     * @param Punktzahl die punktzahl der Spieler
     */
    public WurfVorschlaege(int Punktzahl) {

        int[] Finish = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 50};
        int[] moeglicheWuerfe={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,24,25,26,27,28,30,32,33,34,36,38,39,40,42,45,48,50,51,54,57,60,60};
        //int[] DoubleOut = {0,3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100};

        int ErgebnisPunktzahl = 0;
        // Einfach nur ausgerechnet
        for (int i = 0; i < moeglicheWuerfe.length; i++) {
            if (ErgebnisPunktzahl == Punktzahl) {
                break;
            }
            for (int o = 0; o < moeglicheWuerfe.length; o++) {
                if (ErgebnisPunktzahl == Punktzahl) {
                    break;
                }
                for (int p = 0; p < Finish.length; p++) {
                    ErgebnisPunktzahl = moeglicheWuerfe[i] + moeglicheWuerfe[o] + Finish[p];
                    if (ErgebnisPunktzahl == Punktzahl) {
                        Ausgabe(moeglicheWuerfe[i] + " " + moeglicheWuerfe[o] + " " + Finish[p]);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Doppel Out mit 40 als finish ist einfacher als 50
     * @param Punktzahl Die Punktzahl der Spieler
     */
    public static void WurfVorschlaegeDoppelOut40(int Punktzahl) {

        int[] Finish = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 50};
        int[] moeglicheWuerfe={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,24,25,26,27,28,30,32,33,34,36,38,39,40,42,45,48,50,51,54,57,60};
        //int[] DoubleOut = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100};

        int ErgebnisPunktzahl = 0;
        // Einfach nur ausgerechnet
        for (int i = 0; i <moeglicheWuerfe.length; i++) {
            if (ErgebnisPunktzahl == Punktzahl) {
                break;
            }
            for (int o = 0; o <moeglicheWuerfe.length; o++) {
                if (ErgebnisPunktzahl == Punktzahl) {
                    break;
                }
                for (int p = 0; p < Finish.length-1; p++) {
                    ErgebnisPunktzahl = moeglicheWuerfe[i] + moeglicheWuerfe[o] + Finish[p];
                    if (ErgebnisPunktzahl == Punktzahl) {
                        Ausgabe(moeglicheWuerfe[i] + " " + moeglicheWuerfe[o] + " " + Finish[p]);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Single Out Finish Vorschläge
     * @param Punktzahl der Spieler
     */
    public static void wurfvorschlaegeSingleOut(int Punktzahl) {
        int[] moeglicheWuerfe={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,24,25,26,27,28,30,32,33,34,36,38,39,40,42,45,48,50,51,54,57,60};
        int ErgebnisPunktzahl = 0;
        // Einfach nur ausgerechnet
        for (int i = 0; i <moeglicheWuerfe.length; i++) {
            if (ErgebnisPunktzahl == Punktzahl) {
                break;
            }
            for (int o = 0; o <moeglicheWuerfe.length; o++) {
                if (ErgebnisPunktzahl == Punktzahl) {
                    break;
                }
                for (int p = 0; p < moeglicheWuerfe.length; p++) {
                    ErgebnisPunktzahl = moeglicheWuerfe[i] + moeglicheWuerfe[o] + moeglicheWuerfe[p];
                    if (ErgebnisPunktzahl == Punktzahl) {
                        Ausgabe(moeglicheWuerfe[i] + " " + moeglicheWuerfe[o] + " " + moeglicheWuerfe[p]);
                        break;
                    }
                }
            }
        }
    }
    public static void Ausgabe(String ausgabe) {
        String str = ("-------------------------------"+"\n"+
                ausgabe +"\n"+
                "-------------------------------"+"\n");
        System.out.println(str);
    }

}