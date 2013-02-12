package code;

public class Teller {

	private OpenAccountHandler openAccountRequest;
	private WithdrawMoneyHandler withdrawMoneyRequest;
	private DepositMoneyHandler depositMoneyRequest;

	public Teller(OpenAccountHandler openAccountRequest,
			WithdrawMoneyHandler withdrawMoneyRequest,
			DepositMoneyHandler depositMoneyRequest) {
		this.openAccountRequest = openAccountRequest;
		this.withdrawMoneyRequest = withdrawMoneyRequest;
		this.depositMoneyRequest = depositMoneyRequest;
	}

	public boolean openAccount(String string) {
		return openAccountRequest.openAccount(string);
	}

	public boolean withdraw(Integer accountTested, Integer sumTested) {
		return withdrawMoneyRequest.withdraw(accountTested, sumTested);
	}
	
	public boolean deposit(Integer accountTested, Integer sumTested) {
		return depositMoneyRequest.deposit(accountTested, sumTested);
	}

}
