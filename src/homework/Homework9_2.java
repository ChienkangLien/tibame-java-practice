package homework;

public class Homework9_2 {
	public static void main(String[] args) {
		Account account = new Account();
		Brown brown = new Brown(account);
		Mom mom = new Mom(account);

		Thread tBrown = new Thread(brown);
		Thread tMom = new Thread(mom);

		tMom.start();
		tBrown.start();
	}
}

class Account {
	private int balance=0;

	public void withdraw() {
		if (Brown.noticed) {
			System.out.println("熊大被媽媽告知已經有錢");
			Brown.noticed = false;
		}
		if (balance > 0) {
			balance -= 1000;
			System.out.println("熊大領了1000，帳戶共有:" + balance);
			notify();
		}

		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			Mom.noticed = true;
			notify();
		}

		if (balance == 0) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			Mom.noticed = true;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void deposit() {
		if (Mom.noticed) {
			System.out.println("媽媽被熊大要求匯款!");
			Mom.noticed = false;
		}

		balance += 2000;
		System.out.println("媽媽存了2000，帳戶共有:" + balance);
		notify();

		if (balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			Brown.noticed = true;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Brown extends Role implements Runnable {
	Account account;
	static boolean noticed = false; //判斷有無被通知

	public Brown(Account account) { //代表兩人共用一個account物件
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			tab:for (int i = 1; i <= 10; i++) {
				if (ifDone) {
					account.withdraw();
					System.out.println("媽媽存錢次數已達上限，沒零用錢領了");  //其中一方達到次數上限觸發ifDone，讓對方執行迴圈直接break脫離，以避免死結
					break tab;
				}
				if (i == 10) {
					ifDone = true;
				}
				account.withdraw();
			}
		}
	}
}

class Mom extends Role implements Runnable {
	Account account;
	static boolean noticed = false; //判斷有無被通知

	public Mom(Account account) { //代表兩人共用一個account物件
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			tab:for (int i = 1; i <= 10; i++) {
				if (ifDone) {
					System.out.println("熊大領錢次數已達上限，媽媽也不再給零用錢了"); //其中一方達到次數上限觸發ifDone，讓對方執行迴圈直接break脫離，以避免死結
					break tab;
				}
				if (i == 10) {
					ifDone = true;
				}
				account.deposit();
			}
		}
	}

}

class Role {
	public static boolean ifDone = false; //讓熊大跟媽媽繼承這個類別共用類別資料，來判斷是哪一方先達到領存錢次數上限
}
