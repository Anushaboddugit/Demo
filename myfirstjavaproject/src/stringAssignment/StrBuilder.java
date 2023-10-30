package stringAssignment;

public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("StringBuilder ");
		sb.append("is a peer class of String ");
		sb.append("that provides much of ");
		sb.append("the functionality of strings.");
		System.out.println(sb);
		StringBuilder text=new StringBuilder("It is used to _ at the specified index position");
		text.replace(14,15,"insert text");
		System.out.println(text);
		StringBuilder obj=new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(obj.reverse());
	}

}

