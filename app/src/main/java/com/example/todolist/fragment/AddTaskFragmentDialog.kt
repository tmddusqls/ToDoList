package com.example.todolist.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.GridView
import android.widget.ImageButton
import androidx.fragment.app.DialogFragment
import com.example.todolist.R
import com.example.todolist.adapter.GridViewAdapter

class AddTaskFragmentDialog : DialogFragment() {

    val colors = arrayListOf(
        (R.color.red),
        (R.color.pink),
        (R.color.yellow),
        (R.color.green),
        (R.color.blue),
        (R.color.grey),
    )

    private lateinit var backBtn: ImageButton
    private lateinit var checkBtn: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.setCancelable(false);

        val rootView = inflater.inflate(R.layout.fragment_add_task_dialog, container, false)

        val gridView: GridView = rootView.findViewById(R.id.gv_colorPicker_addTask)
        val adapter = GridViewAdapter(rootView.context ,colors)

        gridView.adapter = adapter


        backBtn = rootView.findViewById(R.id.ib_back_addTask)
        checkBtn = rootView.findViewById(R.id.ib_finish_addTask)

        backBtn.setOnClickListener {
            dismiss()
        }
        checkBtn.setOnClickListener {
            dismiss()
        }


        return rootView
    }

}