package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int y = 0; y < sideLength; y++) {
            for (int x = 0; x < sideLength; x++) {
                if (y == 0 || y == sideLength - 1) {
                    System.out.print(8);
                    continue;
                }

                if (x == 0 || x == sideLength - 1) {
                    System.out.print(8);
                    continue;
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
