package toi.drawing.shapes;

/**
 * Un point en deux dimensions.
 * 
 * @param x
 *            abscisse du point
 * @param y
 *            ordonnée du point
 * 
 * @version oct. 2008
 * @author St�phane Lopes
 * 
 */
public class Point {
	/** L'abscisse du point. */
	private double x;

	/** L'ordonn�e du point. */
	private double y;

	/**
	 * Initialise un point � partir de deux coordonn�es.
	 * 
	 * @param x
	 *            l'abscisse du point.
	 * @param y
	 *            l'ordonn�e du point.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Renvoie l'abscisse du point.
	 * 
	 * @return l'abscisse du point.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Renvoie l'ordonn�e du point.
	 * 
	 * @return l'ordonn�e du point.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Translate le point.
	 * 
	 * @param dx
	 *            d�placement en abscisse.
	 * @param dy
	 *            d�placement en ordonn�es.
	 */
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Retourne une cha�ne d�crivant le point.
	 * 
	 * @return la repr�sentation textuelle du point.
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append('(');
		str.append(x);
		str.append(", ");
		str.append(y);
		str.append(')');
		return str.toString();
	}
}