package donaxica.joaquimalves.com.br.xicavendas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonDescontosRoupas(View view) {
        startActivity(new Intent(this, DescontoRoupasActivity.class));
    }

    public void buttonDescontoEspecial(View view) {
        startActivity(new Intent(this, DescontoEspecialActivity.class));
    }
}
