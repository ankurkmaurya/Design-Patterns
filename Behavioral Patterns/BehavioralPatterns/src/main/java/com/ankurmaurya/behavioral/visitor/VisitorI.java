package com.ankurmaurya.behavioral.visitor;

public interface VisitorI {

	String visitDot(Dot dot);

	String visitCircle(Circle circle);

	String visitRectangle(Rectangle rectangle);

	String visitCompoundGraphic(CompoundShape cg);

}
