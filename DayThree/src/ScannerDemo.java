import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr = new Scanner(System.in);
		Person p = new Person();
		System.out.println("Enter name\n");
		String name = sobjr.nextLine();
		
		System.out.println("Enter Gender\n");
		String gender = sobjr.next();
		System.out.println("Enter your Age\n");
		//sobjr.nextLine();
		int age = sobjr.nextInt();
		System.out.println("Enter your income\n");
		int income = sobjr.nextInt();
		int tax =0;
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
//		p.setTax(6);
		
		TaxPay tx = new TaxPay();
		if(age>60 || gender.equalsIgnoreCase("Female")) {
			if(income<250000) {
				tx.calTax(p);
			//	System.out.println(p.getTax());
			}else if(income>=250000 && income<700000) {
				tx.calTax(p);
			//	System.out.println(p.getTax());
			}else if(income>=700000 && income<900000) {
				tx.calTax(p);
			//	System.out.println(p.getTax());
			}else {
				tx.calTax(p);
			//	System.out.println(p.getTax());
			}
		}
		//p.setTax(tax);
     System.out.println(p);
	}

}
