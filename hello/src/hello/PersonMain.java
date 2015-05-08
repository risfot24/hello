package hello;

class Person2{
	private String name;
	private int age;
	private double height ;
	private String blood;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	
	
	
}





public class PersonMain {

	public static void main(String[] args) {
    Person2 soo = new Person2();
    
      soo.setName("±èÃ¶¼ö");
      soo.setAge(30);
      soo.setHeight(172.5);
      soo.setBlood("B");
	}

	private static void print(Person2 soo)
	{
		System.out.println("ÀÌ¸§ :  "+soo.getName());
		System.out.println("³ªÀÌ : "+soo.getAge());
		System.out.println("Å° : "+soo.getHeight());
		System.out.println("Ç÷¾×Çü  "+soo.getBlood());
		
		
		
	}
	
	
	
}
