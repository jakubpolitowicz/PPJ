package PPJ07.Poprawa;

public class Task05 {
    public static void main(String[] args) {

        // tworzona jest tablica dwuwymiarowa o wielkosci 26x26
        char[][] chars = new char['z' - 'a']['z' - 'a'];

        //petla wypelniajaca wiersze i kolumny literami
        for (int i = 0; i < chars.length; i++) {
            char c = 'a';
            for (int j = 0; j < chars.length; j++, c+=1) {
                chars[i][j] = c;
            }
        }

        //iteruje oraz drukuje litery
        //step oblicza przesuniecie bitowe o jeden w lewo,
        //a nastepnie modulo dlugosci wiersza zapewnia aby wartosc step
        //miescila sie w zakresie od 0 do chars[i].length - 1
        for( int i = 0, step = 1;
             i < chars.length;
             step = (step<<1)%chars[i].length, i++
        )
            System.out.println(chars[i][step]);

/*
    b
    c
    e
    i
    q
    h
    o
    d
    g
    m
    y
    x
    v
    r
    j
    s
    l
    w
    t
    n
    b
    c
    e
    i
    q
*/
    }
}