//Author:Or Adar
package employee;

/**
 * employee record contains the following param:
 * @param ID
 * @param name
 * @param age
 * @param department
 * @param designation
 * has a tostring method to print the employee ID.
 */
public record EmployeeRecord(long ID,String name,int age,String department,String designation) {
    @Override
    public String toString(){
        return "Employee ID:"+ID;
    }
}
