package com.example.actor_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Actor3Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_actor3, container, false)

        val items = mutableListOf<String>()
        items.add("드림하이")
        items.add("해를 품은 달")
        items.add("사이코지만 괜찮아")
        items.add("은밀하게 위대하게")
        items.add("별에서 온 그대")
        items.add("프로듀사")
        items.add("어느 날")
        items.add("도둑들")
        items.add("크리스마스에 눈이 올까요?")
        items.add("자이언트")
        items.add("정글피쉬")
        items.add("호텔 델루나")
        items.add("사랑의 불시착")
        items.add("수상한 그녀")

        val rv = view.findViewById<RecyclerView>(R.id.workRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val actor2 = view.findViewById<ImageView>(R.id.actor2)
        actor2.setOnClickListener {
            it.findNavController().navigate(R.id.action_actor3Fragment_to_actor2Fragment)
        }
        val actor1 = view.findViewById<ImageView>(R.id.actor1)
        actor1.setOnClickListener {
            it.findNavController().navigate(R.id.action_actor3Fragment_to_actor1Fragment)
        }

        return view
    }

}