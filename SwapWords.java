package corejava.strings;

public class SwapWords {

	public static void main(String[] args) {
		String swp1 = "One";
		String swp2 = "Two";
		String temp="";
		System.out.println("Before swapping swp1= "+swp1+" swp2= "+swp2);
		temp=swp1;
		swp1=swp2;
		swp2=temp;
		System.out.println("After swapping swp1= "+swp1+" swp2= "+swp2);
	}

}
