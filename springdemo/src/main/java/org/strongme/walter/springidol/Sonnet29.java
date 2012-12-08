package org.strongme.walter.springidol;

public class Sonnet29 implements Poem {
	
	private static String[] LINES = {
		"When,indisgracewithfortuneandmen'seyes,",
		"I allalonebeweepmyoutcaststate",
		"Andtroubledeafheavenwithmybootlesscries",
		"Andlookuponmyselfandcursemyfate,",
		"Wishingmeliketoonemorerichinhope,",
		"Featuredlikehim,likehimwithfriendspossess'd,",
		"Desiringthisman'sartandthatman'sscope,",
		"WithwhatImostenjoycontentedleast;",
		"Yetinthesethoughtsmyselfalmostdespising,",
		"HaplyIthinkonthee,andthenmystate,",
		"Liketothelarkatbreakofdayarising",
		"Fromsullenearth,singshymnsatheaven'sgate;",
		"Forthysweetloveremember'dsuchwealthbrings",
	"ThatthenIscorntochangemystatewithkings."};
	
	public Sonnet29() {
	}

	public void recite() {
		for(String line : LINES){
			System.out.println(line);
		}
	}

}
