package com.upstreamsystems.curry.itests;

import java.util.*;

public class ReformatMain {

	private static final int MIN_VALUE = 1000;
	private static final int MAX_VALUE = 1200;
	private static final Random RAND = new Random(System.currentTimeMillis());
	private static final int SIZE = RAND.nextInt(MAX_VALUE - MIN_VALUE) + MIN_VALUE;

	private static final int DENOM1 = 40;
	private static final int DENOM2 = 20;
	private static final int DENOM3 = 10;

	public static void main(String[] args) throws Exception{

		List<Integer> denoms = generateRandomDenominations(randomizeNumber(SIZE), randomizeNumber(DENOM1), randomizeNumber(DENOM2), randomizeNumber(DENOM3));

		StringBuilder stringBuilder = new StringBuilder();
		for(Integer denom : denoms){
			stringBuilder.append(denom).append(",");
		}
		System.out.println(stringBuilder.toString());

		List<Integer> denoms1 = generateRandomDenominations(randomizeNumber(SIZE), randomizeNumber(DENOM1), randomizeNumber(DENOM2), randomizeNumber(DENOM3));

		StringBuilder stringBuilder1 = new StringBuilder();
		for(Integer denom : denoms1){
			stringBuilder1.append(denom).append(",");
		}
		System.out.println(stringBuilder1.toString());

		List<Integer> denoms2 = generateRandomDenominations(randomizeNumber(SIZE), randomizeNumber(DENOM1), randomizeNumber(DENOM2), randomizeNumber(DENOM3));
		StringBuilder stringBuilder2 = new StringBuilder();
		for(Integer denom : denoms2){
			stringBuilder2.append(denom).append(",");
		}
		System.out.println(stringBuilder2.toString());

		List<Integer> denoms3 = generateRandomDenominations(randomizeNumber(SIZE), randomizeNumber(DENOM1), randomizeNumber(DENOM2), randomizeNumber(DENOM3));
		StringBuilder stringBuilder3 = new StringBuilder();
		for(Integer denom : denoms3){
			stringBuilder3.append(denom).append(",");
		}
		System.out.println(stringBuilder2.toString());
	}

	/**
	 * Generates RandomDenominations, portion of denomination 4 is calculated
	 *
	 * @param size Population size
	 * @param denom1 Portion of denomination 1
	 * @param denom2 Portion of denomination 2
	 * @param denom3 Portion of denomination 3
	 * @return
	 */
	private static List<Integer> generateRandomDenominations(int size, int denom1, int denom2, int denom3){
		int numOfDenom1 = size * denom1 /100;
		int numOfDenom2 = size * denom2 /100;
		int numOfDenom3 = size * denom3 /100;
		int numOfDenom4 = size - (numOfDenom1 + numOfDenom2 + numOfDenom3);
		List result = new ArrayList<Integer>();
		for(int i=0; i<numOfDenom1; i++){
			result.add(1);
		}
		for(int i=0; i<numOfDenom2; i++){
			result.add(2);
		}
		for(int i=0; i<numOfDenom3; i++){
			result.add(3);
		}
		for(int i=0; i<numOfDenom4; i++){
			result.add(4);
		}
		Collections.shuffle(result);
		return result;
	}

	private static int randomizeNumber(int initial) {
		Random rand = new Random(System.currentTimeMillis());
		if(rand.nextBoolean()){
			return rand.nextInt(20) + initial;
		}else{
			return initial - rand.nextInt(20);
		}
	}
}
