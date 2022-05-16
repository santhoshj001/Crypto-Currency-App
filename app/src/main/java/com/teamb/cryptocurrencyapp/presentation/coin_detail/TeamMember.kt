package com.teamb.cryptocurrencyapp.presentation.coin_detail

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teamb.cryptocurrencyapp.data.remote.dto.TeamMember
import com.teamb.cryptocurrencyapp.ui.theme.Typography

@Composable
fun TeamMemberItem(
    teamMember: TeamMember, modifier: Modifier
) {
    Column(
        modifier = modifier
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
        )
        Text(
            text = teamMember.name,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            style = Typography.bodyLarge,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp)
        )
        Text(
            text = teamMember.position,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            style = Typography.labelSmall,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
        )
    }
}

@Preview
@Composable
fun previewTeamMember() {
    TeamMemberItem(
        teamMember = TeamMember(id = "", name = "santhosh", position = "Android Dev"),
        Modifier.fillMaxWidth()
    )
}