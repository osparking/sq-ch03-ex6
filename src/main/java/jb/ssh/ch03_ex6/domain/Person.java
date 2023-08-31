package jb.ssh.ch03_ex6.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Person {
	private String name = "철수";
	private Parrot parrot;

	@Autowired
	void setParrot(Parrot parrot) {
		this.parrot = parrot;
	}

}
