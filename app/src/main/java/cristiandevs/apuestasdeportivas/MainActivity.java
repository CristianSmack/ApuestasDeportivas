package cristiandevs.apuestasdeportivas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import cristiandevs.apuestasdeportivas.UI.EstadisticasActivity;

public class MainActivity extends AppCompatActivity {
    ImageView banner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Activity a pantalla completa
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Escondemos la Action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.estadisticas);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EstadisticasActivity.class));
            }
        });

        banner = findViewById(R.id.banner);

        Picasso.get().load(R.drawable.inicio).into(banner);
    }
}
