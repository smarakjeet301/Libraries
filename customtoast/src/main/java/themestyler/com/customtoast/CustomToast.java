package themestyler.com.customtoast;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

public class CustomToast {

    public static void s(Context c, String Message, ImageView id){

        Toast.makeText(c,Message+""+id,Toast.LENGTH_SHORT).show();

    }
}
