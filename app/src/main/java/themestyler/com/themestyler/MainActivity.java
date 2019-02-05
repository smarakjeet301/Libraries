package themestyler.com.themestyler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import themestyler.com.customtoast.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast.s(this,"Hello Bro"+R.drawable.ic_launcher_background
        );

    }
}
