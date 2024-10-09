package com.example.homework3.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Reminders(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
