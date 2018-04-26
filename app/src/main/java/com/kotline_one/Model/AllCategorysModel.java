package com.kotline_one.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllCategorysModel {

@SerializedName("status")
@Expose
private String status;
@SerializedName("data")
@Expose
private List<Datum> data = null;
@SerializedName("msg")
@Expose
private String msg;

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public List<Datum> getData() {
return data;
}

public void setData(List<Datum> data) {
this.data = data;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

}
