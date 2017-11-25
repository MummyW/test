package chars;

/**
 * @author apple
 *
 */
public class Unicode {
	public static void main(String[] args) {
		char c = '\u2122';
		char c1 = '\u03c0';//π
		char c2 = '\u0008';//退格
		char c3 = '\u0009';//回车
		System.out.println(c);
		System.out.println(c1);
		char c4='3';
		System.out.println(Character.isJavaIdentifierPart(c2));
		System.out.println("java的运行平台版本是java2"+c2+"java是1995年末发布的");
		System.out.println("java的特性有"+c3+"简单,安全,多线程,面向对象,分布式,健壮性提醒结构中立");
		final char c5='π';
		System.out.println(c5);
		char c6=new Character('π');
		System.out.println(c5==c6);
		
		Character c7 = new Character('π');
		System.out.println(c6==c7);
	}
	
}
