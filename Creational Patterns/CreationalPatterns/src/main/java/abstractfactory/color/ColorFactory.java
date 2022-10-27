package abstractfactory.color;

public class ColorFactory {

	private ColorFactory() {}
	
	public static Color getColor(ColorType colorType) {
		Color color = null;
		switch (colorType) {
		case GREEN:
			color = new Green();
			break;
		case BLUE:
			color = new Blue();
			break;
		case RED:
			color = new Red();
			break;
		}
		return color;
	}

}
