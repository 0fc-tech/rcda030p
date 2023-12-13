package com.eniecole.enishop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.eniecole.enishop.bo.Article
import com.eniecole.enishop.dao.ArticleRepository
import com.eniecole.enishop.databinding.FragmentListeArticleBinding
import java.time.LocalDateTime


class ListeArticleFragment : Fragment() {

    private lateinit var binding: FragmentListeArticleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListeArticleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonToDetail.setOnClickListener {
            findNavController().navigate(R.id.action_listeArticleFragment_to_detailArticleFragment)
        }
        val mbp2023 = Article(0L,
            "MBP 16pouces",
            "Ordinateu très cher",
            4000.0,
            "https",
            LocalDateTime.now()
        )
        ArticleRepository.addArticle(mbp2023)
        binding.textViewListeArticles.text = ArticleRepository.getAllArticle().toString()
    }

}