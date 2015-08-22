package com.example.funkym0nk3y.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Do something in response to button click.
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch Spotify streamer!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });
    Button button2 = (Button) findViewById(R.id.button2);
    button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Do something in response to button click.
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch Scores App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });
    Button button3 = (Button) findViewById(R.id.button3);
    button3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Do something in response to button click.
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch Library App!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });
    Button button4 = (Button) findViewById(R.id.button4);
    button4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Do something in response to button click.
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch Build It Bigger!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });
    Button button5 = (Button) findViewById(R.id.button5);
    button5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Do something in response to button click.
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch XYZ Reader!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });
    Button button6 = (Button) findViewById(R.id.button6);
    button6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // Do something in response to button click.
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch CAPSTONE: MY OWN APP!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if ( id == R.id.action_settings ) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }

  public void onclick(View view) {
  }
}
