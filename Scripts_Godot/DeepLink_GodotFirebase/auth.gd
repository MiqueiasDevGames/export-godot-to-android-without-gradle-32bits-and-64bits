extends Node

var provider = AuthProvider
var port = 8060


func _ready():
	Firebase.Auth.connect("login_succeeded", self, "_on_login_succeeded")
	Firebase.Auth.connect("login_failed",self, "_on_login_failed")
	Firebase.Auth.connect("token_refresh_succeeded",self,"_on_refresh_login_succeeded")
	
	#https://kingsvspigs.web.app
	Firebase.Auth.set_redirect_uri("https://kingsvspigs.web.app")
	#provider google
	provider = Firebase.Auth.get_GoogleProvider()
	
	#Login automatico
	#_on_application_start()
	
	
	
func _on_login_succeeded(user : Dictionary):
	$Label.set_text("Successfully logged in with oAuth2 as: {email}".format({email=user.email}))
	
	Firebase.Auth.save_auth(user)
	
func _on_refresh_login_succeeded(user : Dictionary):
	$Label.set_text("Successfully logged!")
	



func _on_SignInWithGoogle_button_pressed():
	$Label.set_text("Exchanging authorization code with a oath token...")
	Firebase.Auth.get_auth_with_redirect(provider)
	
	
	


func _on_application_start():
	Firebase.Auth.load_auth()
	
	


#USando deepLinks
func check_app_link():
	if Engine.has_singleton('AppLinks'):
		var applinks = Engine.get_singleton('AppLinks')
		var app_url = applinks.getUrl("code")
		$Label2.set_text(app_url)
		
		Firebase.Auth.login_with_oauth(app_url, provider)
		
func _notification(what):
	if what == NOTIFICATION_APP_RESUMED:
		check_app_link()
