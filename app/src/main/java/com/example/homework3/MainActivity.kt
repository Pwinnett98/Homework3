package com.example.homework3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homework3.data.DataSource
import com.example.homework3.model.Reminders
import com.example.homework3.ui.theme.ReminderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

@Preview
@Composable
fun ReminderApp() {
    ReminderList(DataSource.Reminders)
}

@Composable
fun ReminderList(reminderList: List<Reminders>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(reminderList) {Reminders ->
            ReminderCard(
                reminders = Reminders,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun ReminderCard(reminders: Reminders, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = reminders.imageResourceId),
                contentDescription = stringResource(id = reminders.stringResourceName),
                ContentDescription = stringResource(id = reminders.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp)
                    .background(Color.Black),
            )
            Text(
                text = stringResource(id = reminders.stringResourceName),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview
@Composable
fun ReminderCardPreview() {
    ReminderCard(reminders = DataSource.Reminders[0])
}
