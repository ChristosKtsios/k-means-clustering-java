import java.util.*;

public class K_Means {
    private static int M;
    private static double[][] sdo;
    private List<Entry> data = new ArrayList<Entry>();
    private List<Cluster> clusters = new ArrayList<Cluster>();
    private Map<Cluster,List<Entry>> clusterElements = new HashMap<Cluster,List<Entry>>();

    double full_error = 0;


    public K_Means(double[][] sdo, int M){
        this.M = M;
        this.sdo=sdo;
        initialize_entries();
        initialize_centers();
        create_clusters();
        for(int i=0;i<1000;i++){
            updateClusters();
            for(Cluster cluster : clusters ){
                cluster.setError(0);
            }
            clusterElements.clear();
            create_clusters();
        }
        setError();
    }
    public void initialize_entries(){
        for(int i=0;i<sdo.length; i++){
            Entry entry = new Entry(sdo[i][0],sdo[i][1]);
            data.add(entry);
        }
    }
    public void initialize_centers(){
        Random rand = new Random();
        for(int i=0;i<M;i++){
            double x = rand.nextDouble()*2;
            double y = rand.nextDouble()*2;
            Cluster cluster = new Cluster(x,y,i);
            clusters.add(cluster);
        }
    }

    public void create_clusters(){
        for (int i = 0; i < data.size(); i++) {
            Entry entry = data.get(i);
            double distance = Double.POSITIVE_INFINITY;
            Cluster cluster = clusters.get(0);
            for(int j=0;j< clusters.size() ;j++){
                Cluster current_cluster = clusters.get(j);
                double curr_distance= current_cluster.calc_euclidean_distance(entry);
                if(curr_distance<distance) {
                    distance = curr_distance;
                    cluster = current_cluster;
                }
            }
            double error = cluster.getError();
            error += distance;
            cluster.setError(error);
            if(clusterElements.containsKey(cluster)) {
                clusterElements.get(cluster).add(entry);
            }
            else {
                List<Entry> entries= new ArrayList<Entry>();
                entries.add(entry);
                clusterElements.put(cluster,entries);
            }
        }
    }
    public void updateClusters(){
        int centers_changed = 0;
        for(Cluster groupName : clusterElements.keySet()){
            groupName.updateCenter(clusterElements.get(groupName));
        }
    }
    public List<Entry> getData() {
        return data;
    }

    public List<Cluster> getClusters() {
        return clusters;
    }

    public Map<Cluster, List<Entry>> getClusterElements() {
        return clusterElements;
    }
    public void setError(){
        for(Cluster groupName : clusterElements.keySet()){
            this.full_error += groupName.getError();
        }

    }
    public double getFull_error() {
        return full_error;
    }


}

