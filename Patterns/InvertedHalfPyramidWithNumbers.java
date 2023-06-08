package Patterns;//Delete this line if the code doesn't run
public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        //Setting up variables
        int n = 5;//Defines the no. of rows
        
        //Setting up loops
        
        //Outer Loop
        for(int i = n; i >= 1; i--){
            //Inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
