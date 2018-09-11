package testaBanco;

import banco.AtualizadorDeContas;
import banco.Banco;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		Banco bb = new Banco(10);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		bb.adiciona(c);
		bb.adiciona(cp);
		bb.adiciona(cc);
		
		for(int i = 0; i < bb.getTotalDeContas(); i++) {
			Conta test = bb.getConta(i);
			adc.roda(test);
		}

	}

}
