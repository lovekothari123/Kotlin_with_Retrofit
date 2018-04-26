package com.kotline_one

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.kotline_one.Model.Datum

class MyAdapterOne(var objectarr: ArrayList<Datum>, var context: Context) : RecyclerView.Adapter<MyAdapterOne.ViewHolder>() {

lateinit var intent: Intent

    override fun getItemCount(): Int {
       return objectarr.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyAdapterOne.ViewHolder, position: Int) {
        if (holder != null) {
            Log.d("mytag","Inside Adapter==>"+objectarr.get(position).name)
            holder.text.setText(objectarr.get(position).name)

        }
        if (holder != null) {
            holder.itemView.setOnClickListener {
                Log.d("mytag","Postion==>"+position+"==>"+objectarr.get(position).toString())
                Toast.makeText(context,objectarr.get(position).toString(),Toast.LENGTH_LONG).show()

                 intent = Intent(context,Main2Activity::class.java)
                intent.putExtra("First",objectarr.get(position).toString())
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK )
                context.startActivity(intent)

            }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterOne.ViewHolder {
                  var  v = LayoutInflater.from(parent.context).inflate(R.layout.lsat_of_ayy,parent,false)
                    return ViewHolder(v)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView) {
        var text:TextView

        init {
                text = itemView.findViewById(R.id.text_of_arry_TV)
        }

    }


}

