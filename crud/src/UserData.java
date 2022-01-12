public class UserData {
    private String email;
    private String dataurodzenia;
    private String imie;
    private String nazwisko;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataurodzenia() {
        return dataurodzenia;
    }

    public void setDataurodzenia(String dataurodzenia) {
        this.dataurodzenia = dataurodzenia;
    }

    public UserData(String email, String dataurodzenia, String imie, String nazwisko) {
        this.email = email;
        this.dataurodzenia = dataurodzenia;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Email='" + email + '\'' + " Data Urodzenia='" + dataurodzenia + '\'' + " Imie ='" + imie + '\'' + " Nazwisko='" + nazwisko + '\'';
    }
}
