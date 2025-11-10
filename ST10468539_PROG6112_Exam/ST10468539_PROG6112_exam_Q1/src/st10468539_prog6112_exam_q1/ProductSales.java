
package st10468539_prog6112_exam_q1;

public class ProductSales {
    /* Fetched code from W3 schools for implementing modifiers  
    https://www.w3schools.com/java/java_modifiers.asp */ 
    
    public String[] Quater; 
    public String[] Years; 
    public int[][] sales; 
    
    /* Fetched code from Geeks for Geeks for implementing constructors  
    https://www.geeksforgeeks.org/java/constructors-in-java/ */ 
    
    public ProductSales (String[] Quater, String[] Years, int[][] sales) {
        this.Quater = Quater; 
        this.Years = Years; 
        this.sales = sales;
    }
    
    public int total() {
        
        int sum = 0; 
        
        /* Fetched code from W3 schools for creating an index-based for loop  
        https://www.w3schools.com/java/java_arrays_loop.asp */ 
        
        // iterate through rows 
        for (int i = 0; i < sales.length; i++) { 
            int[] row = sales[i]; 
            
            // get total for each row 
            for (int j = 0; i < row.length; i++) { 
                sum += row[j]; 
            }
        } 
        
        return sum; 
    }
    
    public int average(){

        int sum = 0; 
        int fields = 0; 

        /* Fetched code from W3 schools for creating an index-based for loop  
        https://www.w3schools.com/java/java_arrays_loop.asp */ 
        
        // iterate through rows 
        for (int i = 0; i < sales.length; i++) { 
            int[] row = sales[i]; 
            
            // get total for each row 
            for (int j = 0; i < row.length; i++) { 
                sum += row[j]; 
                
                // count one more field 
                fields += 1; 
            }
        } 
        
        // calculate and return average 
        return sum / fields; 
    }
    
    public int maximum(){
        int max = 0; 
                
        /* Fetched code from W3 schools for creating an index-based for loop  
        https://www.w3schools.com/java/java_arrays_loop.asp */ 
        
        // iterate through rows 
        for (int i = 0; i < sales.length; i++) { 
            int[] row = sales[i]; 
            
            // iterate through fields 
            for (int j = 0; i < row.length; i++) { 
                // measure current field against maximum 
                if (row[j] > max) {
                    // reset max 
                    max = row[j]; 
                }
            }
        } 
        
        return max; 
    }
    
    public int minimum(){
        int min = 100000; 
        
        /* Fetched code from W3 schools for creating an index-based for loop  
        https://www.w3schools.com/java/java_arrays_loop.asp */ 
        
        // iterate through rows 
        for (int i = 0; i < sales.length; i++) { 
            int[] row = sales[i]; 
            
            // iterate through fields 
            for (int j = 0; i < row.length; i++) { 
                // measure current field against maximum 
                if (row[j] < min) {
                    // reset max 
                    min = row[j]; 
                }
            }
        } 
        
        return min;
    }
}

//=====================================================================
// END-OF-FILE 
//=====================================================================