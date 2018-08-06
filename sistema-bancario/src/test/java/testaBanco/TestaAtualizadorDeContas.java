package testaBanco;

import banco.AtualizadorDeContas;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1234);
		cc.deposita(1234);
		cp.deposita(1234);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		
		System.out.println("Saldo total: "+adc.getSaldoTotal());

	}

}
