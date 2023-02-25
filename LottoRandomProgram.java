package part2.ex2.topdown;

import java.util.Scanner;

public class LottoRandomProgram {
	Scanner scan = new Scanner(System.in);
	int[][] array = null;
	int create = 0;
	int tmp = 0;

	public void mainLotto() {
		System.out.println("    ����������������������������������������");
		System.out.println("    ��  Lotto���� ���α׷�   ��");
		System.out.println("    ����������������������������������������");
		System.out.println("\t1. ��ȣ �ڵ����� ");
		System.out.println("\t2. ��ȣ �������� ");
		System.out.println("\t3. ��ȣ Ȯ�� ");
		System.out.println("\t4. ���� ");
		int menu = scan.nextInt();
		if (menu == 1) {
			System.out.println("������ ������ �Է��ϼ���.");
			create = scan.nextInt();

//			new LottoProgram().inputAutoLotto(create);
			inputAutoLotto();
		} else if (menu == 2) {
			inputSelfLotto();
		} else if (menu == 3) {
			checkNumLotto();
		} else {
			end();
		}

	}

	public void inputAutoLotto() {

		array = new int[create][];

		for (int i = 0; i < array.length; i++) {
			array[i] = new int[6];
			for (int j = 0; j < 6; j++) {
				array[i][j] = (int) (Math.random() * 45) + 1;
				for (int l = 0; l < j; l++) {
					if (array[i][j] == array[i][l]) {
						return;
					}
//						1 /00,00
//						2 /00,01 ��
//						3 /00,01,02 �� 01,02 ��
//						4 /00,01,02,03 �� ,01,02,03 ��, 02,03 ��				    
//						
//						
				}
			}

		}

		for (

				int j = 0; j < array.length; j++) {

			for (int l = 0; l < 5; l++) {
				for (int k = 1 + l; k < 6; k++) {

					if (array[j][l] > array[j][k]) {
						tmp = array[j][l];
						array[j][l] = array[j][k];
						array[j][k] = tmp;
					}

				}

			}
		}

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < 6; j++) {

			}

		}

		checkNumLotto();

	}

	public void inputSelfLotto() {
		System.out.println("    ����������������������������������������");
		System.out.println("    �� Lotto ��ȣ ��������   ��");
		System.out.println("    ����������������������������������������");
		System.out.println("��ȣ�� �Է��ϼ���.(��: 6�ڸ�)");
		System.out.println("��, �׸� �Է��Ϸ��� -1�� �Է��ϼ���.");
	}

//	public void checkNumLotto(int[][] array, int create) {
	public void checkNumLotto() {

		if (array == null) {
			System.out.println("����or�ڵ����� �ζ� �� ��ȸ�����մϴ�.");
			mainLotto();
		}

		System.out.println("    ����������������������������������������");
		System.out.println("    �� Lotto ��ȣ Ȯ���ϱ�   ��");
		System.out.println("    ����������������������������������������");
		System.out.println(" ");
		int[][] numLotto = array;

		for (int i = 0; i < numLotto.length; i++) {
			System.out.print((i + 1) + "��° �ζǹ�ȣ : ");

			for (int j = 0; j < 6; j++) {
				System.out.print(numLotto[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public void end() {
		return;
	}

}
