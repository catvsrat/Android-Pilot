
package android.animals;
import android.content.Context;
import android.widget.Button;

/*
 * The abstract Animal class is the child class of Button. Inorder to make the picture clickable, the animal is made as a child class of Button. This
 * class is abstract with two abstract methods. Any class that extends Animal class should compulsary override the two abstract methods of Animal class
 * and provide the implementation for it.
 */
public abstract class Animals extends Button {

	public AnimalsActivity a;
	protected String name = "Animal";
	protected String home = "Forest";

	public Animals(Context context) {
		super(context);
	}

	public abstract void show(); // The two abstract methods of animal class.
	public abstract int sound();
}

/*
 * The Wolf class is the child class of Animal. It provides the implementation for the two abstract methods of animal class.
 */
class Wolf extends Animals {

	public Wolf(Context context) {
		super(context);
		this.name = "Wolf";
	}

	public void show() {
		this.setBackgroundResource(R.drawable.wolf);
	}

	public int sound() {
		return R.raw.wolf;
	}
}

/*
 * Coyote is the child class of Wolf. It overrides the two methods of Wolf class.
 */
class Coyote extends Wolf {

	public Coyote(Context context) {
		super(context);
		this.name = "Coyote";
	}

	public void show() {
		this.setBackgroundResource(R.drawable.coyote);
	}

	public int sound() {
		return R.raw.coyote;
	}
}

/*
 * Hyena is the child class of Wolf. It overrides the two methods of Wolf class.
 */
class Hyena extends Wolf {

	public Hyena(Context context) {
		super(context);
		this.name = "Hyena";
	}

	public void show() {
		this.setBackgroundResource(R.drawable.hyena);
	}

	public int sound() {
		return R.raw.hyena;
	}
}

/*
 * Lion is the child class of Animal. It provides the implementation for two abstract methods of Animal class.
 */
class Lion extends Animals {

	public Lion(Context context) {
		super(context);
		this.name = "Lion";
	}

	public void show() {
		this.setBackgroundResource(R.drawable.lion);
	}

	public int sound() {
		return R.raw.lion;
	}
}

/*
 * Cougar is the child class of Lion. It overrides the two methods of Lion class.
 */
class Cougar extends Lion {

	public Cougar(Context context) {
		super(context);
		this.name = "cougar";
	}

	public void show() {
		this.setBackgroundResource(R.drawable.cougar);
	}

	public int sound() {
		return R.raw.cougar;
	}

}

/*
 * Leopard is the child class of Lion. It overrides the two methods of Lion class.
 */
class Leopard extends Lion {

	public Leopard(Context context) {
		super(context);
		this.name = "Leopard";
	}

	public void show() {
		this.setBackgroundResource(R.drawable.leopard);
	}

	public int sound() {
		return R.raw.leopard;
	}

}
