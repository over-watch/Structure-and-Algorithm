package com.watcher.algorithm;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import sun.net.www.content.audio.x_aiff;

/*
 * Hanks博士是BT（Bio-Tech，生物技术）领域的知名专家，他的儿子名叫Hankson。现在，刚刚放学回家的Hankson正在思考一个有趣的问题。
 * 
 * 今天在课堂上，老师讲解了如何求两个正整数c1和c2的最大公约数和最小公倍数。现在Hankson认为自己已经熟练地掌握了这些知识，
 * 他开始思考一个“求公约数”和“求公倍数”之类问题的“逆问题”，这个问题是这样的：已知正整数a0,a1,b0,b1，设某未知正整数x满足：
 * 1、 x和a0的最大公约数是a1；2、 x和b0的最小公倍数是b1。
 * 
 * Hankson的“逆问题”就是求出满足条件的正整数x。但稍加思索之后，他发现这样的x并不唯一，
 * 甚至可能不存在。因此他转而开始考虑如何求解满足条件的x的个数。请你帮助他编程求解这个问题。
 * 
 *输入Input： 第一行为一个正整数n，表示有n组输入数据。接下来的n行每行一组输入数据，为四个正整数a0，a1，b0，b1，
 *每两个整数之间用一个空格隔开。输入数据保证a0能被a1整除，b1能被b0整除。
 * 
 * 输出Output：共n行。每组输入数据的输出结果占一行，为一个整数。
				对于每组数据：若不存在这样的x，请输出0；
				若存在这样的x，请输出满足条件的x的个数；
 * 
 * Sample：
 * 输入：
 * 		2
 * 		41 1 96 288
 * 		95 1 37 1776
 * 输出：
 * 		6
 * 		2
 */
public class Hankson {
	
	static int number;
	public static void main(String[] args){
//		ArrayList<Integer> array;
//		System.out.println("请输入一个整数：");
//		Scanner in=new Scanner(System.in);
//		number=in.nextInt();
//		System.out.println("输入4个整数：");
//	for(int i=0;i<number;i++){
//		array =new ArrayList<Integer>(4);
//		for(int j=0;j<4;j++){
//			array.add(j,in.nextInt());
//		}
//		
//		System.out.println("输出结果：");
//		
//	}
		int num=0;
		ArrayList<Integer> a=new Hankson().min(96, 288);
		ArrayList<Integer> b=new Hankson().max(41, 1);
		
		for(int i=0;i<a.size();i++){
			for(int j=0;j<b.size();j++){
				if(a.get(i)==b.get(j)){
					num++;
				}
			}
		}
		
		for(int m=0;m<a.size();m++){
			System.out.print(a.get(m)+" ");
		}
		System.out.println();
		for(int n=0;n<b.size();n++){
			System.out.print(b.get(n)+" ");
		}
		System.out.println();
		
		System.out.println(num);
	}
	/*
	 * list中存放满足x和b0的最小公倍数是b1的所有X
	 * 
	 * 
	 * 
	 */
	public ArrayList<Integer> min(int b0,int b1){
			ArrayList<Integer> array=new ArrayList<>();
			int temp=b0;
			for(int n=1;n<b1;n++){
				if(LCM(n, temp)==b1){
					array.add(n);
				}
			}
		return array;
	}
	/*
	 * 符合所有x和a0的最大公约数是a1的所有x的集合
	 * 
	 */
	public ArrayList<Integer> max(int a0,int a1){
			ArrayList<Integer> array=new ArrayList<>();
			int temp=a0;
		for(int m=1;m<a0;m++){
			 if(GCD(m, temp)==a1)
				 array.add(m);
		}
		return array;
	}
	
	//求得x和y的最小公倍数
	public int LCM(int x,int y){
		int max=x*y/GCD(x, y);
		return max;
	}
	
	//求得x和y的最大公约数
	public int GCD(int x,int y){
		int min;
		if(x<y){
			min=y;
			y=x;
			x=min;
		}
		while(x%y!=0){
			int z=x%y;
			x=y;
			y=z;
		}
		min=y;
		return y;
	}
}
