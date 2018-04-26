package com.kotline_one

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.kotline_one.Model.AllCategorysModel
import com.kotline_one.Model.Datum
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var context: Context
    lateinit var textView: TextView
  lateinit var Intent1: Intent
     var objectarr: ArrayList<Datum> = arrayListOf()
    lateinit var RecyclerviewOne:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = applicationContext

         var textView:TextView = findViewById(R.id.textzviewActivtyOne) as TextView
        textView.setText("World Helloo")

        RecyclerviewOne = findViewById(R.id.RecycleView_one)
        RecyclerviewOne.layoutManager =  LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        RecyclerviewOne.setHasFixedSize(true)

        var bution = findViewById<Button>(R.id.buttionone) as Button
        bution.setOnClickListener {
            Log.d("mytag","CliclHua");
             Intent1 = Intent(applicationContext,Main2Activity::class.java)
            Intent1.putExtra("First","My Name is khan and i am not a .......,.")
            startActivity(Intent1)
        }


        DefintArray()
        RestClintApi()
    }

    private fun RestClintApi() {


        //TODO Add Intercepter
             var interceptor = HttpLoggingInterceptor()
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client = OkHttpClient().newBuilder()
                client.addInterceptor(interceptor)


        //TODO CAlling Retrofit

        val retrofit = Retrofit.Builder()
                .baseUrl("http://smartstops.ca/")
                .client(client.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()


    var apiInterface =retrofit.create(ApiInterface::class.java)
        var call:Call<AllCategorysModel> = apiInterface.responeApiInterface

        call.enqueue(object: Callback<AllCategorysModel> {
            override fun onFailure(call: Call<AllCategorysModel>?, t: Throwable?) {


                if (t != null) {
                    t.printStackTrace()
                }
            }

            override fun onResponse(call: Call<AllCategorysModel>?, response: Response<AllCategorysModel>?) {

                var allmodels:AllCategorysModel

                if (response != null) {
                    allmodels = response.body()!!

                    objectarr = response.body()!!.data as ArrayList<Datum>

                    Log.d("mytag","Respons3e=?"+allmodels.msg)
                    Log.d("myta","All_inserted data==>"+objectarr.get(0).name)

                    Log.d("mytag","PrintArrayList"+objectarr.size)

                    RecyclerviewOne.adapter = MyAdapterOne(objectarr,context)

                }

                   response.toString();
            }

        })








    }

    private fun DefintArray() {
        Log.d("mytag","FuncationCall")
//        objectarr.add("love1")
//        objectarr.add("love2")
//        objectarr.add("love3")
//        objectarr.add("love4")
//        objectarr.add("love5")
//        objectarr.add("love6")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love7")
//        objectarr.add("love25")


//        Log.d("mytag","PrintArrayList"+objectarr.size)
//        for(i in 0.. objectarr.size-1){
//            Log.d("mytag","PrintArrayList_values==>"+objectarr.get(i))
//
//        }
//        RecyclerviewOne.adapter = MyAdapterOne(objectarr,context)



    }


}




