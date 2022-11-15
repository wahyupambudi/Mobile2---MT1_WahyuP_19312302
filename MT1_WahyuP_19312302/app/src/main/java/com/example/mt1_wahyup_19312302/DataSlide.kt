package com.example.mt1_wahyup_19312302

import androidx.compose.ui.graphics.Color
import com.example.mt1_wahyup_19312302.ui.theme.ColorBlue

data class DataSlide(
    val image: Int, val title: String,
    val desc: String,
    val backgroundColor: Color,
    val mainColor: Color = ColorBlue
)
