package toi.drawing;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import toi.drawing.shapes.Circle;
import toi.drawing.shapes.Point;
import toi.drawing.shapes.Rectangle;
import toi.drawing.shapes.Shape;

/**
 * Repr�sente l'application de dessin. Le programme est juste un petit exemple
 * d'appel de m�thodes des formes.
 * 
 * @version avr. 2009
 * @author St�phane Lopes
 */
public enum DrawingApp {
	ENVIRONNEMENT;

	/**
	 * Acc�s au log.
	 */
	private static Log log = LogFactory.getLog("toi.drawing");

	/**
	 * M�thode principale du programme.
	 * 
	 * @param args
	 *            les arguments de ligne de commande
	 */
	public void run(String[] args) {
		log.info("D�marrage du programme.");
		List<Shape> shapes = new ArrayList<Shape>();
		// shapes = null;
		shapes.add(new Rectangle(new Point(0.0, 5.0), new Point(2.0, 2.0)));
		shapes.add(new Circle(new Point(1.0, 2.0), 3.0));
		shapes.add(new Rectangle(new Point(5.0, 5.0), new Point(7.0, 3.0)));
		shapes.add(new Circle(new Point(4.0, 5.0), 2.0));
		log.trace(shapes);

		for (Shape s : shapes) {
			s.translate(1.0, 2.0);
		}
		log.trace(shapes);
		log.info("Fin du programme.");
	}

	public void trace(List<Shape> shapes) {
		log.trace(shapes);
	}

	public void translate(List<Shape> shapes) {
		for (Shape s : shapes) {

			s.translate(2.0, 3.0);
		}
	}

	public static void main(String[] args) {
		ENVIRONNEMENT.run(args);
	}

}