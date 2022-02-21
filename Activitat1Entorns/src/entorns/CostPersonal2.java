package entorns;

import java.util.ArrayList;
import java.util.Collection;

public class CostPersonal2 {

	private static final int NUMERO20 = 20;

	static float CostDelPersonal(Treballador treballadors[]) {
		float costFinal = 0;
		Treballador treballador;
		for (int i = 0; i < treballadors.length; i++) {
			treballador = treballadors[i];
			costFinal = extracted(costFinal, treballador);
		}
		return costFinal;
	}

	private static float extracted(float costFinal, Treballador treballador) {
		if (treballador.getTipusTreballador() == Treballador.DIRECTOR
				|| treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
			costFinal += treballador.getNomina();
		} else {
			costFinal += treballador.getNomina() + (treballador.getHoresExtres() * NUMERO20);
		}
		return costFinal;
	}
}
