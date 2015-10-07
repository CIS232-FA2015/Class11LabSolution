package cis232.classlab;

public class UnsupportedColorException extends RuntimeException {
	public UnsupportedColorException(String color){
		super(String.format("%s is not supported!", color));
	}
}
