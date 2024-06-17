package droid1.kandy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainAct extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void btnperms(View v){
        requestPermissions(new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},123);
    }
    
}
