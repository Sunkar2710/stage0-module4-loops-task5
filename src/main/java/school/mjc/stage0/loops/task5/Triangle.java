package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int y = 0; y < cathetusLength; y++) {
            for (int x = 0; x < cathetusLength; x++) {
                if (x <= y) {
                    System.out.print(8);
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
