package android.bignerdranch.navcontrollertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    * The NavHostFragment has been attached to the activity_main.xml file. The NHF is an empty
    * container that holds destinations. From the NHF we can get a NavController which knows about
    * the navigation graph and controls the transitions between different destinations. It is here
    * where the different destinations are hosted via the NHF, similar to how an activity would host
    * a fragment by making room for it in it's view hierarchy, now we simply add the NHF and it, in
    * conjunction withe NavController, will display the correct fragment here.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
