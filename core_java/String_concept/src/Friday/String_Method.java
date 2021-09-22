package Friday;

public class String_Method {

	public static void main(String[] args) {
	
		String s = "Rakhi";
		String s1 = "Rakhi";
		String s2 = "Palke";
		
		System.out.println("Upper Case");
		System.out.println(s.toUpperCase());
		System.out.println("Lower Case");
		System.out.println(s.toLowerCase());
		
		//trim method
		System.out.println("------------");
		System.out.println("---Trim method---");
		
		String s3 = " Edubridge ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		System.out.println("------------");
		System.out.println("---Starts and ends with method---");
		
		System.out.println(s.startsWith("Ra"));
		System.out.println(s.endsWith("i"));
		
		System.out.println("-------------");
		System.out.println("---CharAt method---");
		
		System.out.println(s2.charAt(2));
		
		System.out.println("-------------");
		System.out.println("---length method---");
		
		System.out.println(s3.length());
		
		System.out.println("--------------");
		System.out.println("---Intern method---");
		
		String ss = new String("India");
		String s4 = ss.intern();
		System.out.println(s4);
		
		System.out.println("-------------");
		System.out.println("---valueOf method---");
		
		int a = 5;
		String sss = String.valueOf(a);
		System.out.println(sss+5);
		
		System.out.println("-------------");
		System.out.println("---replace method---");
		
		String n = "Java is Programming language.";
		String replaceString = n.replace("Java", "Python");
		System.out.println(replaceString);
		
		System.out.println("-------------");
		System.out.println("---string concate operator---");
		
		String b = "Sachin"+"Tendulkar";
		System.out.println(b);
		
		System.out.println("-------------");
		System.out.println("---concate method---");
		
		String d = s1.concat(s2);
		System.out.println(d);
		
		System.out.println("-------------");
		System.out.println("---equals method---");
	
		System.out.println(s1.equals(s2));
		System.out.println(s.equals(s3));
		
		System.out.println("-------------");
		System.out.println("--- == opetaror---");
		
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		
		System.out.println("-------------");
		System.out.println("---compareTo method---");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		
		System.out.println("-------------");
		System.out.println("---replaceAll method---");
		
		String ReplaceString = n.replaceAll("a", "e");
		System.out.println(ReplaceString);
		
		System.out.println("-------------");
		System.out.println("---split method---");
		
		String[]words = n.split("\\s");
		for(String w:words){
			System.out.println(w);
		}
		
		System.out.println("Returning words:");
		for(String w:n.split("\\s",0)){
			System.out.println(w);
		}

	}

}
