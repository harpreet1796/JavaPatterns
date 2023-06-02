package Patterns;//Delete this line if the code doesn't run
public class HalfPyramid {
    public static void main(String[] args) {
        //Setting up variables
        int n = 4;//Defines the no. of rows
        
        //Setting up loops
        
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Inner loop
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
