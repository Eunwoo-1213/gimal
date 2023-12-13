public class Student {
	//멤버 변수 (필드) = 객체 속성
	String name; // 이름
	int korean; // 국어
	int english; // 영어
	int math; // 수학
	double avg; // 평균

	//생성자 = 객체 생성 시 객체를 초기화 시켜주는 역할
	public Student(String name,int korean, int english, int math ) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		
	}
	
	
	
	// 메소드 = 객체 동작
	public void average() {
		avg = (korean + english + math) / 3.0;
		System.out.println("평균 점수는" + avg + "입니다.");
		
	}
	
	public char showGrade() { 
		char grade = ' ';
		if(avg >=90 ) grade = 'A';
		else if(avg >=80) grade = 'B';
		else if(avg >=70) grade = 'C';
		else if(avg >=60) grade = 'D';
		else grade = 'F';
		return grade;
	}
----------------------------------------------------------------------------


public class StudentTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("학생수를 입력하세요");
		int num = s.nextInt();

		Student student[] = new Student[num];

		for (int i = 0; i < student.length; i++) {
			System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
			String name = s.next();
			int ko = s.nextInt();
			int en = s.nextInt();
			int ma = s.nextInt();

			student[i] = new Student(name, ko, en, ma);
			student[i].average();
			student[i].showGrade();
			System.out.println("등급은" + grade + "입니다." );
		}
	}

}

