package Tema1;

/*
Un şir de biți este k-special dacă începe cu 1, conține bitul 1 de exact k ori, şi între
oricare doi de 1 consecutivi apare cel mult un 0. De exemplu, șirul 101100 este 3-
special, dar şirul 110010 nu este. Fie A un tablou cu elemente 0 şi 1 care reprezintă un
şir de n biți, n ≤ 100000. Definiți un subprogram care primește ca parametru de intrare
tabloul A, dimensiunea acestuia n şi returnează true dacă tabloul A reprezintă un şir k-
special, şi false în caz contrar. Scrieți teste automate pentru a testa subprogramele

definite.
 */

public class Main {
    public static void main(String args[]) {
        System.out.println(kSpecial(new int[]{1,0,1,1,0,0},6));
    }
    public static boolean kSpecial(int biti[], int n){

        int k = calculeazaK(biti,n);
        boolean kSp = verificaK(biti,n,k);
        return kSp;
    }

    private static boolean verificaK(int[] biti, int n, int k) {
        int last = 2;
        for(int i : biti){
            if(i==0 && last == 0 && k>0)
                return false;
            if(i==1) k--;
            last = i;
        }
        return true;
    }

    private static int calculeazaK(int[] biti, int n) {
        int k =0;
        for(int i : biti) if (i == 1) k++;
        return k;
    }
}
