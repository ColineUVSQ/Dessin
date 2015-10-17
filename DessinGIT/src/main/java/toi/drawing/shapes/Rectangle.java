package toi.drawing.shapes;

/**
 * Un rectangle en deux dimensions. Les c�t� du rectangle sont toujours
 * parall�les aux axes.
 * 
 * @version oct. 2008
 * @author St�phane Lopes
 * 
 */
public class Rectangle extends Shape {
	/** Coordonn�es du coin sup�rieur gauche. */
	private Point upLeft;

	/** Coordonn�es du coin inf�rieur droit */
	private Point downRight;

	/**
	 * Initialise le rectangle.
	 * 
	 * @param upLeft
	 *            Le coin sup�rieur gauche.
	 * @param downRight
	 *            Le coin inf�rieur droit.
	 */
	public Rectangle(Point upLeft, Point downRight) {
		assert upLeft.getX() <= downRight.getX() && upLeft.getY() >= downRight.getY();
		this.upLeft = upLeft;
		this.downRight = downRight;
	}

	/**
	 * Translate le rectangle.
	 * 
	 * @param dx
	 *            d�placement en abscisse.
	 * @param dy
	 *            d�placement en ordonn�es.
	 */
	@Override
	public void translate(double dx, double dy) {
		upLeft.translate(dx, dy);
		downRight.translate(dx, dy);
	}

	/**
	 * Retourn une cha�ne repr�sentant l'objet.
	 * 
	 * @return la cha�ne.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		str.append(upLeft.toString());
		str.append(", ");
		str.append(downRight.toString());
		str.append("]");
		return str.toString();
	}
}