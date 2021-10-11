package com.company;


public class Main {
    /*
    Definiți clasa Mobilă care are următoarele caracteristici: nume, descriere, materialul din care
    este produsă, dimensiuni (lungime, lățime, înălțime) și preț. Definiți clasa Magazin de mobilă
    care are un nume, o adresă și conține un tablou de Mobile.
    a. Creați un tablou de magazine de mobile
    b. Definiți o metodă care întoarce numele magazinului care conține cele mai ieftine
    mobile
    c. Definiți o metodă care numără cate mobile conțin o listă de cuvinte în descriere
    d. Documentați codul și generați
     */


    public static class Mobila{
        String nume;
        String descriere;
        String material;
        Dimensiuni dimensiuni;
        int pret;
    }

    public static class MagazinDeMobila{
        String nume;
        String adresa;
        Mobila mobile[];
    }

    public static class Dimensiuni{
        int lungime;
        int latime;
        int inaltime;
    }

    /**
     *
     * @param magazine - lista de magazine de mobila
     * @return Magazinul cu cele mai ieftine produse
     */
    public static MagazinDeMobila magazinIeftin(MagazinDeMobila magazine[]){
        double m=Integer.MAX_VALUE;
        MagazinDeMobila magazinIeftin=null;
        for(MagazinDeMobila x : magazine){
            int s =0, c=0;
            for(Mobila y : x.mobile){
                s+=y.pret;
                c++;
            }
            double medie = s/(c*1.0);
            if(medie<m){
                m=medie;
                magazinIeftin = x;
            }
        }
        return magazinIeftin;
    }

    /**
     *
     * @param lista - lista de cuvinte de cautat in descriere
     * @param magazine - lista de magazine de mobila
     * @return ct - Cate mobile contin lista data in descriere
     */
    public static int cateContinLista(String lista, MagazinDeMobila magazine[]){
        int ct = 0;
        for(MagazinDeMobila x : magazine){
            for(Mobila y : x.mobile) {
                if(y.descriere.contains(lista)) ct++;
            }
        }
        return ct;
    }
    public static void main(String[] args) {

        Dimensiuni dim = new Dimensiuni();
        dim.lungime=20; dim.latime=20; dim.inaltime=70;
        Mobila scaun = new Mobila();
        scaun.dimensiuni = dim; scaun.nume = "Scaun"; scaun.descriere = "Foartee fain"; scaun.material = "lemn de mahon"; scaun.pret=100000;
        Mobila pat = new Mobila();
        pat.dimensiuni = dim; pat.nume = "Pat"; pat.descriere = "Foartee foarte fain"; pat.material = "lemn de maroc"; pat.pret=1000;
        Mobila birou = new Mobila();
        birou.dimensiuni = dim; birou.nume = "Birou"; birou.descriere = "Greu"; birou.material = "Otel?"; birou.pret=2999;
        Mobila dulap = new Mobila();
        dulap.dimensiuni = dim; dulap.nume = "Dulap"; dulap.descriere = "Cu zduble"; dulap.material = "lemn de pruna"; dulap.pret=200;
        Mobila cuier = new Mobila();
        cuier.dimensiuni = dim; cuier.nume = "Cuier"; cuier.descriere = "Cu pantofar"; cuier.material = "lemn de lemn"; cuier.pret=4999;


        MagazinDeMobila abc = new MagazinDeMobila();
        abc.nume = "ABC"; abc.adresa = "Strada Plopilor nr 25"; abc.mobile = new Mobila[]{scaun, pat,birou,dulap};
        MagazinDeMobila robert = new MagazinDeMobila();
        robert.nume = "Robert"; robert.adresa = "Strada Plopilor nr 25"; robert.mobile = new Mobila[]{birou,dulap,cuier};
        MagazinDeMobila ikea = new MagazinDeMobila();
        ikea.nume = "Ikea"; ikea.adresa = "Strada Plopilor nr 25"; ikea.mobile = new Mobila[]{scaun, pat, birou,dulap,cuier};
        MagazinDeMobila magazine[] = new MagazinDeMobila[] {abc,robert,ikea};

        System.out.println((magazinIeftin(magazine)).nume);
        System.out.println(cateContinLista("fain", magazine));
    }
}
