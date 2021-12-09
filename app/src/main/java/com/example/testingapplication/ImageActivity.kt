package com.example.testingapplication

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        val mImageView = findViewById<ImageView>(R.id.imageViewMatch)

        val extras = intent
        if (extras != null) {
            val imageUri: Uri? = extras.getParcelableExtra("image_id")
            mImageView.setImageURI(imageUri)
        }
    }
}