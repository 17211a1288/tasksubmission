package epam;

public class DRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat catt=new cat();
		catt.eat();
		catt.meow();
		dog dogg=new dog();
		dogg.eat();
		dogg.bow();
	}

}