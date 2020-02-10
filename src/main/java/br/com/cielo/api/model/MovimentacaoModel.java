package br.com.cielo.api.model;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;
import br.com.cielo.api.entity.MovimentacaoEntity;

public class MovimentacaoModel {

	public MovimentacaoEntity obterDados() {
		String result = lerArquivo("lancamento-conta-legado.json");
		Gson gson = new Gson();

		return gson.fromJson(result, MovimentacaoEntity.class);
	}	

	private String lerArquivo(String arquivo){

		String result="";

		ClassLoader classLoader = getClass().getClassLoader();
		try {
			result = IOUtils.toString(classLoader.getResourceAsStream(arquivo));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}
