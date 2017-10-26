package uebung_2_1;

public class PqFormel {

	public static void main(String[] args) {
		double p=5;
		double q=4;
		
		double unterderwurzel = ((p/2)*(p/2)-q);
		double vorderwurzel = (-1*(p/2));

		double x1 = vorderwurzel+unterderwurzel;
		double x2 = vorderwurzel-unterderwurzel;
		
		System.out.println("x1 = "+ x1);
		System.out.println("x2 = "+ x2);
	}

}
