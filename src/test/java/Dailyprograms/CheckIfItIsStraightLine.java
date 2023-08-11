package Dailyprograms;

import org.junit.Test;

public class CheckIfItIsStraightLine {
    /*You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
    Check if these points make a straight line in the XY plane.
*/
//    Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]] Two dimensional array
//    Output: false (boolean)
@Test
public void test1(){
    boolean b = checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}});
    System.out.println(b);
}

    @Test
    public void test2(){
        boolean b = checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}});
        System.out.println(b);
    }
    public boolean checkStraightLine(int[][] coordinates) {
    int x0= coordinates[0][0];
    int y0= coordinates[0][1];
    int x1= coordinates[1][0];
    int y1= coordinates[1][1];

    int dx = x1-x0;
    int dy = y1-y0;

        for (int i = 0; i < coordinates.length; i++) {
            int x=coordinates[i][0];
            int y =coordinates[i][1];
            if((x-x0)*dy!=(y-y0)*dx){
                return false;
            }
        }
        return true;
    }
}
