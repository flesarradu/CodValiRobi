package Lab2;

public class Main {
    public static void main(String[] args) {
        Cerc cerc1 = new Cerc(20,true);
        Cerc cerc2 = new Cerc(15,false);
        Dreptunghi d1 = new Dreptunghi(2,5,true);
        Dreptunghi d2 = new Dreptunghi(3,4,false);
        Figura figuri[] = {cerc1,cerc2, d1, d2};
        for(Figura x : figuri){
            System.out.println(x);
        }
    }
}
