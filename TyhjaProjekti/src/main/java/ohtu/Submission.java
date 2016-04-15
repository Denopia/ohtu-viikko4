package ohtu;

public class Submission {
    private String student_number; 
    private String last_name;
    private String first_name;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    
    public String[] tehtavatListana(){
        
        return tehtavatStringina().split(" ");
    
    }
    
    public String tehtavatStringina(){
        String tehdyt = "";  
        if(isA1())tehdyt+="1 ";
        if(isA2())tehdyt+="2 ";
        if(isA3())tehdyt+="3 ";
        if(isA4())tehdyt+="4 ";
        if(isA5())tehdyt+="5 ";
        if(isA6())tehdyt+="6 ";
        if(isA7())tehdyt+="7 ";
        if(isA8())tehdyt+="8 ";
        if(isA9())tehdyt+="9 ";
        if(isA10())tehdyt+="10 ";
        if(isA11())tehdyt+="11 ";
        if(isA12())tehdyt+="12 ";
        return tehdyt.substring(0, tehdyt.length()-1);    
    }
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
       return " viikko " + getWeek() + " tehtyjä tehtäviä yhteensä: "
            + tehtavatListana().length + ", aikaa kului "+ getHours() 
            + ", tehdyt tehtävät: " + tehtavatStringina(); 

    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @return the week
     */
    public int getWeek() {
        return week;
    }

    /**
     * @param week the week to set
     */
    public void setWeek(int week) {
        this.week = week;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * @return the a1
     */
    public boolean isA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(boolean a1) {
        this.a1 = a1;
    }

    /**
     * @return the a2
     */
    public boolean isA2() {
        return a2;
    }

    /**
     * @param a2 the a2 to set
     */
    public void setA2(boolean a2) {
        this.a2 = a2;
    }

    /**
     * @return the a3
     */
    public boolean isA3() {
        return a3;
    }

    /**
     * @param a3 the a3 to set
     */
    public void setA3(boolean a3) {
        this.a3 = a3;
    }

    /**
     * @return the a4
     */
    public boolean isA4() {
        return a4;
    }

    /**
     * @param a4 the a4 to set
     */
    public void setA4(boolean a4) {
        this.a4 = a4;
    }

    /**
     * @return the a5
     */
    public boolean isA5() {
        return a5;
    }

    /**
     * @param a5 the a5 to set
     */
    public void setA5(boolean a5) {
        this.a5 = a5;
    }

    /**
     * @return the a6
     */
    public boolean isA6() {
        return a6;
    }

    /**
     * @param a6 the a6 to set
     */
    public void setA6(boolean a6) {
        this.a6 = a6;
    }

    /**
     * @return the a7
     */
    public boolean isA7() {
        return a7;
    }

    /**
     * @param a7 the a7 to set
     */
    public void setA7(boolean a7) {
        this.a7 = a7;
    }

    /**
     * @return the a8
     */
    public boolean isA8() {
        return a8;
    }

    /**
     * @param a8 the a8 to set
     */
    public void setA8(boolean a8) {
        this.a8 = a8;
    }

    /**
     * @return the a9
     */
    public boolean isA9() {
        return a9;
    }

    /**
     * @param a9 the a9 to set
     */
    public void setA9(boolean a9) {
        this.a9 = a9;
    }

    /**
     * @return the a10
     */
    public boolean isA10() {
        return a10;
    }

    /**
     * @param a10 the a10 to set
     */
    public void setA10(boolean a10) {
        this.a10 = a10;
    }

    /**
     * @return the a11
     */
    public boolean isA11() {
        return a11;
    }

    /**
     * @param a11 the a11 to set
     */
    public void setA11(boolean a11) {
        this.a11 = a11;
    }

    /**
     * @return the a12
     */
    public boolean isA12() {
        return a12;
    }

    /**
     * @param a12 the a12 to set
     */
    public void setA12(boolean a12) {
        this.a12 = a12;
    }
    
}