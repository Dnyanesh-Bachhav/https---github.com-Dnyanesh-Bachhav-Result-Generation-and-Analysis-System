//package StudentCourses;
package beans;
// Generated 7 Mar, 2019 1:15:42 PM by Hibernate Tools 4.3.1



/**
 * StudentCourses generated by hbm2java
 */
public class StudentCourses  implements java.io.Serializable {

     private int studentId;
     private String courseCode;
     private int isBacklog;
     private String periodicTest;
     private String theory;
     private int theoryMarkSheetNumber;
     private boolean theoryIsPass;
     private int termwork;
     private boolean termworkIsPass;
     private int practical;
     private boolean practicalIsPass;
     private int oral;
     private boolean oralIsPass;
     private int total;
     private String examination;

    
    
        public StudentCourses(){
    }
    
     //It is for putting zero's in the Table.
//    public StudentCourses(int studentId, String courseCode, String periodicTest, String theory, String termwork, String practical, String oral) {
//        this.studentId = studentId;
//        this.courseCode = courseCode;
//        this.periodicTest = periodicTest;
//        this.theory = theory;
//        this.termwork = termwork;
//        this.practical = practical;
//        this.oral = oral;
//    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
   
    public int getIsBacklog() {
        return this.isBacklog;
    }
    
    public void setIsBacklog(int isBacklog) {
        this.isBacklog = isBacklog;
    }
    
    public int getTheoryMarkSheetNumber() {
        return this.theoryMarkSheetNumber;
    }
    
    public void setTheoryMarkSheetNumber(int theoryMarkSheetNumber) {
        this.theoryMarkSheetNumber = theoryMarkSheetNumber;
    }
    public boolean isTheoryIsPass() {
        return this.theoryIsPass;
    }
    
    public void setTheoryIsPass(boolean theoryIsPass) {
        this.theoryIsPass = theoryIsPass;
    }
    public int getTermwork() {
        return this.termwork;
    }
    
    public void setTermwork(int termwork) {
        this.termwork = termwork;
    }
    public boolean isTermworkIsPass() {
        return this.termworkIsPass;
    }
    
    public void setTermworkIsPass(boolean termworkIsPass) {
        this.termworkIsPass = termworkIsPass;
    }
    public int getPractical() {
        return this.practical;
    }
    
    public void setPractical(int practical) {
        this.practical = practical;
    }
    public boolean isPracticalIsPass() {
        return this.practicalIsPass;
    }
    
    public void setPracticalIsPass(boolean practicalIsPass) {
        this.practicalIsPass = practicalIsPass;
    }
    public int getOral() {
        return this.oral;
    }
    
    public void setOral(int oral) {
        this.oral = oral;
    }
    public boolean isOralIsPass() {
        return this.oralIsPass;
    }
    
    public void setOralIsPass(boolean oralIsPass) {
        this.oralIsPass = oralIsPass;
    }
    public int getTotal() {
        return this.total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    public String getExamination() {
        return this.examination;
    }
    
    public void setExamination(String examination) {
        this.examination = examination;
    }

    public String getTheory() {
        return theory;
    }

    public void setTheory(String theory) {
        this.theory = theory;
    }

    public String getPeriodicTest() {
        return periodicTest;
    }

    public void setPeriodicTest(String periodicTest) {
        this.periodicTest = periodicTest;
    }

}


