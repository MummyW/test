package chars;

/**
 * @author apple
 *
 */
public class Unicode {
	public static void main(String[] args) {
		char c = '\u2122';
		char c1 = '\u03c0';//��
		char c2 = '\u0008';//�˸�
		char c3 = '\u0009';//�س�
		System.out.println(c);
		System.out.println(c1);
		char c4='3';
		System.out.println(Character.isJavaIdentifierPart(c2));
		System.out.println("java������ƽ̨�汾��java2"+c2+"java��1995��ĩ������");
		System.out.println("java��������"+c3+"��,��ȫ,���߳�,�������,�ֲ�ʽ,��׳�����ѽṹ����");
		final char c5='��';
		System.out.println(c5);
		char c6=new Character('��');
		System.out.println(c5==c6);
		
		Character c7 = new Character('��');
		System.out.println(c6==c7);
	}
	
}
