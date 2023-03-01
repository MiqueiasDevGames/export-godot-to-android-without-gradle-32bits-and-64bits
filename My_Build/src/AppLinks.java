package javapackage;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;

import android.net.Uri;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppLinks extends GodotPlugin {
    public AppLinks(Godot godot) {
        super(godot);
    }

    @Override
    public String getPluginName() {
        return "AppLinks";
    }


  public String getUrl(String paramName) {
    	String url = Godot.getCurrentIntent().getDataString();
    	Godot.getCurrentIntent().setData(null);
	
	if (url != null) {
      	    Uri uri = Uri.parse(url);
            return uri.getQueryParameter(paramName);
    	} else {
            return null;
    	}
   }



    @Override
    public List<String> getPluginMethods() {
        return Collections.unmodifiableList(Arrays.asList("getUrl"));
    }
}
