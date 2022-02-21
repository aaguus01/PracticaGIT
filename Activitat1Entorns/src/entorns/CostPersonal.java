package entorns;

import java.util.ArrayList;
import java.util.Collection;

public class CostPersonal {

	private static final int numeroCons = 20;
	int agus = 0;

	static float CostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;

		int suma = costFinal += treballador.getNomina();

		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];

			costFinal = dosUno(costFinal, treballador);
		}
		return costFinal;
	}

	private static float dosUno(float costFinal, Treballador treballador) {
		if (treballador.getTipusTreballador() == Treballador.DIRECTOR
				|| treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
			costFinal += treballador.getNomina();
		} else {
			costFinal += treballador.getNomina() + (treballador.getHoresExtres() * numeroCons);
		}
		return costFinal;
	}
}
