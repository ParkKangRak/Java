package knight.exam;

import java.util.Scanner;

public class JavaBeanSubject {

	int math = 0;

	public int math() {

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("수학점수 입력해주세요. 범위는 0~100");
			math = scan.nextInt();
		}

		while (math < 0 || math > 100);

		System.out.println("수학점수는 : " + math);

		return math;

	}

	@Override
	public String toString() {

		return "JavaBeanSubject [수학점수는 : " + math + "]";

	}

}
