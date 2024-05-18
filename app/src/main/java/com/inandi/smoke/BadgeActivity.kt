/**
 * This file is part of Quit Smoking Android.
 *
 * Author: Gobinda Nandi
 * Created: 2024
 *
 * Copyright (c) 2024 Gobinda Nandi
 * This software is released under the MIT License.
 * See the LICENSE file for details.
 */

package com.inandi.smoke

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.inandi.smoke.ui.theme.SmokeTheme
import android.widget.TextView
import android.widget.Button
import android.view.View
import android.widget.ImageButton
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.content.SharedPreferences
import android.content.Intent

class BadgeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_badge)

        val aboutButton = findViewById<ImageButton>(R.id.aboutButton)
        aboutButton.setOnClickListener {
            startActivity(Intent(this@BadgeActivity, AboutActivity::class.java))
        }

        val homeButton = findViewById<ImageButton>(R.id.homeButton)
        homeButton.setOnClickListener {
            startActivity(Intent(this@BadgeActivity, MainActivity::class.java))
        }

    }
}