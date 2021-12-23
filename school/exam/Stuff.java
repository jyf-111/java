public abstract class Stuff {
	private long id;//ID号
	String no;//编号
	String name;/*名字*/
	int age;//年龄
	char gender;//性别，男m,女f
	public abstract void print();
	public long id(long a) {
		id=a;
		return a;
	}
}
	  class Student extends Stuff{
		private String major;
		private long B;
		public Student(String a,long b){
			major=a;
			B=id(b);
			
		}
		public void print() {
			System.out.println(name+":"+B+","+no+","+gender+","+major);
		}

}
	  class Teacher extends Stuff{
		private String title;
		private long B;
		public Teacher(String a,long b){
			title=a;
			B=id(b);
		}
		public void print() {
			System.out.println(name+":"+B+","+no+","+gender+","+title);
		}
}
	  class Executive extends Stuff{
			private String position;
			private long B;
			public Executive(String a,long b){
				position=a;
				B=id(b);
			}
			public void print() {
				System.out.println(name+":"+B+","+no+","+gender+","+position);
			}
	}
class University{
	public static void main(String args[]) {
    Student SBY=new Student("economy",200855314);
	Teacher LL=new Teacher("Professor",2020202);
    Executive LSJ=new Executive("counselor",2122121);
	SBY.no="No.1";
	SBY.name="SBY";
	SBY.age=18;
	SBY.gender='f';
	SBY.print();
	System.out.print("Hello,World");


	}
}
	


