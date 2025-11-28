package com.example.tablero_basket_;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.tablero_basket_.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {

    private ActivityScoreBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // config DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_score);

        // puntuaciones
        int localScore = getIntent().getIntExtra("localScore", 0);
        int visitorScore = getIntent().getIntExtra("visitorScore", 0);

        // actualizar el marcador final
        updateScoreDisplay(localScore, visitorScore);
    }

    private void updateScoreDisplay(int localScore, int visitorScore) {
        String finalScoreText = localScore + " - " + visitorScore;
        String winnerMessage = determineWinner(localScore, visitorScore);

        // actualiza el marcador y el mensaje del ganador
        binding.tvFinalScore.setText(finalScoreText);
        binding.tvWinner.setText(winnerMessage);
    }

    private String determineWinner(int localScore, int visitorScore) {
        // determina quién ha ganado o si fue empate
        if (localScore > visitorScore) {
            return "Ha ganado el equipo LOCAL";
        } else if (visitorScore > localScore) {
            return "Ha ganado el equipo VISITANTE";
        } else {
            return "Empate";
        }
    }
}
