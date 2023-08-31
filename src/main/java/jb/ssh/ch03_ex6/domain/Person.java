package jb.ssh.ch03_ex6.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Person {
	private String name;
	private Parrot parrot;

	public Person(Parrot parrot) {
		super();
		this.name = "철수";
		this.parrot = parrot;
	}

}
