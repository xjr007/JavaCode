public class ZooGiftShop {
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}

	/*interface SaleTodayOnly {	same as decl. abstract class
		int dollarsOff();
	}*/

	public int admission(int basePrice, SaleTodayOnly sale) {
		SaleTodayOnly sale1 = new SaleTodayOnly() {
			int dollarsOff() { return 3; }
		};
		//	public int dollarsOff() { return 3; }	interfaces require public methods

		return basePrice - sale.dollarsOff();
	}

	public int pay() {
		return admission(5, new SaleTodayOnly() {
			public int dollarsOff() { return 3; }
		});
	}
}
