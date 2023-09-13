package com.jsw.r2c.presentation.screens.dashboard.role.gatekeeper

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun GkNotificationScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Notification")
    }

}