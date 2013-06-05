package development;

import processing.core.PApplet;
import template.library.*;

/**
 * This is a class in a separate package 'development' for developing and testing.
 * Don't rename the package! While the build-process it will be automatically exclude.
 */

public class Sketch extends PApplet {

	HelloLibrary hello;

	public void setup() {
		size(500, 500);
		background(0);

		hello = new HelloLibrary(this);
	}

	public void draw() {
		background(0);

		println(hello.sayHello());
	}

	public static void main(String args[]) {
		PApplet.main(new String[] { "development.Sketch" });

		// Or run the sketch in present-mode:
		// PApplet.main(new String[] { "--present", "development.Sketch" });
	}

}
