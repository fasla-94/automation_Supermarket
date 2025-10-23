package utilities;

import com.github.javafaker.Faker;


public class FakeUtility {
	Faker fake=new Faker();
	public String firstName()
	{
		return fake.name().firstName();
	}
	
	public String password()
	{
		return fake.internet().password();
	}
	
	
}
