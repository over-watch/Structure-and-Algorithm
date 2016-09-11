package com.watcher.dotcom;

public class SimpleDotCom {
	private int[] loctionCells;//the attack 
	private int numOfHits=0;//number of hit
	
	public void setLoctionCells(int[] loctionCells) {
		this.loctionCells = loctionCells;
	}
	
	public String checkYourself(String stringGuess){
		int guess=Integer.parseInt(stringGuess);
		String result="miss";
		for(int cell:loctionCells){
			if(guess==cell){
				result="hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==loctionCells.length){
			result="kill";
		}
		System.out.println(result);
		return result;
	}
}
