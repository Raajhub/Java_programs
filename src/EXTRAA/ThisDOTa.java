package EXTRAA;

//public class ThisDOTa implements test
//{
//	public static void main(String[] args) {
//		Testing tda = new Testing();
//		tda.getSum(3, 5);
//	ThisDOTa ob = new ThisDOTa();
//	ob.draw();
//	}
//
//	@Override
//	public void draw() {
//		System.out.println("ex drawing");
//		
//		
//	}
//}

// class Testing implements test
//{
// private int a= 4;
// private int b= 1;
// 
// void getSum(int a, int b)
// {
//	 this.a = a;
//	 this.b = b;
//	 
//	 System.out.println(this.a+this.b);
// }
//
//@Override
//public void draw() {
//	System.out.println("testing drawing");
//	
//	Testing t = new Testing();
//	t.draw();
//	
//}

public class ThisDOTa extends Pen
{

	@Override
	void write() {
		System.out.println("hero writing ");
		
	}
	public static void main(String[] args) {
		ThisDOTa he = new ThisDOTa();
		he.write();
		System.out.println(he.price(25));
		
	}
	
}

