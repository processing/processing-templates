The data folder:
If your tool is using files like images, sound files, any data file, etc., 
put them into the data folder.  When writing your tool you can use the 
following methods as a starting point to load or get files from the data folder,
these are suggestions amongst many other solutions.

When using an Object which extends PApplet inside your tool, PApplet's internal 
methods such as loadImage, loadStrings, etc. will use your tool's data folder to find 
files to be loaded.





/**
 * load an image from the data folder or an absolute path. This
 * java.awt.Image can be displayed within a JFrame for example.
 * 
 * @param theFilename
 * @return
 */
public Image loadImage(String theFilename) {
	if (theFilename.startsWith(File.separator)) {
		return new ImageIcon(theFilename).getImage();
	} else {
		URL img = this.getClass().getResource(getPath(theFilename));
		return new ImageIcon(img).getImage();
	}
}


/**
 * load an image from the data folder or an absolute path as a PImage.
 * 
 * @param theFilename
 * @return
 */
public PImage loadPImage(String theFilename) {
	return new PImage(loadImage(theFilename));
}


/**
 * load a text file from the data folder or an absolute path.
 * 
 * @param theFilename
 * @return
 */
public String loadString(String theFilename) {
	InputStream is = null;
	if (theFilename.startsWith(File.separator)) {
		try {
			is = new FileInputStream(loadFile(theFilename));
		} catch (FileNotFoundException e) {
			System.err.println("ERROR @ loadString() " + e);
		}
	} else {
		is = getClass().getResourceAsStream(getPath(theFilename));
	}
	InputStreamReader isr = new InputStreamReader(is);
	BufferedReader br = new BufferedReader(isr);
	int buffer;
	String result = "";
	try {
		while ((buffer = br.read()) != -1) {
			result += (char) buffer;
		}
	} catch (Exception e) {
		System.err.println("ERROR @ loadString() " + e);
	}
	return result;
}


/**
 * getPath will return the path to a file or folder inside the data folder
 * of the tool or an absolute path.
 * 
 * @param theFilename
 * @return
 */
public String getPath(String theFilename) {
	if (theFilename.startsWith("/")) {
		return theFilename;
	}
	return File.separator + "data" + File.separator + theFilename;
}


/**
 * load a file from the data folder or an absolute path.
 * 
 * @param theFilename
 * @return
 */
public File loadFile(String theFilename) {
	if (theFilename.startsWith(File.separator)) {
		return new File(theFilename);
	}
	String path = getClass().getResource(getPath(theFilename)).getPath();
	return new File(path);
}





