import java.util.*;

public class CYOADriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What name would you like to give the narrator?");
		String name = input.next();
		CYOAObject O = new CYOAObject(name);
		O.play();
	
	}

}
