package HMS;

public class AdminInfo {

  private boolean complaint;

  public AdminInfo(boolean complaint){
    this.complaint = complaint;
  }

  public boolean getComplaint(){
    return complaint;
  }

  public void setComplaint(boolean complaint){
    this.complaint = complaint;
  }
}