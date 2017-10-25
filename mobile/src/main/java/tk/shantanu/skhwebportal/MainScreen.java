package tk.shantanu.skhwebportal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainScreen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    final Context context = this;
    private WebView mywebView;

    private static int SPLASH_TIME_OUT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent home =  new Intent(MainScreen.this, Splah.class);
                //startActivity(home);
                //finish();
            }
        },SPLASH_TIME_OUT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Snackbar.make(view, "Thanks For Using Shantanu Suryawanshi's App..!!", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                Intent intent = new Intent(context, Splah.class);
                startActivity(intent);
                //mywebView.loadUrl("http://www.google.com");
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*mywebView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebView.loadUrl("http://www.shantanu.tk");
        mywebView.setWebViewClient(new WebViewClient());

        //mywebView.setWebViewClient(new MyWebViewClient());*/
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_homepage) {
            // Handle the camera action
            Toast.makeText(getApplicationContext(), "SKH Homepage",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_computer) {
            Toast.makeText(getApplicationContext(), "Computer Department",Toast.LENGTH_SHORT).show();
            /*Intent intent = new Intent(context, Sample.class);
            startActivity(intent);*/
            //mywebView.loadUrl("http://www.google.com");

        } else if (id == R.id.nav_mechanical) {
            Toast.makeText(getApplicationContext(), "Mechanical Department",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_civil) {
            Toast.makeText(getApplicationContext(), "Civil Department",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_electrical) {
            Toast.makeText(getApplicationContext(), "Electrical Department",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_entc) {
            Toast.makeText(getApplicationContext(), "EnTC Department",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
