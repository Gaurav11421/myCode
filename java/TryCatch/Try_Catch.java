// An 
package TryCatch;
class Try_Catch{
    public static void main(String[] agrs){
        int[] nums = new int[4];
        try{
            System.out.println("Before exception is generated.");
            // Generate an index out of bounds exception
            nums[5] = 10;
            System.out.println("this won't be displayed");
        }
        catch(ArrayIndexOutOfBoundsException exc){
            // Catch the exception
            System.out.println("Index out of bound!");
        }
        System.out.println("After catch");
    }
}