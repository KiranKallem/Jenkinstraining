package FirstJenkinsJob.SampleAppJenkins;

public class Test2 
{
	String sName;
	int slno;
	
	public Test2(String name,int num)
	{
		sName=name;
		slno=num;
	}
	public void print(String s,int n)
	{
		System.out.println("name of student - "+s);
		System.out.println("name of student - "+n);
	}

	public static void main(String[] args)
	{
		Test2 s1=new Test2("kiran", 5);
		s1.print(s1.sName,s1.slno);
		Test2 s2=new Test2("vardhan", 4);
		s2.print(s2.sName,s2.slno);
		Test2 s3=new Test2("archana", 2);
		s3.print(s3.sName,s3.slno);
	}

}
