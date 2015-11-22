package HMS;

import java.util.HashMap;
import java.util.Map;
//import java.util.Iterator;
//import java.util.Set;

public class HMS {

  //Records hashmap
  HashMap<Integer, MedRecord> records = new HashMap<Integer, MedRecord>();

  //API publica
  public MedRecord createNewRecord(int patientId) {
    MedRecord m = new MedRecord(patientId);
    records.put(patientId, m);
    return m;
  }
  public MedRecord findRecord(int patientId) {
    return records.get(patientId);
  }
  public PatReport getPatReport(MedRecord record) {
    return record.getPatReport();
  }
  public MedCaseInfo getMedCaseInfo(MedRecord record) {
    return record.getMedCaseInfo();
  }
  public AdminInfo getAdminInfo(MedRecord record) {
    return record.getAdminInfo();
  }
  public InternalInfo getInternalInfo(MedRecord record) {
    return record.getInternalInfo();
  }
  public void updatePatReport(MedRecord record, PatReport report) {
    record.setReport(report);
  }
  public void updateMedCaseInfo(MedRecord record, MedCaseInfo caseInfo) {
    record.setCaseInfo(caseInfo);
  }
  public void updateAdminInfo(MedRecord record, AdminInfo info) {
    record.setAdminInfo(info);
  }
  public void updateInternalInfo(MedRecord record, InternalInfo info) {
    record.setInternalInfo(info);
  }
  // ???
  public void runStatistics() {
  }
  public IndicatorValue getStatisticsIndicator(int StatisticsIndicatorId) {
    return null;
  }

  //For testing purposes only
  public static void main(String [] args) {

    System.out.println("YOYOYOY");

  }

}
