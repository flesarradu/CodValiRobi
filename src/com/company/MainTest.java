package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void magazinIeftin() {
        Main.Dimensiuni dim = new Main.Dimensiuni();
        dim.lungime=20; dim.latime=20; dim.inaltime=70;
        Main.Mobila scaun = new Main.Mobila();
        scaun.dimensiuni = dim; scaun.nume = "Scaun"; scaun.descriere = "Foartee fain"; scaun.material = "lemn de mahon"; scaun.pret=100000;
        Main.Mobila pat = new Main.Mobila();
        pat.dimensiuni = dim; pat.nume = "Pat"; pat.descriere = "Foartee foarte fain"; pat.material = "lemn de maroc"; pat.pret=1000;
        Main.Mobila birou = new Main.Mobila();
        birou.dimensiuni = dim; birou.nume = "Birou"; birou.descriere = "Greu"; birou.material = "Otel?"; birou.pret=2999;
        Main.Mobila dulap = new Main.Mobila();
        dulap.dimensiuni = dim; dulap.nume = "Dulap"; dulap.descriere = "Cu zduble"; dulap.material = "lemn de pruna"; dulap.pret=200;
        Main.Mobila cuier = new Main.Mobila();
        cuier.dimensiuni = dim; cuier.nume = "Cuier"; cuier.descriere = "Cu pantofar"; cuier.material = "lemn de lemn"; cuier.pret=4999;


        Main.MagazinDeMobila abc = new Main.MagazinDeMobila();
        abc.nume = "ABC"; abc.adresa = "Strada Plopilor nr 25"; abc.mobile = new Main.Mobila[]{scaun, pat,birou,dulap};
        Main.MagazinDeMobila robert = new Main.MagazinDeMobila();
        robert.nume = "Robert"; robert.adresa = "Strada Plopilor nr 25"; robert.mobile = new Main.Mobila[]{birou,dulap,cuier};
        Main.MagazinDeMobila ikea = new Main.MagazinDeMobila();
        ikea.nume = "Ikea"; ikea.adresa = "Strada Plopilor nr 25"; ikea.mobile = new Main.Mobila[]{scaun, pat, birou,dulap,cuier};
        Main.MagazinDeMobila magazine[] = new Main.MagazinDeMobila[] {abc,robert,ikea};


        assertEquals("Robert", Main.magazinIeftin(magazine).nume);
    }

    @Test
    void cateContinLista() {
        Main.Dimensiuni dim = new Main.Dimensiuni();
        dim.lungime=20; dim.latime=20; dim.inaltime=70;
        Main.Mobila scaun = new Main.Mobila();
        scaun.dimensiuni = dim; scaun.nume = "Scaun"; scaun.descriere = "Foartee fain"; scaun.material = "lemn de mahon"; scaun.pret=100000;
        Main.Mobila pat = new Main.Mobila();
        pat.dimensiuni = dim; pat.nume = "Pat"; pat.descriere = "Foartee foarte fain"; pat.material = "lemn de maroc"; pat.pret=1000;
        Main.Mobila birou = new Main.Mobila();
        birou.dimensiuni = dim; birou.nume = "Birou"; birou.descriere = "Greu"; birou.material = "Otel?"; birou.pret=2999;
        Main.Mobila dulap = new Main.Mobila();
        dulap.dimensiuni = dim; dulap.nume = "Dulap"; dulap.descriere = "Cu zduble"; dulap.material = "lemn de pruna"; dulap.pret=200;
        Main.Mobila cuier = new Main.Mobila();
        cuier.dimensiuni = dim; cuier.nume = "Cuier"; cuier.descriere = "Cu pantofar"; cuier.material = "lemn de lemn"; cuier.pret=4999;


        Main.MagazinDeMobila abc = new Main.MagazinDeMobila();
        abc.nume = "ABC"; abc.adresa = "Strada Plopilor nr 25"; abc.mobile = new Main.Mobila[]{scaun, pat,birou,dulap};
        Main.MagazinDeMobila robert = new Main.MagazinDeMobila();
        robert.nume = "Robert"; robert.adresa = "Strada Plopilor nr 25"; robert.mobile = new Main.Mobila[]{birou,dulap,cuier};
        Main.MagazinDeMobila ikea = new Main.MagazinDeMobila();
        ikea.nume = "Ikea"; ikea.adresa = "Strada Plopilor nr 25"; ikea.mobile = new Main.Mobila[]{scaun, pat, birou,dulap,cuier};
        Main.MagazinDeMobila magazine[] = new Main.MagazinDeMobila[] {abc,robert,ikea};

        assertEquals(4,Main.cateContinLista("fain", magazine));
    }
}