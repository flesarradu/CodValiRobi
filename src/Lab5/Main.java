package Lab5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pereche<Persoana>> list = new ArrayList<Pereche<Persoana>>();
        list.add(new Pereche<Persoana> (new Persoana("Dolinceanu","Ionica", 1995, Persoana.STUDII.MASTER),new Persoana("Colinceanu","Ionicule", 1996, Persoana.STUDII.DOCTORAT) ));
        list.add(new Pereche<Persoana> (new Persoana("Dodonescu","Dolica", 1992, Persoana.STUDII.FARA),new Persoana("Academicianu","Coco", 1966, Persoana.STUDII.POSTLICEALE) ));

        for(Pereche<Persoana> p : list){
            System.out.println(p);
        }

        Comparator <Pereche<Persoana>> compara = new Comparator<Pereche<Persoana>>() {
            @Override
            public int compare(Pereche<Persoana> o1, Pereche<Persoana> o2) {
                if(o1.x.getNume().equals(o2.x.getNume()))
                    return o1.y.getNume().compareTo(o2.y.getNume());
                return o1.x.getNume().compareTo(o2.x.getNume());
            }
        };
        Collections.sort(list,compara);

        Map<Persoana.STUDII, ArrayList<Persoana>> map = new HashMap<Persoana.STUDII,ArrayList<Persoana>>();

        for(Pereche<Persoana>p:list)
        {
            Persoana x = p.x;
            Persoana y = p.y;

            if(map.containsKey(x.getUltimeStudiiAbsolvite())) {

                map.get(x.getUltimeStudiiAbsolvite()).add(x);
            }

            else

            {

                ArrayList<Persoana> l = new ArrayList<>();
                l.add(x);
                map.put(x.getUltimeStudiiAbsolvite(),l);
            }





            if(map.containsKey(y.getUltimeStudiiAbsolvite())) {

                map.get(y.getUltimeStudiiAbsolvite()).add(y);
            }

            else

            {

                ArrayList<Persoana> l = new ArrayList<>();
                l.add(y);
                map.put(y.getUltimeStudiiAbsolvite(),l);
            }}




        System.out.println("~~~~~~~~");

        for(Map.Entry<Persoana.STUDII, ArrayList<Persoana>> e:map.entrySet())
            System.out.println(e.getKey() + "->"+e.getValue());

        System.out.println("~~~~~~~~");
        System.out.println("~~~~~~~~");
        System.out.println("~~~~~~~~");

        List<Persoana> listPers = new ArrayList<Persoana>();
        listPers.add(new Persoana("Dolinceanu","Ionica", 1995, Persoana.STUDII.MASTER));
        listPers.add(new Persoana("Dodonescu","Ionicaa", 1955, Persoana.STUDII.LICEALE));
        listPers.add(new Persoana("Gogu","Ionescu", 1912, Persoana.STUDII.LICEALE));

        List<Angajat> listAng = new ArrayList<Angajat>();
        listAng.add(new Angajat("Dolinceanu","Ionica", 1995, Persoana.STUDII.MASTER,2000));
        listAng.add(new Angajat("Dodonescu","Ionicaa", 1955, Persoana.STUDII.LICEALE,7000));
        listAng.add(new Angajat("Gogu","Ionescu", 1912, Persoana.STUDII.LICEALE));

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(new Student("Cocolino","Ion", 1995, Persoana.STUDII.MASTER));
        listStudent.add(new Student("Alin","Dolinescu", 1955, Persoana.STUDII.LICEALE));
        listStudent.add(new Student("Gogu","Ionescu", 1912, Persoana.STUDII.LICEALE));

        afisare(listPers);
    }

    static <T> void afisare(List<T> list){
        if(list.size() > 0) {
            if (list.get(0) instanceof Pereche) {
                return;
            }
            for (T x : list) {
                System.out.println(x.toString());
            }
        }
    }

}


