
public class CreateYourOwnSingleTonClass {

	private static CreateYourOwnSingleTonClass stc = new CreateYourOwnSingleTonClass();

	private CreateYourOwnSingleTonClass() {
		System.out.println("creating----");

	}

	public static CreateYourOwnSingleTonClass getCreateYourOwnSingleTonClass() {
		return stc;
	}

	public static void main(String[] args) {

		CreateYourOwnSingleTonClass stc1 = CreateYourOwnSingleTonClass.getCreateYourOwnSingleTonClass();
		CreateYourOwnSingleTonClass stc2 = CreateYourOwnSingleTonClass.getCreateYourOwnSingleTonClass();
		System.out.println(stc1 == stc2);

	}

}
