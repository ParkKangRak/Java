package part2.ex2.topdown;

import java.util.Scanner;

public class LottoRandomProgram {
	Scanner scan = new Scanner(System.in);
	int[][] array = null;
	int create = 0;
	int tmp = 0;

	public void mainLotto() {
		System.out.println("    ┌──────────────────┐");
		System.out.println("    │  Lotto관리 프로그램   │");
		System.out.println("    └──────────────────┘");
		System.out.println("\t1. 번호 자동생성 ");
		System.out.println("\t2. 번호 수동생성 ");
		System.out.println("\t3. 번호 확인 ");
		System.out.println("\t4. 종료 ");
		int menu = scan.nextInt();
		if (menu == 1) {
			System.out.println("생성할 개수를 입력하세요.");
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
//						2 /00,01 비교
//						3 /00,01,02 비교 01,02 비교
//						4 /00,01,02,03 비교 ,01,02,03 비교, 02,03 비교				    
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
		System.out.println("    ┌──────────────────┐");
		System.out.println("    │ Lotto 번호 수동생성   │");
		System.out.println("    └──────────────────┘");
		System.out.println("번호를 입력하세요.(예: 6자리)");
		System.out.println("단, 그만 입력하려면 -1을 입력하세요.");
	}

//	public void checkNumLotto(int[][] array, int create) {
	public void checkNumLotto() {

		if (array == null) {
			System.out.println("수동or자동으로 로또 후 조회가능합니다.");
			mainLotto();
		}

		System.out.println("    ┌──────────────────┐");
		System.out.println("    │ Lotto 번호 확인하기   │");
		System.out.println("    └──────────────────┘");
		System.out.println(" ");
		int[][] numLotto = array;

		for (int i = 0; i < numLotto.length; i++) {
			System.out.print((i + 1) + "번째 로또번호 : ");

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
