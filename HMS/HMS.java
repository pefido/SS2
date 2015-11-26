package HMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HMS {

  public HMS() throws Exception {
    Connection c = getCon();
    //Create table MedRecord
    PreparedStatement pstmt = c.prepareStatement(
        "CREATE TABLE IF NOT EXISTS medrecord "
        + "(ID INT PRIMARY KEY NOT NULL)");
    pstmt.executeUpdate();
    pstmt.close();
    //Create table patReport
    pstmt = c.prepareStatement(
        "CREATE  TABLE IF NOT EXISTS patreport "
        + "(ID INT PRIMARY KEY NOT NULL,"
        + " NAME    TEXT NOT NULL,"
        + " SEX INT NOT NULL,"
        + " AGE INT NOT NULL)");
    pstmt.executeUpdate();
    pstmt.close();
    //Create table medCaseInfo
    pstmt = c.prepareStatement(
        "CREATE  TABLE IF NOT EXISTS medcaseinfo "
        + "(ID INT PRIMARY KEY NOT NULL,"
        + " DISEASE    TEXT NOT NULL)");
    pstmt.executeUpdate();
    pstmt.close();
    //Create table AdminInfo
    pstmt = c.prepareStatement(
        "CREATE TABLE IF NOT EXISTS admininfo "
        + "(ID INT PRIMARY KEY NOT NULL)");
    pstmt.executeUpdate();
    pstmt.close();
    // Create InternalInfo
    pstmt = c.prepareStatement(
        "CREATE TABLE IF NOT EXISTS internalinfo "
        + "(ID INT PRIMARY KEY NOT NULL)");
    pstmt.executeUpdate();
    pstmt.close();
    pstmt = c.prepareStatement(
        "CREATE TABLE IF NOT EXISTS statistics "
        + "(ID INT PRIMARY KEY NOT NULL,"
        + " VALUE INT NOT NULL,"
        + " NAME STRING NOT NULL)");
    pstmt.executeUpdate();
    pstmt.close();
    // Criar os indicatores
    PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into statistics values (1, 0, 'Income')"); pstmt.executeUpdate(); pstmt.close();
    PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into statistics values (2, 0, 'Expense')"); pstmt.executeUpdate(); pstmt.close();
    PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into statistics values (3, 0, 'Total Patients')"); pstmt.executeUpdate(); pstmt.close();
    PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into statistics values (4, 0, 'Elders')"); pstmt.executeUpdate(); pstmt.close();
    c.close();
  }

  private Connection getCon() throws Exception {
    Class.forName("org.sqlite.JDBC");
    DriverManager.registerDriver(new org.sqlite.JDBC());
    return DriverManager.getConnection("jdbc:sqlite:SSfim.db");
  }

  private void save_rec(MedRecord m) throws Exception {
    Connection c = getCon();
    // Get patientId
    int patientId = m.getPatientId();
    // Get and save patReport
    PatReport pat = m.getPatReport();
    if (pat != null) {
      PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into patreport values (?, ?, ?, ?)");
      patst.setInt(1, patientId);
      patst.setString(2, pat.getName());
      patst.setInt(3, pat.getSex());
      patst.setInt(4, pat.getAge());
      patst.executeUpdate();
      patst.close();
    }
    // Get and save MedCaseInfo
    MedCaseInfo med = m.getMedCaseInfo();
    if (med != null) {
      PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into medcaseinfo values (?, ?)");
      patst.setInt(1, patientId);
      patst.setString(2, med.getDisease());
      patst.executeUpdate();
      patst.close();
    }
    // Get and save AdminInfo
    AdminInfo adm = m.getAdminInfo();
    if (adm != null) {
      PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into admininfo values (?)");
      patst.setInt(1, patientId);
      patst.executeUpdate();
      patst.close();
    }
    // Get and save InternalInfo
    InternalInfo inf = m.getInternalInfo();
    if (inf != null) {
      PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into internalinfo values (?)");
      patst.setInt(1, patientId);
      patst.executeUpdate();
      patst.close();
    }
    // Get and save MedRecord
    PreparedStatement patst = c.prepareStatement("INSERT OR REPLACE into medrecord values (?)");
    patst.setInt(1, patientId);
    patst.executeUpdate();
    patst.close();
    c.close();
  }

  private MedRecord get_rec(int patientId) throws Exception {
    Connection c = getCon();
    // Get MedRecord
    PreparedStatement pstmt = c.prepareStatement("SELECT * FROM medrecord WHERE id=?");
    pstmt.setInt(1, patientId);
    ResultSet tmp = pstmt.executeQuery();
    MedRecord record = null;
    while(tmp.next()) { record = new MedRecord(tmp.getInt(1)); }
    pstmt.close();
    if(record != null) {
      // Get patReport
      pstmt = c.prepareStatement("SELECT * FROM patreport WHERE id=?");
      pstmt.setInt(1, patientId);
        tmp = pstmt.executeQuery();
      PatReport report = null;
      while(tmp.next()) {
        //create patreport
        report = new PatReport(tmp.getString(2), tmp.getInt(3), tmp.getInt(4));
        record.setReport(report);
      }
      pstmt.close();
      // Get MedCaseInfo
      pstmt = c.prepareStatement("SELECT * FROM medcaseinfo WHERE id=?");
      pstmt.setInt(1, patientId);
      tmp = pstmt.executeQuery();
      MedCaseInfo caseinfo = null;
      while(tmp.next()) {
        //create medcaseinfo
        caseinfo = new MedCaseInfo(tmp.getString(2));
        record.setCaseInfo(caseinfo);
      }
      pstmt.close();
      // Get AdminInfo
      pstmt = c.prepareStatement("SELECT * FROM admininfo WHERE id=?");
      pstmt.setInt(1, patientId);
      tmp = pstmt.executeQuery();
      AdminInfo admininfo = null;
      while(tmp.next()) {
        admininfo = new AdminInfo();
        record.setAdminInfo(admininfo);
      }
      pstmt.close();
      // Get InternalInfo
      pstmt = c.prepareStatement("SELECT * FROM internalinfo WHERE id=?");
      pstmt.setInt(1, patientId);
      tmp = pstmt.executeQuery();
      InternalInfo internalinfo = null;
      while(tmp.next()) {
        internalinfo = new InternalInfo();
        record.setInternalInfo(internalinfo);
      }
      pstmt.close();
    }
    c.close();
    return record;
  }

  //API publica
  public MedRecord createNewRecord(int patientId) throws Exception {
    MedRecord m = get_rec(patientId);
    if (m == null) {
      m = new MedRecord(patientId);
      save_rec(m);
    }
    return m;
  }
  public MedRecord findRecord(int patientId) throws Exception {
    return get_rec(patientId);
  }
  public PatReport getPatReport(MedRecord record) throws Exception {
    return record.getPatReport();
  }
  public MedCaseInfo getMedCaseInfo(MedRecord record) throws Exception {
    return record.getMedCaseInfo();
  }
  public AdminInfo getAdminInfo(MedRecord record) throws Exception {
    return record.getAdminInfo();
  }
  public InternalInfo getInternalInfo(MedRecord record) throws Exception {
    return record.getInternalInfo();
  }
  public void updatePatReport(MedRecord record, PatReport report) throws Exception {
    record.setReport(report);
    save_rec(record);
  }
  public void updateMedCaseInfo(MedRecord record, MedCaseInfo caseInfo) throws Exception {
    record.setCaseInfo(caseInfo);
    save_rec(record);
  }
  public void updateAdminInfo(MedRecord record, AdminInfo info) throws Exception {
    record.setAdminInfo(info);
    save_rec(record);
  }
  public void updateInternalInfo(MedRecord record, InternalInfo info) throws Exception {
    record.setInternalInfo(info);
    save_rec(record);
  }

  public void runStatistics() {
    Connection c = getCon();
    PreparedStatement patst;
    // Receitas
    patst = c.prepareStatement("UPDATE set val=(SELECT sum(income) from internalinfo) where indicator=1");
    patst.executeUpdate();
    patst.close();
    // Despesas
    patst = c.prepareStatement("UPDATE set val=(SELECT sum(expense) from internalinfo) where indicator=2");
    patst.executeUpdate();
    patst.close();
    // Total pacientes
    patst = c.prepareStatement("UPDATE set val=(SELECT sum(*) from medcaseinfo) where indicator=3");
    patst.executeUpdate();
    patst.close();
    // Terceira Idade
    patst = c.prepareStatement("UPDATE set val=(SELECT sum(*) from patreport where age >= 65) where indicator=4");
    patst.executeUpdate();
    patst.close();
    c.close();
  }
  public IndicatorValue getStatisticsIndicator(int StatisticsIndicatorId) {
    Connection c = getCon();
    // Get MedRecord
    PreparedStatement pstmt = c.prepareStatement("SELECT * FROM statistics WHERE id=?");
    pstmt.setInt(1, StatisticsIndicatorId);
    ResultSet tmp = pstmt.executeQuery();
    IndicatorValue value = null;
    while(tmp.next()) { value = new IndicatorValue(tmp.getInt(1), tmp.getInt(2), tmp.getString(3)); }
    pstmt.close();
    c.close();
    return value;
  }

  //For testing purposes only
  public static void main(String [] args) throws Exception {

    // Criar o sistema HMS
    HMS HMS = new HMS();

    // Tentar encontrar o Record do paciente 1337
    MedRecord pat1337 = HMS.findRecord(1337);

    // Se nao existir, vamos criar
    if (pat1337 == null) pat1337 = HMS.createNewRecord(1337);

    // Tentar encontrar o PatReport do paciente 1337
    // Se nao existir, vamos criar
    if (pat1337.getPatReport() == null) {
      PatReport p = new PatReport("Manel Carlos",0,69);
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
