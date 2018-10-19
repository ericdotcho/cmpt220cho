
public class Bond {
	double coupon;
	int payments;
	double interest;
	double valueMaturity;
	
	Bond() {
		coupon = 10;
		payments = 2;
		interest = 2;
		valueMaturity = 2000;
	}
	Bond (double newCoupons, int newPayments, double newInterest, double newVM) {
		coupon = newCoupons;
		payments = newPayments;
		interest = newInterest;
		valueMaturity = newVM;
	}
	double getPrice() {
		double a = 1 + interest;
		int denom = (int)Math.pow(a, interest);
		return coupon * (1 - (1 / denom)) + valueMaturity * (1 / denom);
	}
}
