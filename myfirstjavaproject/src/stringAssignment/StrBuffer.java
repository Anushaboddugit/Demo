package stringAssignment;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("StringBuffer ");
		sb.append("is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings.");
		System.out.println(sb);
		StringBuffer text=new StringBuffer("It is used to _ at the specified index position");
		text.replace(14,15,"insert text");
		System.out.println(text);
		StringBuffer obj=new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(obj.reverse());
	
	}

}
