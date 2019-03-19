/*
 * This program calculates the total cost of a land based on the customer requirements
 */
package cost_estimator;

/**
 *
 * @author Kusuma Priyanka
 */
public class Cost_Estimator{
    String material_standard;
    long area;
    boolean is_automated_house;
    long total_cost;

    //defines constructor
    public Cost_Estimator(String ms,long a,boolean ah){
        material_standard = ms;
        area = a;
        is_automated_house = ah;
}

    //estimating total cost
    public long estimator(){
        //to check if material standard is “Standard”
        if(material_standard.equals("standard")){
            total_cost = 1200 * area; // cost of 1 sqfeet is 1200INR
        }

        //to check if material standard is “above Standard”
        else if(material_standard.equals("above standard")){
            total_cost = 1500 * area; // cost of 1 sqfeet is 1500INR
         }

        //to check if material standard is “high Standard”
        else if(material_standard.equals("high standard")&&(!is_automated_house)){
            total_cost = 1800 * area; // cost of 1 sqfeet is 1800INR
        }

        //to check if material standard is “high Standard and fully automated house”
        else if(material_standard.equals("high standard")){
            total_cost = 2500 * area; // cost of 1 sqfeet is 2500INR
        }
        return total_cost;
    }
}
