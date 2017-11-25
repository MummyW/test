
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
				System.out.println("在1995-05-23开发者发布让hotjava浏览器具有在网页中有执行内嵌代码的能力,,这一\"技术印证\"在\r"
						+ "sunworld上展示,使得大量的人展开了疯狂的追逐");
				
			}
			System.out.println("在java的第七个版本中支持了基于String的switch");
		default:
			System.out.println("javascript不是java的简易版,\r\n"
					+ "两者每半毛钱关系,js是由netscript网景公司(之前交Livescript)"
					+ "开发的一款编译型语言(编译一句执行一句)编译程序生成目标代码\r"
					+ "sdk和jdk其实是同一个东西,在jdk的1.2-1.4版本叫sdk(software Development Kit)\r"
					+ "jre包含了虚拟机不包含编译器,所以对于开发者来说,这是很不实用的,它主要针对于不需要编译器的用户提供的");
		}
		
		return ;
	}
}
