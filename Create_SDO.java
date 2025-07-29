import java.util.Random;

public class Create_SDO {
    public double[][] Create_SDO_array() {
        Random rand = new Random();
        int row = 1200;
        int col = 2;
        double[][] point_data_arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            //150 points in the rectangle [0.8,1.2]x[0.8,1.2]
            if(i<150){
                point_data_arr[i][0] = rand.nextDouble()  * 0.4 + 0.8;
                point_data_arr[i][1] = rand.nextDouble()  * 0.4 + 0.8;
            }
            //150 points in the rectangle [0,0.5]x[0,0.5]
            else if(i>=150 && i < 300){
                point_data_arr[i][0] = rand.nextDouble()  *0.5;
                point_data_arr[i][1] = rand.nextDouble()  *0.5;
            }
            //150 points in the rectangle [1.5,2]x[0,0.5]
            else if(i>=300 && i < 450){
                point_data_arr[i][0] = rand.nextDouble() * 0.5 + 1.5;
                point_data_arr[i][1] = rand.nextDouble() * 0.5;
            }
            //150 points in the rectangle [0,0.5]x[1.5,2],
            else if(i>=450 && i < 600){
                point_data_arr[i][0] = rand.nextDouble() * 0.5 ;
                point_data_arr[i][1] = rand.nextDouble() * 0.5 + 1.5;
            }
            //150 points in the rectangle [1.5,2] x [1.5,2]
            else if(i>=600 && i < 750){
                point_data_arr[i][0] = rand.nextDouble() * 0.5 + 1.5;
                point_data_arr[i][1] = rand.nextDouble() * 0.5 + 1.5;
            }
            //75 points in the rectangle [0,0.4]x[0.8, 1.2]
            else if(i>=750 && i < 825) {
                point_data_arr[i][0] = rand.nextDouble() * 0.4;
                point_data_arr[i][1] = rand.nextDouble() * 0.4 + 0.8;
            }
            //75 points in the rectangle [1.6,2]x[0.8, 1.2]
            else if(i>=825 && i < 900) {
                point_data_arr[i][0] = rand.nextDouble() * 0.4 + 1.6;
                point_data_arr[i][1] = rand.nextDouble() * 0.4 + 0.8;
            }
            //75 points in the rectangle [0.8,1.2]x[0.3,0.7]
            else if(i>=900 && i < 975) {
                point_data_arr[i][0] = rand.nextDouble() * 0.4 + 0.8;
                point_data_arr[i][1] = rand.nextDouble() * 0.4 + 0.3;
            }
            //75 points in the rectangle [0.8,1.2]x[1.3,1.7]
            else if(i>=975 && i < 1050) {
                point_data_arr[i][0] = rand.nextDouble() *  0.5 + 0.8;
                point_data_arr[i][1] = rand.nextDouble() * 0.4 + 1.3;
            }
            //150 points in the rectangle [0,2]x[0,2]
            else if(i>=1050 && i < 1200){
                point_data_arr[i][0] = rand.nextDouble() * 2;
                point_data_arr[i][1] = rand.nextDouble() * 2;
            }
        }
        return point_data_arr;
    }
}
