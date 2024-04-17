interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {
	public float rateOfInterest() {
		return 9.00f;
	}
}

class Inface {
	public static void main(String [] args) {
		Bank b = new PNB();
		System.out.println("ROI : "+b.rateOfInterest());
	}
}