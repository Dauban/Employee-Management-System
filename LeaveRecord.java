//Author:Or Adar
package employee;

/**
 * a leave record for vacations has the params:
 * @param ID
 * @param totalLeaves
 * @param leavesTaken
 * also how many leaves the emp has, which is the sum of his total leaves minus the ones he took
 * a tostring to return his record id and total leaves left.
 */
public record LeaveRecord(long ID, int totalLeaves,int leavesTaken) {
    public int leavesLeft(){
        return totalLeaves-leavesTaken;
    }
    @Override
    public String toString(){
        return "Leave record,ID: "+ID+" Total leaves left: "+leavesLeft();
    }
}
