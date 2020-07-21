package iches.science.chapter8;

public class IdolArrayTest {
	public static void main(String[] args) {
		
	Idol[] idols = {new Idol("¼Ò³à½Ã´ë","ÅÂ¿¬"),new Idol("¾¾¾²Å¸","º¸¶ó"),new Idol("ºò¹ð","Áöµå·¡°ï"),new Idol("ºñ½ºÆ®","¾ç¿ä¼·")};
	for(Idol idol: idols) {
		System.out.println(idol.getGroup() + " : " + idol.getName());
	}
	}
}
