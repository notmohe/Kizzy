package com.my.kizzy.ui.screen.settings.style

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import me.rerere.md3compat.ThemeChooser

@Composable
fun Appearance(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        ThemeChooser()
    }
}