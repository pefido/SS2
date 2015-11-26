package HMS;

public class InternalInfo {

  private int expense;
  private int income;

  public InternalInfo(int expense, int income){
    this.expense = expense;
    this.income = income;
  }

  public int getExpense(){
  	return expense;
  }

  public void setExpense(int expense){
  	this.expense = expense;
  }

  public int getIncome(){
  	return income;
  }

  public void setIncome(int income){
  	this.income = income;
  }
}