package org.strongme.walter.springidol;

public class Stage {
	
	private Stage(){}
	
	//lazily load instance 
	private static class StageSingletonHolder {
		static Stage instance = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}
}
