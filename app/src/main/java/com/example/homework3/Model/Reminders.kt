package com.example.homework3.Model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Reminders(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
