public class Ahne {
    private String vorname;
    private String nachname;
    private char geschlecht;

    public void Ahne(String pVN, String pNN, char pG){
       nachname = pNN;
       vorname = pVN;
       geschlecht = pG;

    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
