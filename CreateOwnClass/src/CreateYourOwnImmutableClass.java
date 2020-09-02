
final public class CreateYourOwnImmutableClass {

	private int i;

	public CreateYourOwnImmutableClass(int i) {
		this.i = i;
	}

	public CreateYourOwnImmutableClass modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new CreateYourOwnImmutableClass(i);
		}
	}

	public static void main(String[] args) {
		CreateYourOwnImmutableClass ci = new CreateYourOwnImmutableClass(10);
		CreateYourOwnImmutableClass ci1 = ci.modify(100);
		CreateYourOwnImmutableClass ci2 = ci.modify(10);

		System.out.println(ci == ci1);
		System.out.println(ci == ci2);

	}

}
