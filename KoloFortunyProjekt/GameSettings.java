public class GameSettings {

    public int liczbagraczy;
    public int iloscrund;

    public GameSettings(int liczbagraczy, int iloscrund) {
        this.liczbagraczy = liczbagraczy;
        this.iloscrund = iloscrund;
    }

    public int getLiczbagraczy() {
        return liczbagraczy;
    }

    public void setLiczbagraczy(int val) {
        this.liczbagraczy = val;
    }

    public int getIloscrund() {
        return iloscrund;
    }

    public void setIloscrund(int val) {
        this.iloscrund = val;
    }
}
