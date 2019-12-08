
public class QspidersMain
{
	public static void main(String[] args) 
	{
		Qspiders hebbal=new Qspiders();
		hebbal.swipe();
		hebbal.swipe();
		Qspiders btm=new Qspiders();
		btm.swipe();
		System.out.println(hebbal.branchCount);
		System.out.println(btm.branchCount);
		System.out.println(Qspiders.totalCount);
	}
}
