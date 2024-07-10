package Basicjava;
interface Google
{
	void logingoogle();
	void googleauth();
}
interface facebook
{
	void loginfacebook();
	void facebook_auth();
}
public class Intrfce implements Google, facebook
{

	public static void main(String[] args) 
	{
         Intrfce I =new Intrfce();
         I.logingoogle();
         I.googleauth();
         I.loginfacebook();
         I.facebook_auth();
         
	}

	@Override
	public void logingoogle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void googleauth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginfacebook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void facebook_auth() {
		// TODO Auto-generated method stub
		
	}

}
