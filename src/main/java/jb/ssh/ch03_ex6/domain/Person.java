package jb.ssh.ch03_ex6.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@Getter
@ToString
public class Person {
	private String name = "철수";
	private Parrot parrot;
	
}
