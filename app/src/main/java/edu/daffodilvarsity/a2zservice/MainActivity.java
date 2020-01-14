package edu.daffodilvarsity.a2zservice;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import edu.daffodilvarsity.a2zservice.events_services.EventsFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    private BottomNavigationView navigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener nevListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {

                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.nev_Home:
                            openFragment(new HomeFragment());


                            break;
                        case R.id.nev_History:
                            break;
                        case R.id.nev_Events:
                            openFragment(new EventsFragment());
                        case R.id.nev_More:
                            openFragment(new ProfileFragment());

                            break;
                    }

                    return true;
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(nevListener);
    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}
