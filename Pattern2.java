/* This is the Pattern:
A
AB
ABC */ 

public class Pattern2 {
    

    public static void main(String[] args) {
        for(int i = 65; i <= 67; ++i) {
            for(int j = 65; j <= i; ++j) {
                System.out.print((char)j);
            }

            System.out.println();
        }

    }
}

    

