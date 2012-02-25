
package android.animals;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class AnimalsActivity extends Activity {
	/** Called when the activity is first created. */
	Animals a[] = new Animals[6];

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TableLayout tl = new TableLayout(this);
		TableRow tr1[] = new TableRow[3];
		TableRow tr2[] = new TableRow[3];

		for (int k = 0; k < tr1.length; k++) {
			tr1[k] = new TableRow(this);
			tr2[k] = new TableRow(this);
		}
// The below code demostrates polymorphism.
		a[0] = new Lion(this);
		a[1] = new Wolf(this);
		a[2] = new Leopard(this);
		a[3] = new Hyena(this);
		a[4] = new Cougar(this);
		a[5] = new Coyote(this);

		for (int i = 0; i < a.length; i++) {
			a[i].a = this;
			a[i].show();
			a[i].setWidth(110);
			a[i].setHeight(110);

			TextView t = new TextView(this);
			t.setText(a[i].name);
			t.setTextColor(Color.WHITE);
			t.setTextSize(30);

			tr1[i / 2].addView(t);
			tr2[i / 2].addView(a[i]);

			if (i % 2 == 1) {
				tl.addView(tr1[i / 2]);
				tl.addView(tr2[i / 2]);
			}

			this.photoClick(a[i]);
		}

		tl.setBackgroundColor(Color.BLACK);
		setContentView(tl);
	}
/**
 * Sound is produced whenever a picture is clicked.
 * @param Button object is passed as an argument.
 */
	public void photoClick(Button b) {

		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				for (int i = 0; i < a.length; i++) {
					if (v == a[i]) {
						MediaPlayer mediaPlayer = MediaPlayer.create(
								v.getContext(), a[i].sound());
						mediaPlayer.start();
						break;
					}
				}
			}
		});

	}
}
