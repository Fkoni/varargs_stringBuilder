package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		String str = "Ali Can";
		
		@SuppressWarnings("unused")
		String str2= new String("Veli Cem");
		
		
		StringBuilder sb = new StringBuilder("Yasasin Java");
		
		sb.append("!!!");
		
		System.out.println(sb); 
		
		sb.toString().toUpperCase();
		
		System.out.println(sb); 
		
		
		
		

	}

}