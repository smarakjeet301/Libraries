package themestyler.com.customtoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;

public class CustomToast {

    public static void s(Context c, String Message, Drawable id){

        Toast.makeText(c,Message+""+id,Toast.LENGTH_SHORT).show();

    }
}
