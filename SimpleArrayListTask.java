import java.util.ArrayList;
import java.util.Collections;
public class GradeAnalyzer{
  public GradeAnalyzer(){
    
  }
  public int getAverage(ArrayList<Integer> grades){
    if (grades.size() < 1){
       System.out.println ("The ArrayList is empty");  
      return 0;
    }else {
      int sum=0;
      for(int grade: grades){
        sum+=grade;
      }
       //return sum;
      int average =sum/grades.size();
      System.out.println("The average is:" + average);
    return average;
    }
    
     
    }
 public int getBiggest(ArrayList<Integer> values){
      //int biggerValue=0;
     for (int i=0; i < values.size(); i++){
        for (int k = i+1; i<values.size();k++) {
             if (values.get(i)>=values.get(k)){
                biggerValue = values.get(i);
               
             } else{
               biggerValue = values.get(k);             
             }
            
        }
        return biggerValue;
      }
System.out.println("The biggest Value in the array list is:" + );
        return biggerValue; 
   
    //System.out.println(Collections.min(values));
    //System.out.println(Collections.max(values));
   	return 0;
    } 
    
   /* int average =sum/grades.size();
    System.out.println("The average is:" + average);
    return average;*/
  
  public static void main(String [ ] args){
    ArrayList<Integer> myClassroom = new ArrayList();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom); 
    myAnalyzer.getBiggest(myClassroom);
   
    
    //GradeAnalyzer myBiggestGrade = new GradeAnalyzer ();
    //myBiggestGrade.getBiggest(myClassroom);
    
  }
}