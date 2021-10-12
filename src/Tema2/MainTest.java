package Tema2;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void faraScoala() {
        Actor actor = new Actor("Tiriac", "Ion", new Date(1955,10,20), "Scoala de soferi");
        Actor actor1 = new Actor("Bobonete", "Mihai",new Date(1986,12,22));
        Actor actor2 = new Actor("Rait", "Mihai", new Date(1985,6,3), "STFB");
        Actor actor3 = new Actor("Ifrim","Gheorghe", new Date(1966,9,14), "Academia de Teatru");
        Actor actori[] = {actor,actor1,actor2,actor3};

        assertEquals(1,Main.faraScoala(actori));
    }

    @Test
    void interval() {
        Actor actor = new Actor("Tiriac", "Ion", new Date(1955,10,20), "Scoala de soferi");
        Actor actor1 = new Actor("Bobonete", "Mihai",new Date(1986,12,22));
        Actor actor2 = new Actor("Rait", "Mihai", new Date(1985,6,3), "STFB");
        Actor actor3 = new Actor("Ifrim","Gheorghe", new Date(1966,9,14), "Academia de Teatru");
        Actor actori[] = {actor,actor1,actor2,actor3};

        assertEquals(2, Main.interval(actori, new Date(1960,1,1), new Date(1986,1,1)));
    }
}