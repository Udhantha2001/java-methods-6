import java.util.Scanner;

public class Method6 {


    static String [] userInput(){
        
        Scanner op = new Scanner(System.in);
        
        String [] marks = {"","","","","","","","","",""};
        
        for(int i = 0; i < marks.length; i++){
            System.out.print("Enter your marks : ");
            marks[i] = op.nextLine();
        }
        
        return marks;
        
    }
    
    static double avg(String [] marks){
        
        double allMarks = 0;
        
        for(int i = 0; i < marks.length; i++){
            allMarks += Double.parseDouble(marks[i]);
        }
        
        double avg = allMarks / marks.length;
        
        return avg;
        
    }
    
    public static void main(String[] args) {
        
        String [] marks = userInput();
        double avg = avg(marks);
        
        System.out.println("Avg : " + avg);
        
    }

}
