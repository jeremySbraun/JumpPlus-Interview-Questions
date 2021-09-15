package MethodOverrideExample;

public class RedLightSaber extends LightSaber {

	
	public RedLightSaber() {
		super();
	}
	
	@Override
	public void printColor() {
		System.out.println("This lightsaber is red!");
	}
}
