package administration;

import administration.OperatorTools.UnimplementedToolException;

public class Operator{
	private OperatorTools systemOnOff;

	public Operator(){
		systemOnOff = new SystemOnOff();
		
		try {
			systemOnOff.startSystem();
		} catch (UnimplementedToolException e){
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args){
		new Operator();
	}
	
}
