package toi.drawing.shapes;

/**
 * Un cercle en deux dimensions.
 * 
 * @version avr. 2009
 * @author St�phane Lopes
 * 
 */
public class Circle extends Shape {
	/** Le centre du cercle. */
	private Point center;

	/** Le rayon du cercle */
	private double radius;

	/**
	 * Initialise un cercle avec un centre et un rayon.
	 * 
	 * @param center
	 *            Le centre.
	 * @param radius
	 *            Le rayon.
	 */
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	/**
	 * Renvoie le rayon du cercle.
	 * 
	 * @return le rayon du cercle.
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Translate le cercle.
	 * 
	 * @param dx
	 *            d�placement en abscisse.
	 * @param dy
	 *            d�placement en ordonn�es.
	 */
	@Override
	public void translate(double dx, double dy) {
		center.translate(dx, dy);
	}

	/**
	 * Retourne une cha�ne d�crivant le cercle.
	 * 
	 * @return la repr�sentation textuelle du cercle.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append('[');
		str.append(center.toString());
		str.append(", ");
		str.append(radius);
		str.append(']');
		return str.toString();
	}
}