package com.javaex.ex14;

import java.io.IOException;

public class MyFile {

		String path;
		
		
		public String read(String path) {
			String result = "학교종이";
			return result;
		}
		//파일이 없는 경우 -- 만드는 쪽에서 예외처리 하는경우
//		public String read2(String path) {
//			String result = "";
//			try {
//				throw new IOException();
//			}catch (IOException e) {
//				System.out.println(path + " no file");
//			}catch (NullPointerException e) {
//				System.out.println("널 포인트");
//			}catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}
//			return result;
//		}
		public String read2(String path) {
			String result = "";
			try {
				throw new IOException();
			}catch (Exception e) {
				System.out.println(path + " no file");
			}
			return result;
		}
		//파일이 없는 경우 -- 사용하는 쪽에 예외를 알리는 경우
		public void read3(String path)throws IOException{
			throw new IOException();
		}
}
