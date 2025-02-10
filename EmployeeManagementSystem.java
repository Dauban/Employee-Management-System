//Author:Or Adar
package employee;

/**
 * a main for our records, creates 2 of each of the records, giving their respected paramters then prints
 * them in a tostring of the 2 employees we created.
 */
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeRecord emp1=new EmployeeRecord(5679, "Roy",32,"Science","Engineer");
        EmployeeRecord emp2=new EmployeeRecord(8979, "Asaf",28,"Physics","Teacher");
        AttendanceRecord Ap1=new AttendanceRecord(5679,83,80);
        AttendanceRecord Ap2=new AttendanceRecord(8979,95,89);
        LeaveRecord Lp1=new LeaveRecord(5679,12,5);
        LeaveRecord Lp2=new LeaveRecord(8979,8,3);
        PayrollRecord Pp1=new PayrollRecord(5679,8000,600,400);
        PayrollRecord Pp2=new PayrollRecord(8979,9000,900,700);
        System.out.println(emp1.toString()+Ap1+Lp1+Pp1);
        System.out.println(emp2.toString()+Ap2+Lp2+Pp2);
    }
}
