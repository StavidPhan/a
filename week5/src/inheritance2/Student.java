package inheritance2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor 1.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Constructor 1.
     */


    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * return String.
     */
    @Override
    public String toString() {
        return String.format("Student[%s,program=%s,year=%d,fee=%.1f]",
                super.toString(), program, year, fee);
    }
}
