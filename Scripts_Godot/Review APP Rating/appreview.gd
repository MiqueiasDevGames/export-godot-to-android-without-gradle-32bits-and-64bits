extends Node2D

var in_app_review
var Review = false

func _ready():

	start_in_app_review()


#Review App Rating
func start_in_app_review():
	if Engine.has_singleton("GodotGooglePlayInAppReview") and !Review:
		in_app_review = Engine.get_singleton("GodotGooglePlayInAppReview")
		in_app_review.connect("on_request_review_success", self, "_on_request_review_success")
		in_app_review.connect("on_request_review_failed", self, "_on_request_review_failed")
		in_app_review.connect("on_launch_review_flow_success", self, "_on_launch_review_flow_success")
		
		Review = true
		
	if Review:
		in_app_review.requestReviewInfo()

func _on_request_review_success():
	in_app_review.launchReviewFlow()
	
func _on_request_review_failed():
	pass
	
func _on_launch_review_flow_success():
	pass
	