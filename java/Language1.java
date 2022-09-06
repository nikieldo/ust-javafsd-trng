package abstract_prgms;
interface Language1 {
	void getName(String name);
}
class ProgrammingLanguage implements Language1 {
	public void getName(String name) {
		System.out.println("programming language:" +name);
	}
}

class Main99 {
	public static void main(String[] args) {
		ProgrammingLanguage language=new ProgrammingLanguage();
		language.getName("java");
	}

}
