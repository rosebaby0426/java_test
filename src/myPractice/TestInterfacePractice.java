package myPractice;

interface Some {
	void execute();

	void doSome();
}

public class TestInterfacePractice implements Some {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("execute()");

	}

	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		System.out.println("doSome()");
	}

}
