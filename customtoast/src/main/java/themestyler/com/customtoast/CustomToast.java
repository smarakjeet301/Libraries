package themestyler.com.customtoast;

import android.content.Context;
import android.widget.Toast;

public class CustomToast {

    public static void s(Context c, String Message){

        Toast.makeText(c,Message,Toast.LENGTH_SHORT).show();

    }
}
