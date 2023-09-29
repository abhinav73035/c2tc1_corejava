
public class TaxPay {
	//Person p = new Person();
	
void calTax(Person p) {
	if(p.getIncome()<250000) {
		 p.setTax(0);
		// return p.getTax();
	}else if(p.getIncome()>=250000 && p.getIncome()<700000) {
		p.setTax(250000*5/100);
		// return p.getTax();
	}else if(p.getIncome()>=700000 && p.getIncome()<900000) {
		p.setTax(700000*10/100);
		//return p.getTax();
	}else {
		p.setTax(900000*15/100);
	//	return p.getTax();
	}
}
}
