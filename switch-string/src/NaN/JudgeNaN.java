package NaN;

public class JudgeNaN {
	public static void main(String[] args) {
		double d = 12.345D;
		if( !Double.isNaN(d)){
			System.out.println("double���͵�d����nan");
		}
		if(d==Double.NaN){
			System.out.println("��nan");
		}
		Float f= new Float(12.3F);
		System.out.println(Float.isNaN(f));
		
		String flo= Float.toHexString(f);
		System.out.println(flo);
		Float f1 = Float.NaN;
		Float f2 = Float.NaN;
		System.out.println( f1==f2 );
		System.out.println( f1.equals(f2) );
	}
}
