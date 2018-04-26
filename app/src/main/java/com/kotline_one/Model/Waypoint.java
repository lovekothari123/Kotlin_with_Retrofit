package com.kotline_one.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Waypoint {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("waypoint_id")
@Expose
private String waypointId;
@SerializedName("name")
@Expose
private String name;
@SerializedName("desc")
@Expose
private Object desc;
@SerializedName("address")
@Expose
private String address;
@SerializedName("lat")
@Expose
private Double lat;
@SerializedName("longg")
@Expose
private Double longg;
@SerializedName("lat_degree")
@Expose
private String latDegree;
@SerializedName("longg_degree")
@Expose
private String longgDegree;
@SerializedName("category")
@Expose
private Integer category;
@SerializedName("state")
@Expose
private String state;
@SerializedName("country")
@Expose
private String country;
@SerializedName("email")
@Expose
private String email;
@SerializedName("phone")
@Expose
private Integer phone;
@SerializedName("postal_code")
@Expose
private String postalCode;
@SerializedName("pulsing")
@Expose
private Integer pulsing;
@SerializedName("additional_info")
@Expose
private String additionalInfo;
@SerializedName("expire_date")
@Expose
private String expireDate;
@SerializedName("never_expire")
@Expose
private Integer neverExpire;
@SerializedName("status")
@Expose
private Integer status;
@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("updated_at")
@Expose
private String updatedAt;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getWaypointId() {
return waypointId;
}

public void setWaypointId(String waypointId) {
this.waypointId = waypointId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Object getDesc() {
return desc;
}

public void setDesc(Object desc) {
this.desc = desc;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public Double getLat() {
return lat;
}

public void setLat(Double lat) {
this.lat = lat;
}

public Double getLongg() {
return longg;
}

public void setLongg(Double longg) {
this.longg = longg;
}

public String getLatDegree() {
return latDegree;
}

public void setLatDegree(String latDegree) {
this.latDegree = latDegree;
}

public String getLonggDegree() {
return longgDegree;
}

public void setLonggDegree(String longgDegree) {
this.longgDegree = longgDegree;
}

public Integer getCategory() {
return category;
}

public void setCategory(Integer category) {
this.category = category;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public Integer getPhone() {
return phone;
}

public void setPhone(Integer phone) {
this.phone = phone;
}

public String getPostalCode() {
return postalCode;
}

public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

public Integer getPulsing() {
return pulsing;
}

public void setPulsing(Integer pulsing) {
this.pulsing = pulsing;
}

public String getAdditionalInfo() {
return additionalInfo;
}

public void setAdditionalInfo(String additionalInfo) {
this.additionalInfo = additionalInfo;
}

public String getExpireDate() {
return expireDate;
}

public void setExpireDate(String expireDate) {
this.expireDate = expireDate;
}

public Integer getNeverExpire() {
return neverExpire;
}

public void setNeverExpire(Integer neverExpire) {
this.neverExpire = neverExpire;
}

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public String getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

}