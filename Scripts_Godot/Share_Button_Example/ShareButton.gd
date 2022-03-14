extends TouchScreenButton

var share = null # our share singleton instance

# Called when the node enters the scene tree for the first time.
func _ready():
	# initialize the share singleton if it exists
	if Engine.has_singleton("GodotShare"):
		share = Engine.get_singleton("GodotShare")


func _on_Share_Button_pressed():
	get_viewport().set_clear_mode(Viewport.CLEAR_MODE_ONLY_NEXT_FRAME)
	
	# Let two frames pass to make sure the screen was captured
	yield(get_tree(), "idle_frame")
	yield(get_tree(), "idle_frame")
	
	# Retrieve the captured image
	#var img = get_viewport().get_texture().get_data()
	# Flip it on the y-axis (because it's flipped)
	#img.flip_y()
	
	# user://tmp.png
	#var image_save_path = OS.get_user_data_dir() + "/tmp.png"
	
	# saves the capture as user://tmp.png
	#img.save_png(image_save_path)
	
	# if share was found, use it
	if share != null:
		share.shareText("Game Godot", "GO GO GO Game Godot", "Download: https://play.google.com/store/apps/details?id=com.matematica.canhaokids")

