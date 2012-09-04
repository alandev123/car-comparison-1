package vehicle;

import powersource.PowerSource;

/**
 * Our vehicle interface
 * @author Sean
 *
 */
public interface Vehicle {

	
	String getName();
	String getMake();
	String getModel();
	String getTrim();
	
	PowerSource[] getPowersources();
	
	//String getType(); //TODO: Add type later, not sure how we want to define these
	
	double getYearlyInsuranceCost();
	double getYearlyMaintanceCost();
	
	
}
