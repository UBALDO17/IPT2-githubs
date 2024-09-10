public class Calculator { 
    public static void main(String[] args) { 
        // Create instances of the classes 
        Add adder = new Add(); 
        Subtract subtractor = new Subtract(); 
        Product multiplier = new Product(); 
        Division divider = new Division(); 
        Modulus modulusOperator = new Modulus(); 
        
        // Call methods from the classes 
        int sum = adder.add(5, 3); 
        int difference = subtractor.subtract(5, 3); 
        int product = multiplier.product(5, 3); 
        int quotient = divider.divide(6, 3); 
        int modulus = modulusOperator.modulus(10, 5); 
        
        // Print results 
        System.out.println("Sum: " + sum); 
        System.out.println("Difference: " + difference); 
        System.out.println("Product: " + product); 
        System.out.println("Quotient: " + quotient); 
        System.out.println("Modulus: " + modulus); 
    } 
}
