package com.ry;

import java.util.Random;//导包 本程序需要依赖以下两个jar包
import java.util.Scanner;

public class testJava {
	//java 类名尽量以首字母大写的形式命名 不同单词的首字母都要大写
	public static void main(String[] args) {
		//main方法 执行class文件是若存在main方法则直接执行main方法中语句
		//String[] 为参数类型 String为字符串 与[]组合 表示字符串数组 args为参数名 可自定义随便改
		Random ran = new Random();
		//创建一个Random（随机数）的实例 
		int ranNum = ran.nextInt(100)+1;
		//ran.nextInt 产生一个随机数 范围为0<=x<100之间的 随机数 取整后产生一个整数 实际范围为0~99 为了达到0~100所以+1
		//int 为变量类型 整数类型 整数类型还有 byte short int long 内存大小从左到右依次变大
		//ranNum 为变量名 遵循命名规范即可
		boolean flag = true;// 申明一个boolean（布尔）类型的变量 只能取值为true和false
		Scanner scan = new Scanner(System.in);//创建一个扫描器的实例用来扫描键盘输入
		while(flag){// while 当()中的条件为true时才执行{}代码块中的代码 否则直接跳过
			System.out.println("请输入数字，按回车确认");
			int num = scan.nextInt();//用整数变量 num来接取扫描到的数字
			if(num>ranNum){
				System.out.println("太大了");
			}else if(num<ranNum){
				System.out.println("太小了");
			}else{
				System.out.println("恭喜你猜对了");
				break;//java 关键字 表示跳出当前循环  此处亦可用flag=false;来替换
				//作用是一样的 从效率上来说 break直接跳出循环 
				//而后者会再到while条件判断中再进行一次判断
				
			}
		}
	}

}
