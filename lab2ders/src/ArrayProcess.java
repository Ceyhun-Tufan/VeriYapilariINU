public class ArrayProcess {

    public static void main(String[] args) {
        System.out.println("-----------");
        int[] dizi = { 1, 2, 4, 8 };
        dizi = elemanEkle(dizi, 5);
        diziYazdir(dizi);

        System.out.println("-----------");

        dizi = elemanSil(dizi);
        diziYazdir(dizi);

        System.out.println("-----------");

        dizi = elemanEkle(dizi, 1);
        diziYazdir(dizi);
        System.out.println("eleman say: "
                + diziElemanSay(dizi, 1));

        System.out.println("-----------");

        diziYazdir(diziArananElemanIndeks(dizi, 1));

        System.out.println("-----------");

        String[] deneme = { "merhaba","veriyapilari","dersi" };
        secmeliSiralamaString(deneme);
        for (String string : deneme) {
            System.out.println(string);
        }
        System.out.println("-----------");

        recDiziGezinme(dizi, 0);
        System.out.println("Istenilen sayi su indexte: " + recDiziAra(dizi, 1, 0));

        System.out.println("-----------");

        System.out.println(gcd(128, 48));

        System.out.println("-----------");

        char[] s = new char[]{'m','a','l','e','s'};

        Reverse(s);
    }

    // birinci soru
    public static void diziYazdir(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }

    public static int[] elemanEkle(int[] dizi, int yeni) {
        int[] arr = new int[dizi.length + 1];
        for (int i = 0; i < dizi.length; i++) {
            arr[i] = dizi[i];
        }
        arr[arr.length - 1] = yeni;
        return arr;
    }

    public static int[] elemanSil(int[] dizi) {
        int[] arr = new int[dizi.length - 1];
        for (int i = 1; i < dizi.length; i++) {
            arr[i - 1] = dizi[i];
        }
        return arr;
    }

    public static int diziElemanSay(int dizi[], int aranan) {
        int x = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                x++;
            }
        }
        return x;
    }

    public static int[] diziArananElemanIndeks(int[] dizi, int aranan) {
        int x = 0;
        int[] indexarr = new int[dizi.length];
        // [1,3,5,6]
        // [2,0,0,0]
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                indexarr[x] = i;
                x++;
            }
        }
        return indexarr;
    }

    // ikinci soru
    public static void secmeliSiralamaString(String[] dizi) {
        // TEKRAR ET
        int n = dizi.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (dizi[min].length() > dizi[j].length()) {
                    min = j;
                }
            }

            if (min != i) {
                String foo = dizi[min];
                dizi[min] = dizi[i];
                dizi[i] = foo;
            }
        }
    }

    // ucuncu soru

    public static void recDiziGezinme(int[] dizi, int index) {

        if (index >= dizi.length) {
            return;
        }
        System.out.println(dizi[index]);
        recDiziGezinme(dizi, index + 1);
    }

    public static int recDiziAra(int[] dizi, int aranan, int index) {

        if (!(index >= dizi.length)) {
            if (dizi[index] == aranan) {
                return index;
            } else {
                return recDiziAra(dizi, aranan, index + 1);
            }

        }

        return -1; // int return eden fonksiyon oldugu icin index bulunamazsa diye mecbur

    }

    // dorduncu soru 

    public static int gcd(int x, int y){ // 

        if(y==0){
            return x;
        }else{
            return gcd(y, x%y);
        }
    }

    // besinci soru

    public static void Reverse(char[] s){
        // yeni liste olustur 
        // s nin son elemani alma (recursive cagirma icin) 
        // s nin son elemani yazdir
        
        if(s.length-1<0){return;
        }else{
            char[] foo = new char[s.length-1];

            for (int i = 0; i < foo.length; i++) {
                foo[i] = s[i];
            }

            
            System.out.println(s[s.length-1]);
            Reverse(foo);

        }

    
    }


}
