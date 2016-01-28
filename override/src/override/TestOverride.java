package override;

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SBI S = new SBI();
     ICICI I = new ICICI();
     AXIS A = new AXIS();
     System.out.println("RATE OF INTEREST GIVEN BY SBI IS:" +S.getRateofInterest());
     System.out.println("RATE OF INTEREST GIVEN BY ICICI IS:" +I.getRateofInterest());
     System.out.println("RATE OF INTEREST GIVEN BY AXIS IS:" +A.getRateofInterest()); 
	}

}
