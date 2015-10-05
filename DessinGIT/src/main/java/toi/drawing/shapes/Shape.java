package toi.drawing.shapes;

/**
 * Une figure.
 * 
 * @version avr. 2009
 * @author St�phane Lopes
 * 
 */
public abstract class Shape {
	/**
	 * Translate la figure.
	 * 
	 * @param dx
	 *            d�placement en abscisse.
	 * @param dy
	 *            d�placement en ordonn�es.
	 */
	public abstract void translate(double dx, double dy);
}
