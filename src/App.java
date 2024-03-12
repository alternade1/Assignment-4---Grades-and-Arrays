import java.util.Scanner; 
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int[] grades = new int[100];
        int totalgrades = 0; 

            while (true){
                System.out.println("Please enter your grades, or type in -1 to stop:");
                int grade = in.nextInt();
                if (grade == -1) {
                    break; 
                } 

                grades[totalgrades] = grade; 

                totalgrades++; 

    
            }
            if (totalgrades == 0) {
                System.out.println("No grades have been entered.");
            } else {
            
                double total = 0; 
                for (int i = 0; i < totalgrades; i++) { 
                    total += grades[i]; 
                }
                double average = total / totalgrades; 
    
                System.out.println("The average of those " + totalgrades + " grades that you added is: " + average); 
            }
    
            in.close();
          
    }
}
