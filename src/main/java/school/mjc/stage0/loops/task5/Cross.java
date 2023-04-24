package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        for (int y = 0; y < sideLength; y++) {
            for (int x = 0; x < sideLength; x++) {
                if (y == (int) Math.sqrt(sideLength)) {
                    System.out.print(8);
                }
                else {
                    if (x == (int) Math.sqrt(sideLength)) {
                        System.out.print(8);
                        continue;
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
