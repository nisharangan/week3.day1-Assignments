package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		
		System.out.println("Desktop Size: 23.8");
	}

	public static void main(String[] args) {
		Desktop deskObj = new Desktop();
		deskObj.desktopSize();
		deskObj.computerModel();
	
	}
}

/*Learnings:
 * Desktop Class inherits Computer Class
 * Object is created only for Desktop Class
 * Through deskObj we can access all methods from Computer Class
 * There is no need to create separate Object for Computer Class
 */


