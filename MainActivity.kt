package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private var lvNavList: ListView? = null
    private var flContainer: FrameLayout? = null
    private var dlDrawerLayout: DrawerLayout? = null
    private var btn: Button? = null
    private var isAll: Boolean? = false
    private var allState: Boolean? = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a BaseAdapter instance.
//        val customBaseAdapter: BaseAdapter = object : BaseAdapter() {
//            // Return list view item count.
//            override fun getCount(): Int {
//                return 4
//            }
//
//            override fun getItem(i: Int): Any? {
//                return null
//            }
//
//            override fun getItemId(i: Int): Long {
//                return 0
//            }
//
//            override fun getView(itemIndex: Int, itemView: View?, viewGroup: ViewGroup?): View? {
//                var itemView2: View? = itemView
//                if (itemView2 == null) { // First inflate the RelativeView object.
//                    itemView2 = LayoutInflater.from(this@MainActivity).inflate(null, null)
//                }

//                val titleView = itemView!!.findViewById(R.id.textView) as TextView
//                if (0 == itemIndex) {
//                    titleView.text = "All"
//                } else if (1 == itemIndex) {
//                    titleView.text = "1"
//                } else if (2 == itemIndex) {
//                    titleView.text = "2"
//                } else if (3 == itemIndex) {
//                    titleView.text = "3"
//                }
//
//                val lableView = itemView.findViewById(R.id.lableView) as TextView
//                lableView.text = "OFF"
//
//                return itemView
//            }
//        }
//
//
        lvNavList = findViewById(R.id.lv_activity_main_nav_list) as ListView

//        // Set the custom base adapter to it.
//        lvNavList!!.adapter = customBaseAdapter

//        flContainer = findViewById(R.id.fl_activity_main_container) as FrameLayout


        dlDrawerLayout = findViewById(R.id.dl_activity_main_drawerlayout) as DrawerLayout
        btn = findViewById(R.id.btn) as Button
        btn!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                dlDrawerLayout?.openDrawer(lvNavList!!)
            }
        })
//
//
//        lvNavList?.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
//            val lableView = view.findViewById(R.id.lableView) as TextView
//            if (0 == position) {
//                if (lableView.text == "OFF") {
//                    lableView.text = "ON"
//
//                    lvNavList!!.performItemClick(lvNavList!!.getChildAt(1), 1, lvNavList!!.getChildAt(1).id.toLong())
//                    lvNavList!!.performItemClick(lvNavList!!.getChildAt(2), 2, lvNavList!!.getChildAt(2).id.toLong())
//                    lvNavList?.performItemClick(lvNavList!!.getChildAt(3), 3, lvNavList!!.getChildAt(3).id.toLong())
//                } else if (lableView.text == "ON") {
//                    lableView.text = "OFF"
//
//                    lvNavList!!.performItemClick(lvNavList!!.getChildAt(1),1, lvNavList!!.getChildAt(1).id.toLong())
//                    lvNavList!!.performItemClick(lvNavList!!.getChildAt(2), 2, lvNavList!!.getChildAt(2).id.toLong())
//                    lvNavList!!.performItemClick(lvNavList!!.getChildAt(3), 3, lvNavList!!.getChildAt(3).id.toLong())
//                }
//            } else if (1 == position) {
//                if (lableView.text == "OFF") {
//                    lableView.text = "ON"
//                } else if (lableView.text == "ON") {
//                    lableView.text = "OFF"
//                }
//            } else if (2 == position) {
//                if (lableView.text == "OFF") {
//                    lableView.text = "ON"
//                } else if (lableView.text == "ON") {
//                    lableView.text = "OFF"
//                }
//            } else if (3 == position) {
//                if (lableView.text == "OFF") {
//                    lableView.text = "ON"
//                } else if (lableView.text == "ON") {
//                    lableView.text = "OFF"
//                }
//            }
//            //                dlDrawerLayout.closeDrawer(lvNavList);
//        })
    }
}
