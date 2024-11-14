
public class LifeGame {
    final int habitatSatir = 19;
    final int habitatSutun = 19;
    int hucreHabitat[][];
    int hucreHabitatTmp[][];
    int[] pulsarSatir;
    int[] pSatir;
    int pulsarSutun[];

    public LifeGame() {
        // pulsar desni oluşması için gerekli ön tanımlamalar
        pSatir = new int[] { 3, 8, 10, 15 };
        pulsarSatir = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
        pulsarSutun = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
        // gerçek yaşam alanı ve değişikliklerin yapılacağı yedek yaşam alanı tanımı
        hucreHabitat = new int[habitatSatir][habitatSutun];
        hucreHabitatTmp = new int[habitatSatir][habitatSutun];
        // tüm yedek ve gerçek yaşam alanı sıfırlanıyor
        int c = 0;
        for (int i = 0; i < habitatSatir; i++) {
            for (int y = 0; y < habitatSutun; y++) {
                hucreHabitatTmp[i][y] = c;
                hucreHabitat[i][y] = c;
            }
        }
        // pulsar deseni gerçek yaşam alanına atanıyor
        for (int satir = 0; satir < pSatir.length; satir++) {
            for (int sutun = 0; sutun < habitatSutun; sutun++) {
                hucreHabitat[pSatir[satir]][sutun] = pulsarSatir[sutun];
            }
        }
        for (int sutun = 0; sutun < pSatir.length; sutun++) {
            for (int satir = 0; satir < habitatSutun; satir++) {
                hucreHabitat[satir][pSatir[sutun]] = pulsarSatir[satir];
            }
        }
    }


    // (kondisyon) : ? dan sonra true : false 

    public void drawHabitat() {
        for (int i = 0; i < habitatSatir; i++) {
            for (int j = 0; j < habitatSutun; j++) {
                System.out.print(hucreHabitat[i][j] == 1 ? "#" : " "); // daha guzel gostermek icin
            }
            System.out.println();
        }
    }

    public int komsuCanliSayisi(int satir, int sutun) {
        int canliKomsuSayisi = 0;

        for (int i = -1; i < 2; i++) { // koselere carpmasin diye
            for (int j = -1; j < 2; j++) {
                if (hucreHabitat[satir + i][sutun + j] == 1) {
                    canliKomsuSayisi++;
                }
            }
        }
        if (hucreHabitat[satir][sutun] == 1) { // kendisi canliysa komsu sayisindan dusmek icin
            canliKomsuSayisi--;
        }
        return canliKomsuSayisi;
    }

    public void newHabitatRule() {
        int cks;

        for (int i = 1; i < habitatSatir - 1; i++) {
            for (int j = 1; j < habitatSutun - 1; j++) {
                cks = komsuCanliSayisi(i, j);
                if (hucreHabitat[i][j] == 1) { // eger canli hucreyse
                    hucreHabitatTmp[i][j] = (cks == 2 || cks == 3) ? 1 : 0; // soldaki true sagdaki false icin return degeri
                } else {
                    hucreHabitatTmp[i][j] = (cks == 3) ? 1 : 0;
                }
            }
        }
        copyHabitat();
    }

    public void copyHabitat() {
        for (int i = 0; i < habitatSatir; i++) {
            for (int j = 0; j < habitatSutun; j++) {
                hucreHabitat[i][j] = hucreHabitatTmp[i][j];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        LifeGame lg = new LifeGame();
        for (int i = 0; i < 20; i++) {
            lg.drawHabitat();
            lg.newHabitatRule();
            System.out.println();
            Thread.sleep(1500);
        }
    }
}