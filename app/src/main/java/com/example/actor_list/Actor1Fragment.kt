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

class Actor1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_actor1, container, false)

        val items = mutableListOf<String>()
        items.add("오월의 청춘")
        items.add("18어게인")
        items.add("멜랑꼴리아")
        items.add("스카우팅 리포트")
        items.add("스위트홈")
        items.add("호텔 델루나")
        items.add("슬기로운 감빵생활")
        items.add("일단 뜨겁게 청소하라!!")
        items.add("서른이지만 열일곱입니다")
        items.add("괴물")
        items.add("위대한 쇼")
        items.add("파묘")
        items.add("더 글로리")
        items.add("나쁜 엄마")
        
        val rv = view.findViewById<RecyclerView>(R.id.workRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)
        
        val actor2 = view.findViewById<ImageView>(R.id.actor2)
        actor2.setOnClickListener {
            it.findNavController().navigate(R.id.action_actor1Fragment_to_actor2Fragment)
        }
        val actor3 = view.findViewById<ImageView>(R.id.actor3)
        actor3.setOnClickListener {
            it.findNavController().navigate(R.id.action_actor1Fragment_to_actor3Fragment)
        }

        return view
    }
}