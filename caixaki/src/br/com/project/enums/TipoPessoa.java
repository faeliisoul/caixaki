package br.com.project.enums;

public enum TipoPessoa {

	TIPO_PESSOA_FISICA("Física"), TIPO_PESSOA_JURIDICA("Jurídica");

	private String tipo = "";

	private TipoPessoa(String tipo) {
		this.tipo = tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return getTipo();
	}

	public static TipoPessoa[] getValuePadraoJuridica() {
		return new TipoPessoa[] { TIPO_PESSOA_JURIDICA,
				TIPO_PESSOA_FISICA };
	}

	public static TipoPessoa[] getValuePadraoFisica() {
		return new TipoPessoa[] {TIPO_PESSOA_FISICA,
				TIPO_PESSOA_JURIDICA };
	}

}
