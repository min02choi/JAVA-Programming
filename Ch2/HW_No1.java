package GeakPu.Ch2;

public class HW_No1 {
    public static void main(String[] args) {
        char stars[][];
        char sign[] = new char[3];

        sign[0] = 'C';
        sign[1] = 'M';
        sign[2] = 'Y';

        stars = new char[4][];
        
        int i = 0, j = 3;

        for (i = 0; i < stars.length ; i++, j--) {
            stars[i] = new char[i + 4];

            for (int k = 0; k < j; k++) {
                stars[i][j] = ' ';
                System.out.print(stars[i][j]);
            }

            for (int k = 0; k < stars[i].length - j; k++) {
                stars[i][j] = '*';
                System.out.print(stars[i][j]);
            }
            
            System.out.println();
        }

        System.out.print((char)sign[0]);
        System.out.print((char)sign[1]);
        System.out.println((char)sign[2]);
    }
}
