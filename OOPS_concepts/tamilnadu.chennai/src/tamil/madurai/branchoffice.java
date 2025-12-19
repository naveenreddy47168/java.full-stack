package tamil.madurai;

import tamilnadu.chennai.office;

public class branchoffice extends office{
	public static void main(String[] args) {
		branchoffice Off = new branchoffice();
		Off.work();

		Off.hallowinparty();
		Off.celebratelocalfunction();
	}

	public void work() {
		System.out.println("working");
	}

	void celebratelocalfunction() {
		System.out.println("celebrating..");
	}

	protected void hallowinparty() {
		System.out.println("celebrating hallowin");
	}
}
