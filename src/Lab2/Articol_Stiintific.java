package Lab2;

public class Articol_Stiintific implements Raport{

    String titlu;
    String autori;
    String sir_de_sectiuni;
    String bibliografie;

    public Articol_Stiintific(String titlu, String autori, String sir_de_sectiuni, String bibliografie){

        this.titlu = titlu;
        this.autori = autori;
        this.sir_de_sectiuni = sir_de_sectiuni;
        this.bibliografie = bibliografie;
    }
    @Override
    public String generareTitlu() {
        return "Titlu: " + titlu + "\nAutori: " + autori;
    }

    @Override
    public String generareContinut() {
        return "Continut: "+sir_de_sectiuni;
    }

    @Override
    public String generareIncheiere() {
        return "Incheiere: " + bibliografie;
    }
}
