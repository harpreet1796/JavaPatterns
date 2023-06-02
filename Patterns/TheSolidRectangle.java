package Patterns;//Delete this line if the code doesn't run
public class TheSolidRectangle {
    public static void main(String[] args) {
        //Setting up variables
        int n = 4;//Defines the no. of rows
        int m = 5;//Defines the no. of columns
        
        //Setting up loops
        
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Inner loop
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
