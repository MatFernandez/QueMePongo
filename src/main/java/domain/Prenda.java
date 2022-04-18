package domain;

import domain.enums.Material;

public class Prenda {

	TipoDePrenda tipoDePrenda;
	Material material;
	Color colorPrincipal;
	Color colorSecundario;

	public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario) {

		if (tipoDePrenda == null || tipoDePrenda.categoria == null || material == null || colorPrincipal == null) {
			throw new ParametrosNulosEnLaPrendaException();
		}

		this.tipoDePrenda = tipoDePrenda;
		this.material = material;
		this.colorPrincipal = colorPrincipal;
		this.colorSecundario = colorSecundario;
	}

}
