/**
 * Created by james on 11/05/2017.
 */
public class SwitchStatement {
    public static void main(String[] args) {
        char testChar = 'X';
        switch (testChar) {
            case 'a':case 'b':case 'c':case 'd':case 'e':
                System.out.println(testChar + " was input!");
                break;
            default:
                System.out.println("The character was not a, b, c, d, or e! " + testChar + " was found instead!");
                break;
        }


    }
}
