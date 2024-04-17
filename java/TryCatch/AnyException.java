package TryCatch;
class Main{
    public static void main(String[] agrs){
        int[] arr = new int[9];
        try {
            // Code that might throw an exception
            //int result = 10 / 0; // This will throw an ArithmeticException
            arr[10] = 10; 
        }
        catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception ex) {
            // Handling other exceptions (if needed)
            System.out.println("Other Exception: " + ex.getMessage());
        }
        finally {
            // Optional: finally block executes whether an exception occurred or not
            // Useful for cleanup code (closing resources, etc.)
            System.out.println("This block always executes");
        }

    }
}