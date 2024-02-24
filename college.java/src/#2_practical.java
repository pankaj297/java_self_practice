import javax.xml.stream.XMLInputFactory;

//if - else if - else
class practical02{
    public static void main (String [] args){
      int marks = 85;

      if(marks<50){
          System.out.println("fail");
      }
      else if(marks>=50 && marks<60){
          System.out.println("D grade");
        }
      else if(marks>=60 && marks<70){
          System.out.println("C grade");
      }
      else if(marks>=70 && marks<80){
          System.out.println("B grader ");
        }
      else if(marks>=80 && marks<90){
          System.out.println("A grade");
        }
      else if(marks>=90 && marks<100){
          System.out.println("A+ grade");
      }
      else {
          System.out.println("not Found");
      }
    }
}

//if , else if , else
class If_ElseIf_Else{
    public static void main(String[] args) {
        int marks = 75;

        if(marks<35){
            System.out.println("Fail");
        }else if(marks>=35 && marks<50){
            System.out.println("C Grade");
        }else if(marks>=50 && marks<60){
            System.out.println("C+ Grade");
        }else if(marks>=60 && marks<70){
            System.out.println("B Grade");
        }else if(marks>=70 && marks<80){
            System.out.println("B+ Grade");
        }else if(marks>=80 && marks<90){
            System.out.println("A Grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ Grade");
        }else{
            System.out.println("Note Found!");
        }
    }
}