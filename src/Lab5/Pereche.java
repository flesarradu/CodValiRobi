package Lab5;

public class Pereche <T>{
    T x;
    T y;
    public Pereche(){
        super();
    }
    public Pereche(T x, T y){
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pereche{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static <T> void swap(Pereche<T> p){
        T temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
}
