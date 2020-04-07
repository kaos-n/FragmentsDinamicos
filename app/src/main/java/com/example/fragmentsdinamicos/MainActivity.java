package com.example.fragmentsdinamicos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnfrg1, btnfrg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 fragmento1 = new frag1();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmento1);
        btnfrg1 = findViewById(R.id.btnFrag1);
        btnfrg2 = findViewById(R.id.btnFrag2);

        btnfrg2.setOnClickListener(this);
        btnfrg1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnFrag1:

                frag1 fragmento1 = new frag1 ();
                FragmentTransaction transition = getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmento1);
                transition.commit();

                break;

            case R.id.btnFrag2:
                frag2 fragmento2 = new frag2 ();
                FragmentTransaction transition2 = getSupportFragmentManager().beginTransaction();
                transition2.replace(R.id.contenedor, fragmento2);
                transition2.commit();

                break;
        }

    }
}
