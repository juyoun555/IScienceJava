package iches.science.chapter8;

public class IdolArrayTest {
	public static void main(String[] args) {
		
	Idol[] idols = {new Idol("�ҳ�ô�","�¿�"),new Idol("����Ÿ","����"),new Idol("���","���巡��"),new Idol("��Ʈ","��伷")};
	for(Idol idol: idols) {
		System.out.println(idol.getGroup() + " : " + idol.getName());
	}
	}
}
