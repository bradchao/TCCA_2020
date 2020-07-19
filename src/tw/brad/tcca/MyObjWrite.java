package tw.brad.tcca;

public class MyObjWrite {

	public static void main(String[] args) {
		Student s1 = new Student(80, 70, 60);
		Student s2 = new Student(87, 77, 64);
		System.out.println(s1.score());
		System.out.println(s1.avg());
	}
}

class Student {
	private int ch, eng, math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng = eng; this.math = math;
	}
	int score() {return ch + eng + math;}
	double avg() {return score()/3.0;}
}
