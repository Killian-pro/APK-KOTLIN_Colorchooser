package com.example.random_color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        random();
        choose();
    }

    fun random() {
        val btn_click_me = findViewById(R.id.button) as Button
        val back = findViewById(R.id.BACK) as View
        val text = findViewById(R.id.textView) as TextView
        val BLUE = findViewById(R.id.seekBar) as SeekBar
        val GREEN = findViewById(R.id.seekBar2) as SeekBar
        val RED = findViewById(R.id.seekBar3) as SeekBar


        btn_click_me.setOnClickListener {
            val bleu = (0..255).random()
            val vert = (0..255).random()
            val rouge = (0..255).random()
            val macolor = Color.rgb(
                bleu ,
                vert ,
                rouge
            )
            back.setBackgroundColor(macolor);
            if (macolor > -5000000) {
                //text.setText(macolor.toString());
                text.setTextColor(Color.BLACK);
            } else {
                text.setTextColor(Color.WHITE);
            }
            val macolordet = macolor.toUInt().toString(16)
            text.setText("#" + macolordet.removePrefix("ff").toUpperCase());

            RED.setProgress(rouge);
            GREEN.setProgress(vert);
            BLUE.setProgress(bleu);
        
        }

    }

    fun choose() {
        val back = findViewById(R.id.BACK) as View
        val BLUE = findViewById(R.id.seekBar) as SeekBar
        val GREEN = findViewById(R.id.seekBar2) as SeekBar
        val RED = findViewById(R.id.seekBar3) as SeekBar
        val text = findViewById(R.id.textView) as TextView

        BLUE?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                BLUE: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val macolor = Color.rgb(
                    RED.getProgress(),
                    BLUE.getProgress(),
                    GREEN.getProgress()

                )
                if (macolor > -5000000) {
                    //text.setText(macolor.toString());
                    text.setTextColor(Color.BLACK);
                } else {
                    text.setTextColor(Color.WHITE);
                }
                back.setBackgroundColor(macolor);
                val macolordet = macolor.toUInt().toString(16)
                text.setText("#" + macolordet.removePrefix("ff").toUpperCase());
            }

            override fun onStartTrackingTouch(BLUE: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(BLUE: SeekBar) {

            }
        })

        RED?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                RED: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val macolor = Color.rgb(
                    RED.getProgress(),
                    BLUE.getProgress(),
                    GREEN.getProgress()

                )
                if (macolor > -5000000) {
                    //text.setText(macolor.toString());
                    text.setTextColor(Color.BLACK);
                } else {
                    text.setTextColor(Color.WHITE);
                }
                back.setBackgroundColor(macolor);
                val macolordet = macolor.toUInt().toString(16)
                text.setText("#" + macolordet.removePrefix("ff").toUpperCase());
            }

            override fun onStartTrackingTouch(BLUE: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(BLUE: SeekBar) {

            }
        })

        GREEN?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                GREEN: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val macolor = Color.rgb(
                    RED.getProgress(),
                    BLUE.getProgress(),
                    GREEN.getProgress()

                )
                if (macolor > -5000000) {
                    //text.setText(macolor.toString());
                    text.setTextColor(Color.BLACK);
                } else {
                    text.setTextColor(Color.WHITE);
                }
                back.setBackgroundColor(macolor);
                val macolordet = macolor.toUInt().toString(16)
                text.setText("#" + macolordet.removePrefix("ff").toUpperCase());
            }

            override fun onStartTrackingTouch(BLUE: SeekBar) {
                // write custom code for progress is started
            }

            override fun onStopTrackingTouch(BLUE: SeekBar) {

            }
        })
    }
}

