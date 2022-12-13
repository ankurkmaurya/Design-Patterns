package com.ankurmaurya.behavioral.visitor;

public interface Shape {
	void move(int x, int y);

	void draw();

	String accept(VisitorI visitor);
}
