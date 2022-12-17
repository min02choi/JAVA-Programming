

package GeakPu.Ch2;

public class MultiDarray {
    public static void main(String[] args) {
        char stars[][];
        char sign[] = new char[3];

        sign[0] = 'C';
        sign[1] = 'M';
        sign[2] = 'Y';

        stars = new char[6][];
        
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new char[i + 1];
            for (int j = 0; j < stars[i].length; j++) {
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
