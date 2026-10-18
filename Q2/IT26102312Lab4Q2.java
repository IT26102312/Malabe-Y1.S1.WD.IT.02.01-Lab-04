import java.util.Scanner;

public class IT26102312Lab4Q2 { 
    public static void main(String[] args) {
	
	    double examMarks , labMarks ,examPercentage , labPercentage , finalMark;
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("exam marks(out of 100): ");
		examMarks = input.nextDouble();
		if (examMarks < 0 || examMarks > 100){
		   System.out.println("Invalid input for exam marks. Terminating program.");
		   return; // Exit the program
		}
		   
		System.out.print("lab submission marks(out of 100) :");
        labMarks = input.nextDouble();
		if (labMarks < 0 || labMarks > 100 ) { 
		 System.out.println("Invalid input for lab submission marks. Terminating program");
            return; // Exit the program
        }
		
		System .out.print("percentage give for the exam:");
		examPercentage = input.nextDouble();
		
		System .out.print("percentage give for the lab submission:");
		labPercentage = input.nextDouble();
		
		if (examPercentage + labPercentage != 100) {
		   System.out.println("The percentages must add up to 100. Terminating program.") ;
		   return; // Exit the program
		}
		   
		   finalMark = (examMarks * examMarks / 100) + (labMarks * labPercentage /100);
		   
		   System.out.println() ;
		   System.out.println("Final Mark is :" + finalMark);
	}
}