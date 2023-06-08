package Patterns;//Delete this line if the code doesn't run

public class FloydsTriangle {
    public static void main(String[] args) {
        //Setting up variables
        int n = 5;//Defines the no. of rows
        int number = 1;//Defines the number

        //Setting up loops
        
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Inner loop
            for(int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
