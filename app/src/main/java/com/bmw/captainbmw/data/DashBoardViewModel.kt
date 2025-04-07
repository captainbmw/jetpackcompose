package com.bmw.captainbmw.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.bmw.captainbmw.model.DashBoardStat
import com.bmw.captainbmw.model.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashBoardViewModel:ViewModel(){
    val _stats= MutableStateFlow(
        listOf(
            DashBoardStat("Revenue","12000", Icons.Default.Phone, Color.Magenta),
            DashBoardStat("User","1456",Icons.Default.Person, Color.Cyan)
        )
    )
    val stats:StateFlow<List<DashBoardStat>>get() = _stats
    private val _quickAction= MutableStateFlow(
        listOf(
            QuickAction("Add new user",Icons.Default.Person),
            QuickAction("Generate Report",Icons.Default.AccountCircle),
            QuickAction("setting",Icons.Default.Settings)
        )
    )
    val quickAction:StateFlow<List<QuickAction>>get() = _quickAction
}