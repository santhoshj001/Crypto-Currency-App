package com.teamb.cryptocurrencyapp.domain.model

import com.teamb.cryptocurrencyapp.data.remote.dto.Tag
import com.teamb.cryptocurrencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val desc: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
