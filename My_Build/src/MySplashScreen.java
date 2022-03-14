package javapackage;
 
 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.os.Handler;
 import androidx.core.splashscreen.SplashScreen;
 
 
 
 public class MySplashScreen extends Activity {
 
 private boolean keep = true;
 
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 
 // Handle the splash screen transition.
 SplashScreen splashScreen = SplashScreen.installSplashScreen(this); 
 
 super.onCreate(savedInstanceState);
 
 // Keep the splash screen visible for this Activity
 splashScreen.setKeepOnScreenCondition(new SplashScreen.KeepOnScreenCondition() {
 @Override
 public boolean shouldKeepOnScreen() {
 return keep;
 }
 }); 
 
 Handler handler = new Handler();
 handler.postDelayed(new Runnable() {
 @Override
 public void run() {
 Intent intent = new Intent(MySplashScreen.this, GodotApp.class);
 startActivity(intent);
 keep = false;
 finish();
 
 }
 }, 500); 
 
 
 
 }
 
 
 }

