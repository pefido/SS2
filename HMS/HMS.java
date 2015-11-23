package HMS;

import java.util.HashMap;
import java.util.Map;

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

    // Criar o sistema HMS
    HMS HMS = new HMS();

    // Tentar encontrar o Record do paciente 1337
    MedRecord pat1337 = HMS.findRecord(1337);

    // Se nao existir, vamos criar
    if (pat1337 == null) pat1337 = HMS.createNewRecord(1337);

    // Tentar encontrar o PatReport do paciente 1337
    // Se nao existir, vamos criar
    if (pat1337.getPatReport() == null) {
      PatReport p = new PatReport("Manel Carlos",0,69,123456789);
      HMS.updatePatReport(pat1337, p);
    }

    // Tentar encontrar o MedCaseInfo do paciente 1337
    // Se nao existir, vamos criar
    if (pat1337.getMedCaseInfo() == null) {
      MedCaseInfo p = new MedCaseInfo("Laringite");
      HMS.updateMedCaseInfo(pat1337, p);
    }

    // Tentar encontrar o AdminInfo do paciente 1337
    // Se nao existir, vamos criar
    if (pat1337.getAdminInfo() == null) {
      AdminInfo p = new AdminInfo();
      HMS.updateAdminInfo(pat1337, p);
    }

    // Tentar encontrar o InternalInfo do paciente 1337
    // Se nao existir, vamos criar
    if (pat1337.getInternalInfo() == null) {
      InternalInfo p = new InternalInfo();
      HMS.updateInternalInfo(pat1337, p);
    }

    // Correr as estatisticas do sistema
    HMS.runStatistics();
    //IndicatorValue stat = HMS.getStatisticsIndicator();

    // Imprimir essas estatisticas


    System.out.println("YOYOYOY");

  }

}
