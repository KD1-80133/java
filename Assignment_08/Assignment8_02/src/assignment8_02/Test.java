package assignment8_02;

class Box<T>
{
	private T data;
	public void set(T val)
	{
		this.data=val;
	}
	public T get()
	{
		return this.data;
	}
}
public class Test {
	public static void printDisplayableBox(Box<? extends Displayable> b)
	{
		b.get().acceptData();
		b.get().displayData();
	}
	public static void printBox(Box<?> b)
	{
		System.out.println(b.get().toString());
	}

	public static void main(String[] args) {
		Box<Person> P=new Box<>();
		P.set(new Person("name",20));
		printDisplayableBox(P);
		
		Box<Date> D=new Box<>();
		D.set(new Date());
		printDisplayableBox(D);
		
		printBox(P);
		printBox(D);
		
		
	}

}
