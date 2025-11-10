
package st10468539_prog6112_exam_q1;

public class ST10468539_PROG6112_exam_Q1 {

    public static void main(String[] args) {
        
        /* 
        Fetched code from W3 schools for creating 2d arrays 
        https://www.w3schools.com/java/java_arrays_multi.asp
        */
        String[] Quaters = {"QUATER 1", "QUATER 2", "QUATER 3"}; 
        String[] Years = {"YEAR 1", "YEAR 2"}; 
        int[][] Sales = {
            {300, 150, 700} , 
            {250, 200, 600}
        }; 
        
        ProductSales obj = new ProductSales (Quaters, Years, Sales); 
        
        int total = obj.total(); 
        int average = obj.average(); 
        int maximum = obj.maximum(); 
        int minimum = obj.minimum(); 
        
        System.out.println("PRODUCT SALES REPORT - 2025\n"
                + "*************************************************\n"
                + "Total sales: " + total
                + "\nAverage sales: " + average 
                + "\nMaximum sale: " + maximum 
                + "\nMinimum sale: " + minimum 
                + "\n*************************************************"
        ); 
    }
    
}

//=====================================================================
// END-OF-FILE 
//=====================================================================