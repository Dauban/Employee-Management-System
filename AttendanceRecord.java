//Author:Or Adar
package employee;

/**
 * a record class that has 3 param, ID, total working days and days present
 * it has a method to return the % of the attendance of said employee and tostring to print all this info
 * @param ID
 * @param totalWorkingDays
 * @param daysPresent
 */
public record AttendanceRecord(long ID, double totalWorkingDays, double daysPresent) {
    public double attendancePrecent(){
        return daysPresent*100/totalWorkingDays;

    }
    @Override
    public String toString(){
        return "Attendance, ID: "+ID+" Attendance precent: "+attendancePrecent()+"%";
    }
}
