package knight.exam;

import java.util.Scanner;

public class JavaBeanSubject {

	int math = 0;

	public int math() {

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("�������� �Է����ּ���. ������ 0~100");
			math = scan.nextInt();
		}

		while (math < 0 || math > 100);

		System.out.println("���������� : " + math);

		return math;

	}

	@Override
	public String toString() {

		return "JavaBeanSubject [���������� : " + math + "]";

	}

}
