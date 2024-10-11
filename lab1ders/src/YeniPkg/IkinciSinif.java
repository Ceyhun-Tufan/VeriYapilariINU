package YeniPkg;


public class IkinciSinif {

    private String uretici;
    private int urunno;
    private int kameramp;

    IkinciSinif() {
        uretici = "Samsung";
        urunno = 1;
        kameramp = 24;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String seturetici) {
        uretici = seturetici;
    }

    public int getUrunno() {
        return urunno;
    }

    public void setUrunno(int urunnoset) {
        urunno = urunnoset;
    }

    public int getKameramp() {
        return kameramp;
    }

    public void setKameramp(int kamerampset) {
        kameramp = kamerampset;
    }

}
