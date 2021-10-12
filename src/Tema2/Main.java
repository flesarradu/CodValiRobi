package Tema2;

import org.jetbrains.annotations.NotNull;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor("Tiriac", "Ion", new Date(1955,10,20), "Scoala de soferi");
        Actor actor1 = new Actor("Bobonete", "Mihai",new Date(1986,12,22));
        Actor actor2 = new Actor("Rait", "Mihai", new Date(1985,6,3), "STFB");
        Actor actor3 = new Actor("Ifrim","Gheorghe", new Date(1966,9,14), "Academia de Teatru");
        Actor actori[] = {actor,actor1,actor2,actor3};
        System.out.println(faraScoala(actori));
        System.out.println(interval(actori, new Date(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])), new Date(Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]))));
    }
    public static int faraScoala(@NotNull Actor actori[]){
        int nr=0;
        for(Actor x : actori){
            if(x.numeScoala == "FARA SCOALA"){
                nr++;
            }
        }
        return nr;
    }
    public static int interval(Actor actori[], Date st, Date dr){
        int nr =0;
        for(Actor x : actori){
            if(x.anulNasterii.compareTo(dr) < 0 && x.anulNasterii.compareTo(st) > 0){
                nr++;
            }
        }
        return nr;
    }
}
