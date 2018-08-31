package sg.edu.rp.c346.kotlinyoutubelbta

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.video_row.view.*

/**
 * Created by 15017103 on 1/3/2018.
 */

class MainAdapter(val homeFeed: MainActivity.HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {

    val videoTitles = listOf("First title", "Second", "3rd", "MOOOOORE TITLE")

    // numberOfItems
    override fun getItemCount(): Int {
        return homeFeed.videos.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder{
        // how do we even create a view
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow= layoutInflater.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
//        val videoTitle = videoTitles.get(position)
        val video = homeFeed.videos.get(position)
        holder?.view?.textView_video_title?.text = video.name

        holder?.view?.textView_channel_name?.text = video.channel.name
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}