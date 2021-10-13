package Lab2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       /*
        Cerc cerc1 = new Cerc(20,true);
        Cerc cerc2 = new Cerc(15,false);
        Dreptunghi d1 = new Dreptunghi(2,5,true);
        Dreptunghi d2 = new Dreptunghi(3,4,false);
        Figura figuri[] = {cerc1,cerc2, d1, d2};
        for(Figura x : figuri){
            System.out.println(x);
        }
        */
        Raport tablou[] = new Raport[5];
        tablou[0] = new Articol_Stiintific("Informatica Aplicata", "Ivascu si prietenii", "RBT, SDA,CPP", "Geeks for geeks");
        tablou[1] = new Articol_Stiintific("Informatica Neaplicata", "Neagu si dusmanii", "RBT, SDA,CPP", "Wikipedia");
        tablou[2] = new Articol_Stiintific("Informatica", "dusmanii", "RBT, safa", "Wikilix");
        tablou[3] = new Raport_Sedinta("Discutii", "14.10.2021", "Blablabla", "Ivascu, Neagu, Bonchis");
        tablou[3] = new Raport_Sedinta("Discutii2", "14.10.2021", "Blabla2sbla", "Ivascu2, Nea2gu, Bonchi2s");
        tablou[4] = new Raport_Sedinta("Organizare", "13.5.2022", "Organizare si management", "x si y");

        for(Raport x : tablou){
            System.out.println(x.generareTitlu());
            System.out.println(x.generareContinut());
            System.out.println(x.generareIncheiere());
        }
        int nrArticole =0;
        for(Raport x : tablou){
            if(x instanceof Articol_Stiintific){
                nrArticole++;
            }
        }
        System.out.println("Numar articole stiintifice: " + nrArticole);

        Map<String, Integer> map = new HashMap<String, Integer>();
        for(Raport x : tablou){
            if(x instanceof Raport_Sedinta) {
                map.put(((Raport_Sedinta) x).DataSedintei, (map.containsKey(((Raport_Sedinta) x).DataSedintei) ? map.get(((Raport_Sedinta) x).DataSedintei) : 0) + 1);
            }
        }
        Map.Entry<String,Integer> maxEntry = null;
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println("Data cu cele mai multe sedinte:" + maxEntry.getKey());

    }
}
