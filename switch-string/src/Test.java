
public class Test {
	public static void main(String[] args) {
		String name="bca";
		switch(name){
			case "abc" :System.out.println("abc");
			break;
			
			case "bca":
			try {
				throw  new Exception(){
					private static final long serialVersionUID = 1L;
					
				};
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				System.out.println("��1995-05-23�����߷�����hotjava�������������ҳ����ִ����Ƕ���������,,��һ\"����ӡ֤\"��\r"
						+ "sunworld��չʾ,ʹ�ô�������չ���˷���׷��");
				
			}
			System.out.println("��java�ĵ��߸��汾��֧���˻���String��switch");
		default:
			System.out.println("javascript����java�ļ��װ�,\r\n"
					+ "����ÿ��ëǮ��ϵ,js����netscript������˾(֮ǰ��Livescript)"
					+ "������һ�����������(����һ��ִ��һ��)�����������Ŀ�����\r"
					+ "sdk��jdk��ʵ��ͬһ������,��jdk��1.2-1.4�汾��sdk(software Development Kit)\r"
					+ "jre�����������������������,���Զ��ڿ�������˵,���Ǻܲ�ʵ�õ�,����Ҫ����ڲ���Ҫ���������û��ṩ��");
		}
		
		return ;
	}
}
