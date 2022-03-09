package Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("bankrepo")
public class BankAccountrepositoryImpl implements BankAccountRepository {

    private BankAccount1 bankAccount1;
    private BankAccount1 bankAccount2;

    public BankAccount1 getBankAccount1() {
		return bankAccount1;
	}

    @Autowired
	public void setBankAccount1(BankAccount1 bankAccount1) {
		this.bankAccount1 = bankAccount1;
	}


	public BankAccount1 getBankAccount2() {
		return bankAccount2;
	}

	@Autowired
	public void setBankAccount2(BankAccount1 bankAccount2) {
		this.bankAccount2 = bankAccount2;
	}



  
    @Override
    public double getBalance(long accountId) {

        if(this.bankAccount1.getAccountId()==accountId){
           return bankAccount1.getAccountBalance();
        }
        else{
           return  bankAccount2.getAccountBalance();
        }

    }

    @Override
    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.bankAccount1.getAccountId()==accountId){
             updatedBal = newBalance;
             bankAccount1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             bankAccount2.setAccountBalance(updatedBal);
         }

        return updatedBal;
    }
}