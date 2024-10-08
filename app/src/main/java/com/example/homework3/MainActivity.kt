package com.example.homework3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homework3.Data.DataSource
import com.example.homework3.ui.theme.Homework3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReminderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ReminderApp()
                }
            }
        }
    }
}

@Composable
fun ReminderApp() {

}

@Composable
fun ReminderList(planetList: List<Reminders>, modifier: Modifier = Modifier) {

}

@Composable
fun ReminderCard(reminder: Reminder, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = reminder.imageResourceId),
                contentDescription = stringResource(id = reminder.stringResourceId)
            )
            Text(
                text = stringResource(id = reminder.stringResourceId)
                        modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Image(
                painter = painterResource(id = affirmation.imageResourceId),
                contentDescription = stringResource(affirmation.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
                    .background(Color.Black),
    }
}

@Preview
@Composable
fun ReminderCardPreview() {
    // Call PlanetCard and pass in first planet as sample data to preview
    ReminderCard(reminder = DataSource.Reminders[0])
}