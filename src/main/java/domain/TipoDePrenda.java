package domain;

import domain.enums.Categoria;

public class TipoDePrenda {

	Categoria categoria;

	public TipoDePrenda(Categoria categoria) {
		this.categoria = categoria;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	TipoDePrenda BOTAS                     = new TipoDePrenda(Categoria.CALZADO);
	TipoDePrenda ZAPATILLAS_CONVERSE       = new TipoDePrenda(Categoria.CALZADO);
	TipoDePrenda CROCS                     = new TipoDePrenda(Categoria.CALZADO);

	TipoDePrenda MUSCULOSA                 = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
	TipoDePrenda REMERA_MANGAS_CORTAS      = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
	TipoDePrenda REMERA_MANGAS_LARGAS      = new TipoDePrenda(Categoria.PARTE_SUPERIOR);

	TipoDePrenda PANTALON_REGALADO         = new TipoDePrenda(Categoria.PARTE_INFERIOR);
	TipoDePrenda PANTALON                  = new TipoDePrenda(Categoria.PARTE_INFERIOR);
	TipoDePrenda POLLERA                   = new TipoDePrenda(Categoria.PARTE_INFERIOR);

	TipoDePrenda ANTEOJOS_DE_SOL           = new TipoDePrenda(Categoria.ACCESORIO);
	TipoDePrenda PAÑUELO                   = new TipoDePrenda(Categoria.ACCESORIO);

}
