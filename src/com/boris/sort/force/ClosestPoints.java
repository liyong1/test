package com.boris.sort.force;

public class ClosestPoints {
    /**
     * 最近点问题
     * 找出距离最近的两个点
     */
    public static void main(String[] args) {
        int[][] points = {{1,0},{2,3},{3,6},{2,6},{5,7},{6,4},{5,8},{6,9},{7,8}};
        int[] index = pointDistance(points);
        System.out.println(index[0]);
        System.out.println(index[1]);
    }

    public static int[] pointDistance(int[][] points) {
        double distance = Double.MAX_VALUE;
        int ind1 = -1, ind2 = -1;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                int x_d = points[i][0] - points[j][0];
                int y_d = points[i][1] - points[j][1];
                double d = Math.pow(x_d,2) + Math.pow(y_d,2);
                if (d < distance) {
                    distance = d;
                    ind1 = i;
                    ind2 = j;
                }
            }
        }
        return new int[]{ind1, ind2};
    }
}
