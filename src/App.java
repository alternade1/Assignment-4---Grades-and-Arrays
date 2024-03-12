import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); 
        int[] grades = new int[100];
        int gradeCount = 0; 

            while (true){
                System.out.println("Please enter grades, or -1 to stop:");
                int grade = in.nextInt();
                if (grade == -1) {
                    break; 
                } 

                grades[gradeCount] = grade; 

                gradeCount++; 

    
            }
           if (gradeCount == 0) {
            System.out.println("No grades entered");

           } else {
            double total = 0; 
            for (int i = 0; i < gradeCount; i++); {
                total += grades[i];

            }


            double average = total / gradeCount; 
            System.out.println("The average of the the grades you input " + gradeCount + " is: " + average);
           }

           in.close(); 
          
    }
}
