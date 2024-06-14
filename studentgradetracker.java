import java.util.*;
public class studentgradetracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student grade tracker");
        System.out.println("Enter student name");
        String Name=sc.nextLine();
       
        System.out.println("Enter Student roll number ");
        int Rollnumber=sc.nextInt();
        
        System.out.println("Enter marks scored in all subjects");
       String arr[]={"Telugu","Hindi","English","Social","Science","Maths"};
       int[] scoreRecord = new int[6];
       for(int i=0;i<=arr.length;i++)
       {
          for(int j=0;j<scoreRecord.length;j++)
          {
            scoreRecord[i] = sc.nextInt();
           
            System.out.println( arr[i]  +":" + scoreRecord[i]);
            i++;
          }
       }
       int totalScore = 0;
        for (int i = 0; i < scoreRecord.length; i++) {
            totalScore += scoreRecord[i];
        }
        System.out.println("Your total score is :" +totalScore);
        float scorepercentage = (float) totalScore / 600 * 100;
        
        System.out.println("Your marks percentage is " + scorepercentage + "%.");


        //calculate grade
     if(scorepercentage>=90){
     System.out.println("A");}
     else if(scorepercentage>=80){
     System.out.println("B");}
     else if(scorepercentage>=70){
     System.out.println("C");}
     else if(scorepercentage>=60){
     System.out.println("D");}
     else
     System.out.println("You have failed");
      
    }
    
}
