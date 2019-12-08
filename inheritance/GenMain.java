
public class GenMain
{
	public static void main(String[] args)
	{
		//FirstGen fg=new FirstGen();
		//fg.call();
		//fg.msg();
		//SecGen sg=new SecGen();
		//sg.call();
		//sg.msg();
		//sg.radio();
		//ThirdGen tg=new ThirdGen();
		//tg.call();
		//tg.msg();
		//tg.radio();
		//tg.camera();
		
		FirstGen fg=new ThirdGen();
		fg.call();
		fg.msg();
		
		SecGen sg=new ThirdGen();
		sg.call();
		sg.msg();
		sg.radio();
		
		
	}
}
