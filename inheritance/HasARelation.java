package inheritance;

class basics
{
int math,phys,eng;
public void marks(int math, int phys, int eng)
{
	this.math=math;
	this.phys=phys;
	this.eng=eng;
	
}
}

class student
{
int rno;
basics b;
public void info(int rno, basics b)
{
System.out.println("Roll number = "+rno);
System.out.println("Marks = "+b.math+' '+b.phys+' '+b.eng);
}

}
public class HasARelation {

	public static void main(String[] args) {
		basics b=new basics();
		b.marks(32,31,43);
		student s=new student();
		s.info(1, b);
		

	}

}
