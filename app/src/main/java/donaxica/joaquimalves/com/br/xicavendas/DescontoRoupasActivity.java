package donaxica.joaquimalves.com.br.xicavendas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DescontoRoupasActivity extends AppCompatActivity {

    TextView msg;
    EditText preco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_roupas);

        msg = (TextView) findViewById(R.id.text_valor_roupa);
        String texto = msg.getText().toString();

    }

    public void calcularDesconto(View view) {

        preco = (EditText) findViewById(R.id.valor_preco);
        String numero = preco.getText().toString();

        double valor = Double.parseDouble(numero);

        if (valor >= 50) {
            double desconto = valor * 0.1;
            valor -= desconto;
            msg.setText(" "+valor);
        } else {
            msg.setText("Essa peça não Recebe Desconto!");
        }
    }

}
