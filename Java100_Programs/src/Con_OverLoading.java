
public class Con_OverLoading {
	int BoxNo;
	double height, width, depth;

	Con_OverLoading(int b, double h, double w, double d) {
		this.BoxNo = b;
		this.height = h;
		this.width = w;
		this.depth = d;
		System.out.println((this.BoxNo) + (this.height) + (this.width) + (this.depth));

	}

	Con_OverLoading() {
		width = height = depth = 0;
		System.out.println("Calling Secong Constructor");
	}

	Con_OverLoading(int num) {
		//this();
		BoxNo = num;
		System.out.println("Third Constructor " + num);
	}

	public static void main(String[] args) {

		Con_OverLoading CO = new Con_OverLoading(10);
		Con_OverLoading CO1 = new Con_OverLoading();
		Con_OverLoading CO2 = new Con_OverLoading(10, 2.2, 3.5, 0.22);

	}

}
