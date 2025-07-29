import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {

    public static void main(String[] args) {
        Create_SDO array = new Create_SDO();
        double[][] SDO_array = array.Create_SDO_array();
        K_Means three= new K_Means(SDO_array,3);
        K_Means six= new K_Means(SDO_array,6);
        K_Means nine= new K_Means(SDO_array,9);
        K_Means twelve= new K_Means(SDO_array,12);
        three = update(SDO_array,three,3);
        six = update(SDO_array,six,6);
        nine = update(SDO_array,nine,9);
        twelve = update(SDO_array,twelve,12);
        createPlots( three);
        createPlots( six);
        createPlots( nine);
        createPlots( twelve);

    }

    public static K_Means update(double[][] SDO_array,K_Means curr,int M){
        for(int i =0 ; i<15 ; i++){
            K_Means new_curr = new K_Means(SDO_array,M);
            if(new_curr.getFull_error()<curr.getFull_error()){
                curr = new_curr;
            }
        }
        System.out.println(curr.getFull_error());
        return curr;
    }
    public static void createPlots(K_Means curr){
        SwingUtilities.invokeLater(() -> {
            CreateScatterPlot example = new CreateScatterPlot("Scatter Chart Example",curr);
            example.setSize(800, 800);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }

}
