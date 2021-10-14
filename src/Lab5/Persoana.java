package Lab5;

public class Persoana {
    public enum STUDII {
        FARA, LICEALE, POSTLICEALE, LICENTA, MASTER, DOCTORAT
    }
    private String nume, prenume;
    private int anNastere;
    private STUDII ultimeStudiiAbsolvite;
    @Override
    public String toString() {
        return "Persoana [nume=" + nume + ", prenume=" + prenume + ", anNastere=" + anNastere
                + ", ultimeStudiiAbsolvite=" + ultimeStudiiAbsolvite + "]";

    }
    public Persoana(String nume, String prenume, int anNastere, STUDII ultimeStudiiAbsolvite) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.anNastere = anNastere;
        this.ultimeStudiiAbsolvite = ultimeStudiiAbsolvite;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public int getAnNastere() {
        return anNastere;
    }
    public void setAnNastere(int anNastere) {
        this.anNastere = anNastere;
    }
    public STUDII getUltimeStudiiAbsolvite() {
        return ultimeStudiiAbsolvite;
    }
    public void setUltimeStudiiAbsolvite(STUDII ultimeStudiiAbsolvite) {
        this.ultimeStudiiAbsolvite = ultimeStudiiAbsolvite;
    }
}
