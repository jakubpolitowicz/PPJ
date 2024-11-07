package PPJ10;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        char[] tab = {'z','x','y'};

        char minChar = tab[0];
        int minWartosc = 0;

        int i = 0;
        while (i < tab.length) {
            if (tab[i] < minChar)
                minChar = tab[i];
                minWartosc = i;
            i++;
        }

        System.out.println(Arrays.toString(tab));
        System.out.println(minWartosc);
    }
}
