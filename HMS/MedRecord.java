package HMS;

public class MedRecord {

  int patientId;
  PatReport report;
  MedCaseInfo caseInfo;
  AdminInfo adminInfo;
  InternalInfo internalInfo;

  public MedRecord(int patientId) {
    this.patientId = patientId;
    report = null;
    caseInfo = null;
    adminInfo = null;
    internalInfo = null;
  }

  public PatReport getPatReport() {
    return report;
  }

  public MedCaseInfo getMedCaseInfo() {
    return caseInfo;
  }

  public AdminInfo getAdminInfo() {
    return adminInfo;
  }

  public InternalInfo getInternalInfo() {
    return internalInfo;
  }

  public void setReport(PatReport report) {
    this.report = report;
  }

  public void setCaseInfo(MedCaseInfo info) {
    caseInfo = info;
  }

  public void setAdminInfo(AdminInfo info) {
    adminInfo = info;
  }

  public void setInternalInfo(InternalInfo info) {
    internalInfo = info;
  }

}
