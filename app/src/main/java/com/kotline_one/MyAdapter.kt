//import android.support.v7.widget.RecyclerView
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import com.kotline_one.R
//
//class MyAdapter(var objectarr: ArrayList<String>,var function: () -> Unit) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
//
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
//        var v = LayoutInflater.from(parent.context).inflate(R.layout.lsat_of_ayy,parent,false)
//        return ViewHolder(v)
//
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun getItemCount(): Int {
//        return objectarr.size
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
//        holder.fd.setText(objectarr.get(position).toString())
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    class ViewHolder(itemVieww: View) : RecyclerView.ViewHolder(itemVieww) {
//
//        lateinit var fd:TextView
//
//        init {
//            fd = itemVieww.findViewById(R.id.text_of_arry_TV);
//        }
//
//
//    }
//
//
//
//
//
//}
