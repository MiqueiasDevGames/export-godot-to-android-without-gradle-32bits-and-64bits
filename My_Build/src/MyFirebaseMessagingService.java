package javapackage;
 
 import androidx.core.app.NotificationChannelCompat;
 import androidx.core.app.NotificationManagerCompat;
 import android.app.PendingIntent;
 import androidx.core.content.ContextCompat;
 import androidx.core.content.IntentCompat;
 import android.media.RingtoneManager;
 import androidx.core.net.UriCompat;
 import androidx.core.os.BuildCompat;
 import androidx.core.app.NotificationCompat;
 import android.util.Log;
 
 import com.google.firebase.messaging.FirebaseMessagingService;
 import com.google.firebase.messaging.RemoteMessage;
 
 
 import com.google.android.gms.tasks.OnCompleteListener;
 import com.google.android.gms.tasks.Task;
 import com.google.firebase.messaging.FirebaseMessaging;
 
 
 public class MyFirebaseMessagingService extends FirebaseMessagingService {
 
 private final String TAG = MyFirebaseMessagingService.class.getName();
 
 @Override
 public void onMessageReceived(RemoteMessage remoteMessage) {
 // [START_EXCLUDE]
 // There are two types of messages data messages and notification messages. Data messages
 // are handled
 // here in onMessageReceived whether the app is in the foreground or background. Data
 // messages are the type
 // traditionally used with GCM. Notification messages are only received here in
 // onMessageReceived when the app
 // is in the foreground. When the app is in the background an automatically generated
 // notification is displayed.
 // When the user taps on the notification they are returned to the app. Messages
 // containing both notification
 // and data payloads are treated as notification messages. The Firebase console always
 // sends notification
 // messages. For more see: https://firebase.google.com/docs/cloud-messaging/concept-options
 // [END_EXCLUDE]
 
 // TODO(developer): Handle FCM messages here.
 // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
 Log.d(TAG, "From: " + remoteMessage.getFrom());
 
 // Check if message contains a data payload.
 if (remoteMessage.getData().size() > 0) {
 Log.d(TAG, "Message data payload: " + remoteMessage.getData());
 
 }
 
 // Check if message contains a notification payload.
 if (remoteMessage.getNotification() != null) {
 Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
 }
 
 
 }
 
 
 
 @Override
 public void onNewToken(String token) {
 Log.d(TAG, "Refreshed token: " + token);
 
 
 FirebaseMessaging.getInstance().subscribeToTopic("GodotGame")
 .addOnCompleteListener(new OnCompleteListener<Void>() {
 @Override
 public void onComplete(Task<Void> task) {
 if (!task.isSuccessful()) {
 Log.w(TAG, "SubscribeToTopic CanhaoKids failed", task.getException());
 }
 
 Log.d(TAG, "SubscribeToTopic OK");
 }
 }); 
 
 
 }
 
 }
 
 
 
 
 
 
 
 
 
 

