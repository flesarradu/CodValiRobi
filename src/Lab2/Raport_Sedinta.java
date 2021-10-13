package Lab2;

public class Raport_Sedinta implements Raport {

    String MotivulSedintei;
    String DataSedintei;
    String subiecteDiscutate;
    String sirPersoaneResponsabile;

    public Raport_Sedinta(String MotivulSedintei,String DataSedintei, String subiecteDiscutate, String sirPersoaneResponsabile){
        this.MotivulSedintei = MotivulSedintei;
        this.DataSedintei = DataSedintei;
        this.subiecteDiscutate = subiecteDiscutate;
        this.sirPersoaneResponsabile = sirPersoaneResponsabile;
    }

    @Override
    public String generareTitlu() {
        return "Titlu: "+ MotivulSedintei + "\n Data: " + DataSedintei;
    }

    @Override
    public String generareContinut() {
        return "Continut: "+subiecteDiscutate;
    }

    @Override
    public String generareIncheiere() {
        return "Incheiere: " + sirPersoaneResponsabile;
    }
}
