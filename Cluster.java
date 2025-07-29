import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cluster {
    private double x_Center;
    private double y_Center;
    private int clusterNum;
    private double error;
    public Cluster(double x, double y, int clusterNum){
        this.x_Center = x;
        this.y_Center = y;
        this.clusterNum= clusterNum ;
        this.error = 0;
    }
    public double calc_euclidean_distance(Entry entry){
        return Math.sqrt((Math.pow(entry.getX()-this.x_Center,2))+(Math.pow(entry.getY()-this.y_Center,2)));
    }

    public void updateCenter(List<Entry> entries){
        double sum_x=0;
        double sum_y=0;
        for(int j=0;j< entries.size() ;j++){
            Entry curr_entry =entries.get(j);
            sum_x += curr_entry.getX();
            sum_y += curr_entry.getY();
        }
        this.x_Center= sum_x/entries.size();
        this.y_Center= sum_y/entries.size();
    }

    public double getX_Center() {
        return x_Center;
    }

    public double getY_Center() {
        return y_Center;
    }

    public int getClusterNum() {
        return clusterNum;
    }
    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }
}
