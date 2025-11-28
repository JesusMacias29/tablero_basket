package com.example.tablero_basket_;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tablero_basket_.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private int localScore = 0;
    private int visitorScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // dataBinding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // configuración botones de puntuación del equipo local
        binding.btnLocalPlus1.setOnClickListener(v -> updateScore(true, 1));
        binding.btnLocalPlus2.setOnClickListener(v -> updateScore(true, 2));
        binding.btnLocalMinus1.setOnClickListener(v -> updateScore(true, -1));

        // configuración botones de puntuación del equipo visitante
        binding.btnVisitorPlus1.setOnClickListener(v -> updateScore(false, 1));
        binding.btnVisitorPlus2.setOnClickListener(v -> updateScore(false, 2));
        binding.btnVisitorMinus1.setOnClickListener(v -> updateScore(false, -1));

        // configuración del botón de reset
        binding.btnReset.setOnClickListener(v -> resetScores());

        // configuración del botón para ir a ScoreActivity
        binding.btnShowResult.setOnClickListener(v -> openScoreActivity());
    }

    private void updateScore(boolean isLocal, int delta) {
        if (isLocal) {
            // actualiza la puntuación del equipo local
            localScore = Math.max(0, localScore + delta); // No permitir puntuaciones negativas
            binding.tvLocalScore.setText(String.valueOf(localScore));
        } else {
            // actualiza la puntuación del equipo visitante
            visitorScore = Math.max(0, visitorScore + delta); // No permitir puntuaciones negativas
            binding.tvVisitorScore.setText(String.valueOf(visitorScore));
        }
    }

    private void resetScores() {
        // reinicia las puntuaciones
        localScore = 0;
        visitorScore = 0;
        binding.tvLocalScore.setText("0");
        binding.tvVisitorScore.setText("0");
    }

    private void openScoreActivity() {
        // pasa a la actividad de resultados
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra("localScore", localScore);
        intent.putExtra("visitorScore", visitorScore);
        startActivity(intent);
    }
}
