package dz.selma.calculator.calcul.service;

import dz.selma.calculator.calcul.domain.model.CalculationModel;

public interface CalculatorService {
	/**
	 * Effectuer le calcul demandé par un modèle
	 * 
	 * @param Modèle de calcul
	 * @return Modèle de calcul rempli du résultat 
	 */
	public CalculationModel calculate(CalculationModel calculationModel);
}
