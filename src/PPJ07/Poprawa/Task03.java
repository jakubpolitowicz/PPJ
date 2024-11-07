package PPJ07.Poprawa;

public class Task03 {
    public static void main(String[] args) {

        char[][] tab ={
                {'S','a','m','s','u','n','g'},
                {'N','o','k','i','a'},
                {'A','p','p','l','e'},
                {'B','l','a','c','k','B','e','r','r','y'},
                {'A','l','c','a','t','e','l'},
                {'S','o','n','y'},
                {'J','o','l','l','a'}
        };

        //1
        boolean znajdz = false;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                char obecnyChar = tab[i][j];
                for (int k = i; k < tab.length; k++) {
                    for (int l = (k == i) ? j + 1 : 0; l < tab[k].length; l++) {
                        if (obecnyChar == tab[k][l]) {
                            znajdz = true;
                            break;
                        }
                    }
                    if (znajdz) {
                        break;
                    }
                }
                if (znajdz) {
                    break;
                }
            }
            if (znajdz) {
                break;
            }
        }

        if (znajdz) {
            System.out.println("Tablica zawiera co najmniej dwie takie same litery.");
        } else {
            System.out.println("Tablica nie zawiera co najmniej dwie takie same litery.");
        }

        //2
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                sum += tab[i][j];
            }
        }

        if (sum > 255) {
            System.out.println("Suma wszystkich znakow w tablicy jest wieksza niz 255.");
        } else {
            System.out.println("Suma wszystkich znakow w tablicy nie przekracza 255.");
        }

        //3
        boolean zawieraLitere = false;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (Character.isLetter(tab[i][j])) {
                    zawieraLitere = true;
                    break;
                }
            }
            if (zawieraLitere) {
                break;
            }
        }
        //4
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                char obecnyChar = tab[i][j];
                for (int k = i; k < tab.length; k++) {
                    for (int l = (k == i) ? j + 1 : 0; l < tab[k].length; l++) {
                        if (obecnyChar == tab[k][l]) {
                            znajdz = true;
                            break;
                        }
                    }
                    if (znajdz) {
                        break;
                    }
                }
                if (znajdz) {
                    break;
                }
            }
            if (znajdz) {
                break;
            }
        }

        if (znajdz) {
            System.out.println("Tablica zawiera przynajmniej dwa takie same znaki.");
        } else {
            System.out.println("Tablica nie zawiera dwóch takich samych znaków.");
        }


    }
}