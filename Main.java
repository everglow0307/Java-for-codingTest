import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("정지수","1414");
		Student st2 = new Student("보리","1616");
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		
		for(Student stu:list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			boolean flag = false;
			System.out.print("검색창 :");
			String name = scan.next();
			
			for(Student stu:list) {
				if(stu.getName().equals(name)) {
					System.out.println(name+"학생의 학번은 "+stu.getNo()+"입니다.");
					flag = true;
				}
			}
			
			if(!flag) {
				System.out.println("해당하는 학생이름이 없습니다.");
			}
			
			System.out.println("계속 검색하고 싶으면 y,종료하고 싶으면 n");
			String input = scan.next();
			if(input.equals("n")) {
				break;
			}else if(!input.equals("y")) {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
