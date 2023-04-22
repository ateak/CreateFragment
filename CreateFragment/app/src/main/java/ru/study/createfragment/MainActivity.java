package ru.study.createfragment;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //добавление фрагмента программным путем
        //if (savedInstanceState == null) {
            //getSupportFragmentManager().beginTransaction().add(R.id.fragment_container_view, ContentFragment.class, null).commit();
        }
}
