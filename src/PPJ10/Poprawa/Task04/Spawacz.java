package PPJ10.Poprawa.Task04;

public class Spawacz extends Osoba{
    private int stazPracy;

    public Spawacz(String imie, int stazPracy) {
        super(imie);
        this.stazPracy = stazPracy;
    }

    public int getStazPracy() {
        return stazPracy;
    }

    @Override
    public String wyswietl() {
        return super.wyswietl() + ", Staż pracy: " + stazPracy + " lat";
    }
}