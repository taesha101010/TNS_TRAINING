class AcademyAdmission{
    String studentName;
    int stdId;
    double score;
    
    //constructor for examtakers
    AcademyAdmission(String studentName, int stdId, double score){
        this.studentName = studentName;
        this.stdId = stdId;
        this.score = score;
    }
      //Constructor of Directwalkin
      AcademyAdmission(String studentName, int stdId){
        this.studentName = studentName;
        this.stdId = stdId;
        
    }

    char getGrade() {
        if (score >= 90){
            return 'A';
        }
        else if (score >= 75){
            return 'B';
        }
        else if (score >= 50){
            return 'C';}
        else {
            return 'F';
    }
}

void printReportCard() {
    System.out.println("Name: "+ studentName);
    System.out.println("StudentID: "+ stdId);
    System.out.println("Score: " + score);
    System.out.println("Grade: " + getGrade());


}

}

public class AcaddemyPortal {
      /**
     * @param args
     */
    public static void main(String[] args) {
        AcademyAdmission s1 = new AcademyAdmission("Tanisha", 07, 99.5);

        AcademyAdmission s2 = new AcademyAdmission("vishu", 22);

        s1.printReportCard();
        s2.printReportCard();
      }   
}
