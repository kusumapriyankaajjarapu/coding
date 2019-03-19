/*
 * This program is client application for Cost_Estimator
 */
package cost_estimator;

//To use Scanner Class
import java.util.*;

/**
 *
 * @author Kusuma Priyanka
 */
public class Cost_Estimator_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test case 1 :read inputs from user
            Scanner scan = new Scanner(System.in);
            String material_standard = scan.nextLine();
            long area = scan.nextLong();
            boolean is_automated_house = scan.nextBoolean();
            long total_cost;

            Cost_Estimator c = new Cost_Estimator(material_standard, area, is_automated_house);
            total_cost = c.estimator();

        //Test case 2 : read custom inputs
            material_standard = "above standard";
            area = 500;
            is_automated_house = true;
            Cost_Estimator c1 = new Cost_Estimator(material_standard, area, is_automated_house);
            total_cost = c1.estimator();

        //Test case 3 : testing high boundary values
            material_standard = "above standard";
            area = 50000000;
            is_automated_house = true;
            Cost_Estimator c2 = new Cost_Estimator(material_standard, area, is_automated_house);
            total_cost = c2.estimator();

        //Test case 4 : testing low boundary values
            material_standard = "above standard";
            area = 5;
            is_automated_house = true;
            Cost_Estimator c3 = new Cost_Estimator(material_standard, area, is_automated_house);
            total_cost = c3.estimator();
        
    }
    
}
