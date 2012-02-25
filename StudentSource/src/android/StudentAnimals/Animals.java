
package android.StudentAnimals;
import android.content.Context;
import android.widget.Button;

/*
 * The abstract Animal class is the child class of Button. Inorder to make the picture clickable, the animal is made as a child class of Button. This
 * class is abstract with two abstract methods. Any class that extends Animal class should compulsary override the two abstract methods of Animal class
 * and provide the implementation for it.
 */
public abstract class Animals extends Button {

	public StudentAnimalsActivity a;
	protected String name = "Animal";
	protected String home = "Forest";

	public Animals(Context context) {
		super(context);
	}
    
	//Show the picture of animal.
	public abstract void show(); 
	// produce the sound of the animal.
	public abstract int sound();
}

// Do Activity 1 to 6 below.

