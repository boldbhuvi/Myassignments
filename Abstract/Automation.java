package Abstract;

public class Automation extends MultipleLangauge implements Language{

	public void java() {
		// TODO Auto-generated method stubs
		//System.out.println("Java is easy");
		
	}

	@Override
	public void ruby() {
		System.out.println("Java is easy");
		
	}
	public static void main(String[] args) {
		Automation access=new Automation();
		access.java();
		access.python();
		access.ruby();
	}

}
