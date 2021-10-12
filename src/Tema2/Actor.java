package Tema2;

import java.util.Date;


/**
 * Clasa Actor
 * Salveaza datele unui actor
 */
public class Actor {
    private String nume;
    private String prenume;
    Date anulNasterii;
    String numeScoala;

    /**
     * Constructor implicit
     */
    public Actor(){
        setNume("");
        setPrenume("");
        anulNasterii = null;
        numeScoala = "FARA SCOALA";
    }

    /**
     * Constructor cu scoala de actorie absolvita
     * @param nume - Numele actorului
     * @param prenume - Prenumele actorului
     * @param anulNasterii
     * @param numeScoala - Scoala de actorie absolvita
     */
    public Actor(String nume,
                 String prenume,
                 Date anulNasterii,
                 String numeScoala) {
        this.setNume(nume);
        this.anulNasterii = anulNasterii;
        this.setPrenume(prenume);
        this.numeScoala = numeScoala;
    }

    /**
     * Constructor fara scoala de actorie
     * @param nume
     * @param prenume
     * @param anulNasterii
     */
    public Actor(String nume,
                 String prenume,
                 Date anulNasterii){
        this(nume,prenume,anulNasterii,"FARA SCOALA");
    }

    /**
     * suprascriere metoda toString()
     * @return Datele actorului
     */
    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + getNume() + '\'' +
                ", prenume='" + getPrenume() + '\'' +
                ", anulNasterii=" + anulNasterii +
                ", numeScoala='" + numeScoala + '\'' +
                '}';
    }

    /**
     * getNume
     * @return numele actorului
     */
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
}
