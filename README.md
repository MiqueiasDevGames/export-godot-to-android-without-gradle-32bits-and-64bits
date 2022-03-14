# Thank you my Lord Jesus Christ, the truth is in you, love is in you, life is in you.

# export-godot-to-android-without-gradle-32bits-and-64bits
:+1: Exporting a godot engine project for android without using gradle.  It also adds AdMob.
:+1: Export your game to android With Admob, firebase notification, APP Review rating and Android Share
:+1: Yes. Export your godot game to android With Admob, firebase notification, APP Review rating and Android Share


## Android Generate aab manually linux i386 and x86_64
:+1: Generating aab file for google play console manually without using gradle

:+1: Generating aab file for google play console manually without using Android Studio

:+1: Let's generate an aab and try to generate the apk from aab manually


## Using linux 32bits :innocent:

**Start by downloading aapt 32bits**

- Go to aapt_debian_i386 folder and unzip aapt.zip
- and install, this is an aapt2 from debian repositories that works to generate .aab on linux 32bits

unzip aapt.zip

sudo dpkg -i *.deb


**Now let's download the BundleTool**
 > *Note: OpenJdk version 11 or higher must be properly installed*

 > *I used version 1.8.2*

- Download: [Bundletool releases](https://github.com/google/bundletool/releases)

- You must place BundleTool in the same location as Build_aab.sh
- actually he is already there.


**Install Android Sdk and OpenJdk**
- Search how to install android sdk on linux if you don't know.
- Android SDK will be out of date, but no problem, in linux 32 bits we will update manually, below.


**Now let's download the Android SDK Build-Tools**
 > *Note: I used version 30.0.3, however you might want to use a newer version*

 > *If you want, you can download it here: (https://androidsdkoffline.blogspot.com/p/android-sdk-build-tools.html)*


- Download: [Build-Tools Version 30.0.3](https://dl.google.com/android/repository/build-tools_r30.0.3-linux.zip)

* You should create folder 30.0.3 in your $ANDROID_HOME/build-tools/
* Unzip the content into $ANDROID_HOME/build-tools/30.0.3/
* The content, not the folder, should be ../30.0.3/apksigner for example and not ../30.0.3/Android-S/apksigner
* Inclusive isso resolve o error de apksigner no Godot Engine 3.3-stable no linux 32bits


**Now let's download the Android SDK Platform**
 > *Note: I used version 30, however you might want to use a newer version*

 > *If you want, you can download it here: (https://androidsdkmanager.azurewebsites.net/SDKPlatform)*


- Download: [SDK Platform Version 30 R04](https://dl.google.com/android/repository/platform-S_r04.zip)

* You should create folder android-30 in your $ANDROID_HOME/platforms/
* Unzip the content into $ANDROID_HOME/build-tools/platforms/android-30/
* The content, not the folder, should be ../android-30/android.jar for example and not ../android-30/Android-S/android.jar


# Now valid for i386 linux and x86_64 linux

:+1: Okay, with Android-sdk and OpenJdk correctly installed, we can proceed

:+1: On linux x86_64 you should have no problem installing Android SDK Build-Tools and Android SDK Platform

:+1: Don't forget to give all .sh permissions to run

### Start

- You must unzip this project in android/ folder inside your godot engine project.
- Or Create a folder there and clone this project inside it.

### mkdirFolders.sh

- You should run it once, it will be the first one you run.

### SplashScreen Android Godot
- In the Scripts_Godot/SplashScreen/ folder you will find the scene that will be your main scene, copy it along with its script, to the root of your godot project and define it as run scene.
- Change res://myMainGame.tscn in the function goto_scene(), in the Main.gd script to the first scene of your game.
- It is necessary to do this so that godot closes the SplashScreen android, when it finishes loading your scene.
- A Godot SplashScreen compatible with Android 12 and later and earlier.

### ICONS
- Generate the icons on the sites below:
- 1 [https://easyappicon.com/](https://easyappicon.com/) 
- 2 [https://assetstudio.androidpro.com.br/icons-notification.html](https://assetstudio.androidpro.com.br/icons-notification.html)
 
- Unzip and put the android and res folders in the ICONES folder, To look like this:
ICONS/android
ICONS/res

### Firebase Notification Godot
- Create your APP in firebase, to use Firebase Cloud Messaging and download your google-services.json and put it in the folder: Notification/
- You can send notification to all device using topic: GodotGame


### ADMOB Godot
- Put your APPLICATION_ID in AndroidManifest/Part_Manifest/APPLICATION_ID.txt
- Inside the Scripts_Godot folder you will find the admob-lib folder 
- to copy to the root of your godot project and use the o plugin as usual.
- More information use the link: [https://github.com/Shin-NiL/Godot-Android-Admob-Plugin](https://github.com/Shin-NiL/Godot-Android-Admob-Plugin)
- EX:
```
extends Node2D

func _ready():
	loadAds()


func loadAds() -> void:
	admob.load_banner()
	admob.load_interstitial()
	admob.load_rewarded_video()


func startBanner():
 admob.show_banner()
 
func startInterstitial(): 
 admob.show_interstitial()
 
func startRewarded_video():
 admob.show_rewarded_video()
 
#signal 
func _on_AdMob_rewarded_video_closed():
	admob.load_rewarded_video()
```

### Review APP Rating
- Example script in Scripts_Godot/Review APP Rating
- More information here: [https://github.com/pschw/InAppReview](https://github.com/pschw/InAppReview)

### Share Button Example
- Example script in Scripts_Godot/Share_Button_Example
- More information here: [https://github.com/Shin-NiL/Godot-Android-Share-Plugin](https://github.com/Shin-NiL/Godot-Android-Share-Plugin)

### Note
- Note the plugins are all activated, you download nothing else, you just need to use the necessary scripts in Godot, then you generate an apk in godot, leave the project in the root folder of the godot project with an easy name and no spaces.

### CreateAndroidManifest.sh

- You need to run it at least once before Build_aab.sh
- This one creates the AndroidManifest.xml in AndroidManifest/AndroidManifest.xml
- Run every time you change your project version.

### Build_aab.sh

- Make sure you have the zip and unzip tools installed;
- Okay, now every time you want to generate an aab and an apk use Build_aab.sh;
- Generated aab will go to My_Build/AAB folder and generated apks will go to My_Build/APKs folder;
- To work correctly Build_aab.sh needs Bundletool to be in the same folder;
- First generate an apk by Godot and save it in an easily accessible location, as Build_aab.sh will ask for its location. You can export it to Godot's standard, so when prompted just type ../../projeto.apk


# PayPal
#### I did this because I use a 32bit computer if you want to help me buy a 64bit one, here is my paypal account:
#### miqueias9889@gmail.com
