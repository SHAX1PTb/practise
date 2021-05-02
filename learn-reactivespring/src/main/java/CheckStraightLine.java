import java.util.ArrayList;

public class CheckStraightLine {





    public static void main(String[] args) {
        CheckStraightLine checkStraightLine = new CheckStraightLine();
//        boolean result = checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 5}, {5, 6}, {7, 7}});
        boolean result = checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 3}});


        System.out.println(result);
    }

    private static boolean checkStraightLine(int[][] coordinates) {
        ArrayList list = new ArrayList();

        int[] point1 = coordinates[1];
        int[] point2 = coordinates[0];

        float gslope = slope(point1, point2);

        list.add(0,gslope);
        System.out.println("gslope:"+gslope);
        for (int i = 1; i < coordinates.length; i++) {
            int[] p1 = coordinates[i];
            int[] p2 = coordinates[i-1];
            float slop = slope(p1, p2);
            list.add(i,slop);
            System.out.println("list"+list.toString());
            if (gslope != slop) return false;

        }

        System.out.println(gslope);


        return true;
    }

    private static float slope(int[] point1, int[] point2) {

        if ((point1[0] - point2[0]) == 0) {
            return 0;
        }

        return (float) (point2[1] - point1[1]) / (point2[0] - point1[1]);
    }

}
