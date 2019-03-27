package edu;

import java.util.Locale;

import com.github.javafaker.Faker;

public class Demo {
	static Faker faker=new Faker(new Locale("zh-CN"));
		public static void main(String[] args) {
				Student std=new Student(1,faker.name().fullName(),faker.address().fullAddress());
				System.out.println(std.toString());
			
		}

}
