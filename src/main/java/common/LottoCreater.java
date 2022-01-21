package common;

import java.util.Random;

public class LottoCreater {
	// 난수생성을 위한 객체 생성
	Random rnd = new Random();
	
	// 난수를 통해 6개의 번호를 생성한다.
	public void randomCreate(int[] arrParam) {
		rnd.setSeed(System.currentTimeMillis());
		// 배열의 크기만큼 반복해서 난수생성
		while(true) {
			for(int i=0 ; i<arrParam.length ; i++) {
				arrParam[i] = rnd.nextInt(45) + 1;
			}
			// 배열에 중복된 값이 있는지 확인한다.
			boolean rndFlag = false;
			for(int i=0 ; i<arrParam.length ; i++) {
				for(int j=0 ; j<arrParam.length ; j++) {
					if(i!=j && arrParam[i]==arrParam[j]) {
						rndFlag = true;
					}
				}
			}
			// 중복된 값이 없으면 while문 탈출한다.
			if(rndFlag==false) break;
		}
	}
	// 생성된 난수를 버블정렬을 이용해서 오름차순 정렬한다.
	public static void bubbleSort(int[] arrParam) {
		int temp;
		for(int i=0 ; i<arrParam.length-1 ; i++) {
			for(int j=0 ; j<(arrParam.length-1)-i ; j++) {
				if(arrParam[j] > arrParam[j+1]) {
					temp = arrParam[j];
					arrParam[j] = arrParam[j+1];
					arrParam[j+1] = temp;
				}
			}
		}
	}
	// 6개의 난수 생성후 오름차순 정렬해서 호출한 지점으로 반환한다.
	public int[] lotto() {
		int[] arr = new int[6];
		randomCreate(arr);		
		bubbleSort(arr);
		return arr;
	}
}
