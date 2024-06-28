package com.khair.buttom_nav;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation=findViewById(R.id.bottomNavigation);


        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.frameLayout, new Fast_Fragment());
        transaction.commit();



        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.tabMode){
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    transaction.add(R.id.frameLayout, new Fast_Fragment());
                    transaction.commit();

                } else if (item.getItemId()==R.id.notification) {
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    transaction.add(R.id.frameLayout, new Fragment_2and());
                    transaction.commit();




                } else if (item.getItemId()==R.id.tabMode12) {
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    transaction.add(R.id.frameLayout, new Fragment_3rd());
                    transaction.commit();




                }


                return true;

            }
        });






    }
}