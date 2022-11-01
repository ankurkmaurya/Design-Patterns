package com.ankurmaurya.structural.flyweight;

public abstract class PenImpl implements Pen {

	private String color; // Intrinsic state - shareable, immutable
	private BrushSize brushSize; // Extrinsic state - supplied by client

	protected PenImpl(String color) {
		this.color = color;
	}

	@Override
	public void setBrushSize(BrushSize brushSize) {
		this.brushSize = brushSize;
	}

	public BrushSize getBrushSize() {
		return brushSize;
	}

	public String getColor() {
		return color;
	}

}
