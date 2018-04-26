package com.kotline_one.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("image")
@Expose
private String image;
@SerializedName("waypoints")
@Expose
private List<Waypoint> waypoints = null;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

public List<Waypoint> getWaypoints() {
return waypoints;
}

public void setWaypoints(List<Waypoint> waypoints) {
this.waypoints = waypoints;
}

}