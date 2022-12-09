public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(i * 2 + 2);
        }
    }
}

/*
 * i = 0
 * is i less than 5? YES
 * print 0 * 2 + 2 = print 0 + 2 = print 2
 * i + 1 = 0 + 1 = 1
 * 
 * i = 1
 * is i less than 5? YES
 * 
 * print 1 * 2 + 2 = print 2 + 2 = print 4
 * 
 * i + 1 = 2
 * .
 * .
 * .
 * i + 1 = 4
 * is i less than 5? YES
 * print 4 * 2 + 2 = print 8 + 2 = 10
 * i + 1 = 5
 * 
 * is i less than 5? NO
 */