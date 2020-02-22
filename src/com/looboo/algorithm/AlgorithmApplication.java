package com.looboo.algorithm;

import com.github.javafaker.Faker;

public class AlgorithmApplication {

	public static void main(String[] args) {
		Faker faker = new Faker();
		System.out.println(faker.name().fullName());
	}

}
