package java11;
interface demo{
	public int add(int a,int b);
}
public class Var {
//	var a=12;
	public static void main(String[] args) {
//		var a;//must be initialized because the compiler doesn't know
		demo d=(var a,var b)->a+b;
		int res=d.add(1,2);
		System.out.println(res);
		
	}

}
