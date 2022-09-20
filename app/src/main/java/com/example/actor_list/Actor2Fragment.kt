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

class Actor2Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_actor2, container, false)

        val items = mutableListOf<String>()
        items.add("늑대소년")
        items.add("빈센조")
        items.add("태양의 후예")
        items.add("아스달 연대기")
        items.add("세상 어디에도 없는 착한 남자")
        items.add("뿌리깊은 나무")
        items.add("승리호")
        items.add("마음이2")
        items.add("군함도")
        items.add("티끌모아 로맨스")
        items.add("이태원 살인사건")
        items.add("산부인과")
        items.add("성균관 스캔들")
        items.add("보고타")

        val rv = view.findViewById<RecyclerView>(R.id.workRv)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        val actor1 = view.findViewById<ImageView>(R.id.actor1)
        actor1.setOnClickListener {
            it.findNavController().navigate(R.id.action_actor2Fragment_to_actor1Fragment)
        }
        val actor3 = view.findViewById<ImageView>(R.id.actor3)
        actor3.setOnClickListener {
            it.findNavController().navigate(R.id.action_actor2Fragment_to_actor3Fragment)
        }

        return view
    }
}